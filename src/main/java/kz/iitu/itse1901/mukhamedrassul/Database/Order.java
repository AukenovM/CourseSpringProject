package kz.iitu.itse1901.mukhamedrassul.Database;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Order {
    private Long order_id;
    private Clothes clothes;
    private Users users;
}
