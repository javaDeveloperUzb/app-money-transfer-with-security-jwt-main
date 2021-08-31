package uz.pdp.appmoneytransferwithsecurityjwtmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Income;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Outcome;

public interface OutcomeRepository extends JpaRepository<Outcome, Integer> {
    
}
