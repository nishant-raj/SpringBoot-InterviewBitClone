package raj.nishant.interviewbitclone.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raj.nishant.interviewbitclone.Model.User;
import raj.nishant.interviewbitclone.Repositiory.UserRepositiory;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepositiory UserRepositiory;
    public User createuser(User user)
    {
        return UserRepositiory.createuser(user);
    }

    public User getUser(UUID id) {
        Optional<User> foundUser=UserRepositiory.getUserById(id);
        if(foundUser.isEmpty())
            return null;
        else
            return foundUser.get();
    }
}
