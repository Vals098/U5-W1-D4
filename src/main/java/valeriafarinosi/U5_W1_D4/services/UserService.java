package valeriafarinosi.U5_W1_D4.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import valeriafarinosi.U5_W1_D4.repositories.UsersRepositories;

@Service //Anche questa è una specializzazione di @Component
@Slf4j
public class UserService {

    private final UsersRepositories usersRepositories;

    public UserService(UsersRepositories usersRepositories) {
        this.usersRepositories = usersRepositories;
    }

    public void saveNewUser() {
    }

}
