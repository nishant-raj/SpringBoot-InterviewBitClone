package raj.nishant.interviewbitclone.Repositiory;
import org.springframework.stereotype.Repository;
import raj.nishant.interviewbitclone.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositioryImpl implements UserRepositiory{
    private List<User> userDatabase = new ArrayList<>();
    @Override
    public User createuser(User user) {
        User createuser = new User(user.getName(),user.getGender());
        userDatabase.add(createuser);
        return createuser;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
         return userDatabase.stream().filter(user -> user.getUuid().equals(id)).findFirst();

    }

}
