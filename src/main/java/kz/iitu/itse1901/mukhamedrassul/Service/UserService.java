package kz.iitu.itse1901.mukhamedrassul.Service;


import kz.iitu.itse1901.mukhamedrassul.Repository.ClothRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class UserService {
    @Autowired
    private ClothRepo clothRepo;


    @PostConstruct
    public void init() {
        System.out.println("Initializing bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Bean");
    }
}
