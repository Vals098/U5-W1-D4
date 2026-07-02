package valeriafarinosi.U5_W1_D4.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import valeriafarinosi.U5_W1_D4.entities.Item;
import valeriafarinosi.U5_W1_D4.exceptions.TakenNameException;
import valeriafarinosi.U5_W1_D4.repositories.ItemRepository;

@Service
@Slf4j
public class ItemService {

    //    DI della repository
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    //    personalizzo il metodo save()
    public void saveNewItem(Item newItem) {
//        eventuali controlli
        if (this.itemRepository.existsByName(newItem.getName()))
            throw new TakenNameException("Il nome " + newItem.getName() + " è già stato usato!");
//        salvo l'item usando la repository
        this.itemRepository.save(newItem);
//        stampo un messaggio di avvenuto salvataggio con il logger
        log.info("L'item " + newItem.getName() + " è stato salvato correttamente!");
    }


}
