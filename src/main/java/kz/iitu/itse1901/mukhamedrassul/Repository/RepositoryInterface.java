package kz.iitu.itse1901.mukhamedrassul.Repository;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;

import java.util.List;

public interface RepositoryInterface {
    void addClothes(Clothes clothes);

    List<Clothes> getClothes();
}
