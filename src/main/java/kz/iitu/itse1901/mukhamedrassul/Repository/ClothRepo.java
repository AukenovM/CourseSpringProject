package kz.iitu.itse1901.mukhamedrassul.Repository;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;

import java.util.List;
import java.util.Optional;

public interface ClothRepo {
    int count();

    void save(Clothes clothes);

    int update(Clothes clothes);

    int deleteById(Long id);

    List<Clothes> findAll();

    List<Clothes> findByNameAndMaterialType(String name, String material_type);

    Optional<Clothes> findById(Long id);

    String getNameById(Long id);

    void delete(Clothes clothes);
}
