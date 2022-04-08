package kz.iitu.itse1901.mukhamedrassul.Customs;

import kz.iitu.itse1901.mukhamedrassul.Database.Clothes;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ClothesFormatter implements Formatter<Clothes> {

    @Override
    public Clothes parse(String text, Locale locale) throws ParseException {
        if(text == null)
        return null;
        else {
            String[] parts = text.split(",");
//            if (parts.length == 4) {
                Clothes clothes = new Clothes();
                clothes.setSize(parts[0].trim());
                clothes.setName(parts[1].trim());
                clothes.setMaterial_type(parts[2].trim());
                return clothes;
//            } else if ( parts.length == 3) {
//                Clothes clothes = new Clothes();
//                clothes.(parts[0].trim());
//                clothes.setZipCode(parts[1].trim());
//                clothes.setCounty(parts[4].trim());
//                return clothes;
            }
        }


    @Override
    public String print(Clothes object, Locale locale) {
        if (object == null) {
            return "";
        }
        return object.toString();
    }
}
