package raj.nishant.interviewbitclone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import raj.nishant.interviewbitclone.Dto.ResponseDto;
import raj.nishant.interviewbitclone.Model.User;
import raj.nishant.interviewbitclone.Service.UserService;
import raj.nishant.interviewbitclone.Utils.Constants;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINTS)
public class UserController {
    @Autowired
    private UserService UserService;
    @PostMapping
    public User createuser(@RequestBody User user)
  {
      return UserService.createuser(user);
  }
  @GetMapping("{id}")
  public ResponseDto<User> getuser(@PathVariable(name="id") UUID id)
  {
      User serviceResponse = UserService.getUser(id);
      if(serviceResponse==null)
          return new ResponseDto<>(HttpStatus.NOT_FOUND,serviceResponse);
      else
          return new ResponseDto<>(HttpStatus.FOUND,UserService.getUser(id));
  }
}
