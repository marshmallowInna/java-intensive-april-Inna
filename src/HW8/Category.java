package HW8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults
public class Category {
     private String title;
    private int zip;

    public Category() {
    }

    public Category(String title, int zip) {
        this.title = title;
        this.zip = zip;
    }
}
