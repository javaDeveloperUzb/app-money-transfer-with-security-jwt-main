package uz.pdp.appmoneytransferwithsecurityjwtmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.Outcome;
import uz.pdp.appmoneytransferwithsecurityjwtmain.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
