public class User implements Comparable<User>{
    private String name;
    private int age;

    private Personal subordination = new Personal();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSubordination(Personal subordination) {
        this.subordination = subordination;
    }

    public Personal getSubordination() {
        return subordination;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Сотрудник ")
                .append(name)
                .append(" возраст: ")
                .append(age);

        return res.toString();
    }

    @Override
    public int compareTo(User o) {
        int compareName = this.name.compareTo(o.name);   // по имени
        if (compareName == 0) {                          // если имена равны, то идем к возрасту
            return this.age - o.age;                     // по возрасту
        }
        return compareName;                              // по имени
    }
}
