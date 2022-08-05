package recipes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id;

    @NotBlank
    @Email(regexp = "^\\S+@\\S+\\.\\S+$", message = "Enter good email")
    private String email;

    @NotBlank
    @Size(min=8, message = "less 8")
    private String password;

    private String role;
}
