package uz.pdp.appmoneytransferwithsecurityjwtmain.payload;

import lombok.Data;

import java.sql.Date;

@Data
public class CardDto {
    private boolean active;

    private String username;

    private Integer number;

    private Date expiredDate;

}
