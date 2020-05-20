package HW7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonAuth {
    private int id;
    private String name;
    private int age;
    private String login;
    private String password;
    private Person person;
    private Auth auth;

    public PersonAuth() {
    }


    public PersonAuth(int id, String name, int age, String login, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;
    }


    public PersonAuth(Person person, Auth auth) {
        this.person = person;
        this.auth = auth;
        this.id = person.getId();
        this.name = person.getName();
        this.age = person.getAge();

    }

}




