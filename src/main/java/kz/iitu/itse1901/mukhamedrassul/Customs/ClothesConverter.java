package kz.iitu.itse1901.mukhamedrassul.Customs;


import kz.iitu.itse1901.mukhamedrassul.Service.ClothesService;
import org.springframework.core.convert.converter.Converter;
import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;

import java.util.Optional;

public class ClothesConverter implements Converter<String, Optional<Clothes>> {
    private ClothesService clothesService;

    @Override
    public Optional<Clothes> convert(String s) {

        try {
            Long clothesId = Long.valueOf(s);
            return clothesService.findById(clothesId);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
