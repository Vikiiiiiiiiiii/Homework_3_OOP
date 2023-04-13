import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {   // Iterable - это стандартный (системный) интерфейс; это обобщенный тип, 
                                                    // работает с различными видами элементов. Он обязан предоставить итерируемый список.
    private List<User> users = new ArrayList<>();

    public Personal addUser(User user) {
        users.add(user);
        return this;
    }

    public int size() {
        return this.users.size();
    }

    @Override
    public Iterator<User> iterator() {              // реализация метода - Итератор 
        return new Iterator<User>() {               // анонимный класс имеющий два метода:
            int counter = 0;

            @Override
            public boolean hasNext() {              // 1й - есть ли следующий элемент 
                if (counter < users.size()) return true;
                return false;
            }

            @Override
            public User next() {                    // 2й - получение этого следующего элемента
                return users.get(counter++);

            }
        };
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (User item : this) {
            res.append(String.format("%s \n", item));
        }
        return res.toString();
    }

    public List<User> toList() {
        List<User> users = new ArrayList<>();
        for (User item : this) {
            users.add(item);
        }
        return users;
    }
}