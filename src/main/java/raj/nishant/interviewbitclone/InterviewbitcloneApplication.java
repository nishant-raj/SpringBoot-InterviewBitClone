package raj.nishant.interviewbitclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import raj.nishant.interviewbitclone.Model.User;
import raj.nishant.interviewbitclone.Utils.Constants;

import javax.lang.model.element.Name;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewbitcloneApplication.class, args);
        User user = new User("nishant", Constants.Gender.MALE);
        System.out.println(user.getUuid());
    }

}
