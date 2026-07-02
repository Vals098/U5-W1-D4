package valeriafarinosi.U5_W1_D4.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import valeriafarinosi.U5_W1_D4.services.UserService;

@Component
public class UsersRunner implements CommandLineRunner {

    //@Autowired
//    private final UsersRepositories usersRepositories; //MAI usare direttamente le repositories
//                                                         vanno usati i service

//    public UsersRunner(UsersRepositories usersRepositories) {
//        this.usersRepositories = usersRepositories;
//    }

    private final UserService userService;

    public UsersRunner(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
