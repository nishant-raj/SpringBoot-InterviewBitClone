package raj.nishant.interviewbitclone.Model;

import lombok.Getter;
import lombok.Setter;
import raj.nishant.interviewbitclone.Utils.Constants;

import java.util.UUID;

@Getter
@Setter
public class User {
    private UUID uuid;
    private String name;
    private Constants.Gender gender;
    public User(String name, Constants.Gender gender)
    {
        this.uuid = UUID.randomUUID();
        this.name=name;
        this.gender=gender;
    }

}
