package uz.pdp.appmoneytransferwithsecurityjwtmain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Card extends AbsEntity {
    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private Integer number;

    private Double money = 1000.0;

    @Column(nullable = false)
    private Date expiredDate;


}
