import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userCollection = new ArrayList();
        userCollection.add(new User("Андрей", 20));
        userCollection.add(new User("Sergei", 25));
        userCollection.add(new User("Pavel", 30));
        userCollection.add(new User("Pavel", 30));
        userCollection.add(new User("Georgi", 26));
        userCollection.add(new User("Sergei", 25));
        userCollection.add(new User("Sergei", 25));

    }
}