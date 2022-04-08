package kz.iitu.itse1901.mukhamedrassul.Database;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private Long order_id;
    private Clothes clothes;
    private Users users;
}
