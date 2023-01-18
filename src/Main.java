import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userCollection = new ArrayList<>();
        userCollection.add(new User("Андрей", 20));
        userCollection.add(new User("Sergei", 25));
        userCollection.add(new User("Pavel", 30));
        userCollection.add(new User("Pavel", 30));
        userCollection.add(new User("Georgi", 26));
        userCollection.add(new User("Sergei", 25));
        userCollection.add(new User("Sergei", 25));

        System.out.println(sortUser(userCollection));
    }

        public static User sortUser (Collection<User> users){
            return users.stream().distinct().sorted().reduce((first, second)->second).orElse(null);

        }



    }
