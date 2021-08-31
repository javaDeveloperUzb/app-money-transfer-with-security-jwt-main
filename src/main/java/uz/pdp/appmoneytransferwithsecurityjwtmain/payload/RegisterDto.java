package uz.pdp.appmoneytransferwithsecurityjwtmain.payload;

import lombok.Data;

@Data
public class RegisterDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;

}
