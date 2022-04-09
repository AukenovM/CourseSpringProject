package kz.iitu.itse1901.mukhamedrassul.Service;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Repository.ClothRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(isolation = Isolation.SERIALIZABLE)
public class ClothesService {
    @Autowired
    private ClothRepo clothRepo;

    @Transactional(readOnly = true)
    public List<Clothes> getAllClothes(){
        return clothRepo.findAll();
    }

    @Async
    public void save(Clothes clothes) { clothRepo.save(clothes); }

    @Async
    public void deleteById(Long id) {
        clothRepo.deleteById(id);
    }

    public Optional<Clothes> findById(Long id) {
        return clothRepo.findById(id);
    }

    //Cron <minute> <hour> <day-of-month> <month> <day-of-week> <command>
    // Rate - не ожидет окончания, Delay - ожидает окончания
    @Scheduled(fixedDelay = 1000, initialDelay = 1000, fixedRate = 1000, cron = "${cron.expression}" )
    public void scheduleFixedRateWithInitialDelayTask() {
        System.out.println(
                " Some Schedule that shows Imma smurt ");
    }
}
