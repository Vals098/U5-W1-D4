package valeriafarinosi.U5_W1_D4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valeriafarinosi.U5_W1_D4.entities.User;

@Repository //specializzazione di @Component
public interface UsersRepositories extends JpaRepository<User, Long> {
    // <User, Long> entity di riferimento e tipo della PK dell'entity
    //solo estendendo la JpaRepo ho automaticamente disponibili i metodi base (.save(), .findBy(), ...)
    //
}
