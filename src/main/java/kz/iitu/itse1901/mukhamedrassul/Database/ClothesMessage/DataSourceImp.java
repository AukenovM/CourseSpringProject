package kz.iitu.itse1901.mukhamedrassul.Database.ClothesMessage;

import kz.iitu.itse1901.mukhamedrassul.Config.DataSourceConfig;

public class DataSourceImp implements DataSourceConfig {
    @Override
    public void someMessage() {
        System.out.println("Message From Clothes");
    }
}
