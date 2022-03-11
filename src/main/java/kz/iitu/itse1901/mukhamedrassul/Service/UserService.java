package kz.iitu.itse1901.mukhamedrassul.Service;


import kz.iitu.itse1901.mukhamedrassul.Repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
public class UserService {
    private final UserRepository userRepository;


    @PostConstruct
    public void init() {
        System.out.println("Initializing bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Bean");
    }


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public void addUserNew(User user) {
//        userRepository.addUsers(user);
//    }
//
//    public List<User> getUsersSmthg() {
//        return userRepository.getUsers();
//    }
}
