package kz.iitu.itse1901.mukhamedrassul.Service;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Repository.ClothRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void save(Clothes clothes) { clothRepo.save(clothes); }

    public void deleteById(Long id) {
        clothRepo.deleteById(id);
    }

    public Optional<Clothes> findById(Long id) {
        return clothRepo.findById(id);
    }
}
