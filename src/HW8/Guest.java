package HW8;

import lombok.*;

import java.util.Objects;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Guest /*Comparable<Guest> */{
private int id;
private String name;

/*public Guest(){
        }

public Guest(int id,String name){
        this.id=id;
        this.name=name;
        }

public int getId(){
        return id;
        }

public void setId(int id){
        this.id=id;
        }

public String getName(){
        return name;
        }

public void setName(String name){
        this.name=name;
        }*/

public int hashCode(){
        System.out.println(Objects.hash(id,name));
        return Objects.hash(id,name);
        }
        }