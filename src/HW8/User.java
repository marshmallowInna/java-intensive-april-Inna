package HW8;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;


@Data // create get +set +equals + hashcode + requiredartconstructor
@RequiredArgsConstructor
//@AllArgsConstructor
//@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)// it is mean that our field are private at the class User
public class User {
    // @NonNull
   private int id;
   // @NonNull
   private String name;
   // @NonNull
   private int age;
    private ArrayList <Product>  products = new ArrayList<>();// пустый список после =; ( а если до равно тогда писали что = null;

    public User(int i, String ssss, ArrayList<Product> products) {//we change siggnature (was none select constructor)
    }

    public User(int id, String name, int age, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.products = products;
    }
}
