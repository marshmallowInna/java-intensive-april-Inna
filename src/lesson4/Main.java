package lesson4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "aaaa",31);
        User user2 = new User (1,"aaaa", 31);
        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));
    }
}
