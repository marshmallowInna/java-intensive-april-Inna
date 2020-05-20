package HW8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults
public class Product {
   private String title;
    private int price;
    Category category;


    public Product() {
    }

    public Product(String title, int price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }
}
