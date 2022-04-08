package kz.iitu.itse1901.mukhamedrassul;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Service.ClothesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.validation.*;
import java.util.Set;


@Slf4j
@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
public class MukhamedrassulApplication{

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MukhamedrassulApplication.class, args);
        ClothesService clothesService = applicationContext.getBean(ClothesService.class);

        //Clothes clothes = new Clothes(null,null,null);

      //  clothesService.save(clothes);
        clothesService.save(new Clothes("adaaa","sadaaa","asdaaa"));

        System.out.println(clothesService.getAllClothes());

        System.out.println(clothesService.findById(5L));

        clothesService.deleteById(5L);

        System.out.println(clothesService.getAllClothes());

    }

}

