package ClassRoom;

public class Client extends Person{

    public Client(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
