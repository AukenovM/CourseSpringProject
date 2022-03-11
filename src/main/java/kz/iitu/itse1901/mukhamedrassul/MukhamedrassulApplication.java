package kz.iitu.itse1901.mukhamedrassul;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Repository.UserRepository;
import kz.iitu.itse1901.mukhamedrassul.Service.ClothesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
@EnableCaching
public class MukhamedrassulApplication{

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MukhamedrassulApplication.class, args);
        ClothesService clothesService = applicationContext.getBean(ClothesService.class);
        UserRepository userRepository = applicationContext.getBean(UserRepository.class);

        clothesService.save(new Clothes("ada","sada","asda"));
        clothesService.save(new Clothes("ada","sada","asda"));
        System.out.println(clothesService.getAllClothes());

        System.out.println(clothesService.findById(1L));
        System.out.println(clothesService.count());
        clothesService.deleteById(2L);

        System.out.println(clothesService.getAllClothes());
    }



















//    static
//    JdbcTemplate jdbcTemplate = null;
//
//    private static ClothRepo clothRepo = null;
//
//    public MukhamedrassulApplication(@Qualifier("clothesRepository") ClothRepo clothRepo, JdbcTemplate jdbcTemplate) {
//        this.clothRepo = clothRepo;
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public static void main(String[] args) {SpringApplication.run(MukhamedrassulApplication.class, args); runJDBC(); }
//
//    static void runJDBC() {
//
//        jdbcTemplate.execute("DROP TABLE IF EXISTS clothes");
//        jdbcTemplate.execute("CREATE TABLE clothes(" +
//                "id SERIAL, name VARCHAR(255),  material_type VARCHAR(255),  size VARCHAR(255))");
//
//        List<Clothes> clothes = Arrays.asList(
//                new Clothes(1L,"T-Shirt", "polyester", "XS"),
//                new Clothes( 2L,"Jacket", "polyester", "M"),
//                new Clothes(3L,"Coat", "polyester", "L"),
//                new Clothes(4L,"Jeans", "polyester", "XL")
//        );
//
//        clothes.forEach(clothe -> {
//
//            clothRepo.save(clothe);
//        });
//
//        // count
//        log.info("[COUNT] Total books: {}", clothRepo.count());
//
//        // find all
//        log.info("[FIND_ALL] {}", clothRepo.findAll());
//
//        // find by id
//        log.info("[FIND_BY_ID] :2L");
//        Clothes clothe = clothRepo.findById(2L).orElseThrow(IllegalArgumentException::new);
//        log.info("{}", clothe);
//
//        // find by name (like) and price
//        log.info("[FIND_BY_NAME_AND_PRICE] : like '%Java%' and price <= 10");
//        log.info("{}", clothRepo.findByNameAndMaterialType("T-Shirt", "polyester"));
//
//        // get name (string) by id
//        log.info("[GET_NAME_BY_ID] :1L = {}", clothRepo.getNameById(1L));
//
//        // update
//        log.info("[UPDATE] :2L :99.99");
//        clothe.setSize("XLL");
//        log.info("rows affected: {}", clothRepo.update(clothe));
//
//        // delete
//        log.info("[DELETE] :3L");
//        log.info("rows affected: {}", clothRepo.deleteById(3L));
//
//        // find all
//        log.info("[FIND_ALL] {}", clothRepo.findAll());
//
//    }
}
