import java.util.Collection;
import java.util.List;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sortUser (Collection<User> users){
        String user = users.stream().distinct().sorted().reduce((first,second)->second).get().toString();
        return user;
    }
}
