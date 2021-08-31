package uz.pdp.appmoneytransferwithsecurityjwtmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
