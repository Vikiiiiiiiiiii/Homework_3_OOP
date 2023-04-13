public class SubUser extends User{

    private int lvl;             // уровни наших сотрудников
    
    public SubUser(String name, int age) {
        super(name, age);
    }

    public SubUser(User user, int lvl) {
        super(user.getName(), user.getAge());
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        String lvl = String.format(("%" + this.lvl + "s"), " ");
        return String.format("%s %s", lvl, super.toString());
    }
}


/*Сотрудник Ольга возраст: 25            (главная, у нее в подчинении: Павел и Инокентий)
     Сотрудник Павел возраст: 42         (подчиненный, у него в подчинении: Алевтина)
        Сотрудник Алевтина возраст: 21
     Сотрудник Инокентий возраст: 52     (подчиненный, у него в подчинении: все ниже перечисленные сотрудники)
        Сотрудник Иван возраст: 20
        Сотрудник Василий возраст: 32
        Сотрудник Елена возраст: 24
        Сотрудник Иван возраст: 21
        Сотрудник Василий возраст: 42
        Сотрудник Елена возраст: 21    */