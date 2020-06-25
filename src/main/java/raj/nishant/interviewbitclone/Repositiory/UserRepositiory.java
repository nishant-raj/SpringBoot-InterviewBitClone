package raj.nishant.interviewbitclone.Repositiory;

import raj.nishant.interviewbitclone.Model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositiory {
    User createuser(User user);

    Optional<User> getUserById(UUID id);
}
