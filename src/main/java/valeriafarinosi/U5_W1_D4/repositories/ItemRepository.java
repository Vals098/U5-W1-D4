package valeriafarinosi.U5_W1_D4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valeriafarinosi.U5_W1_D4.entities.Item;

@Repository //specializzazione di @Component
public interface ItemRepository extends JpaRepository<Item, Long> {

    boolean existsByName(String name);
}
