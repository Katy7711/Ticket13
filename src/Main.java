import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userCollection = new ArrayList<>();
        userCollection.add(new User("Andrei", 20));
        userCollection.add(new User("Andrei", 20));
        userCollection.add(new User("Pavel", 25));
        userCollection.add(new User("Sergei", 30));
        userCollection.add(new User("Andrei", 20));
        userCollection.add(new User("Matvei", 26));
        userCollection.add(new User("Matvei", 26));
        userCollection.add(new User("Andrei", 20));

        System.out.println(sortUser(userCollection));

        }

        public static Optional<User> sortUser (Collection<User> users) {
        Comparator<User> nameAndAgeComparator = Comparator.comparing(User::getName).thenComparing(User::getAge);
        return users.stream().distinct().sorted(nameAndAgeComparator).max(Comparator.comparing(User::getAge));
        }
    }
