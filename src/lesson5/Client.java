package lesson5;

public class Client extends Customer{
    private String order;

    public Client() {
    }

    public Client(int id, String name, String login, String password, String order) {
        super(id, name, login, password);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "order='" + order + '\'' +
                "} " + super.toString();
    }
}
