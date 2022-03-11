package kz.iitu.itse1901.mukhamedrassul;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Repository.ClothRepo;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class MukhamedrassulApplicationTests {

    @Autowired
    @Qualifier("clothesRepository")
    ClothRepo clothRepo;

    @Test
    void contextLoads() {

    }

    @Test
    public void testSave() {
        Clothes clothes = new Clothes(5L,"shoes","123456", "XS");
        clothRepo.save(clothes);
    }

    @Test
    public void testDelete() {
        clothRepo.deleteById(1L);
    }

    @Test
    public void testFindById(){
        Clothes clothes = clothRepo.findById(2l).orElseThrow();
        System.out.println(clothes);
    }


}
