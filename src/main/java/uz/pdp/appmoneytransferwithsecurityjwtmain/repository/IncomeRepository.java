package uz.pdp.appmoneytransferwithsecurityjwtmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Card;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Integer> {
    
}
