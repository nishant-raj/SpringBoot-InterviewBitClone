package raj.nishant.interviewbitclone.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class ResponseDto<T> {
    private HttpStatus statuscode;
    private T data;
    public ResponseDto(HttpStatus httpStatus, T data)
    {
          this.statuscode = httpStatus;
          this.data = data;
    }
}
