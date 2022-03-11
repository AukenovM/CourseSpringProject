package kz.iitu.itse1901.mukhamedrassul.Service;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import kz.iitu.itse1901.mukhamedrassul.Repository.ClothesRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClothesService {
    private final ClothesRepository clothesRepository;

    public ClothesService (ClothesRepository clothesRepository){
        this.clothesRepository = clothesRepository;
    }

    public List<Clothes> getAllClothes(){
        return clothesRepository.findAll();
    }

    public void save(Clothes clothes) {
        clothesRepository.save(clothes);
    }

    public int count() {
        return clothesRepository.count();
    }
    public void deleteById(Long id) {
       clothesRepository.deleteById(id);
    }


    public Optional<Clothes> findById(Long id) {
        return clothesRepository.findById(id);
    }
}
