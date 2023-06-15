import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    /**
     * javaDoc
     */
    public static void main(String[] args) {
        Collection<User> user= new ArrayList<>();;
        for(int i =0; i<10; i++){
        User user1 = new  User("Вася", "Пупкин");
        user.add(user1);
        }
        System.out.println(user);
    }

}
