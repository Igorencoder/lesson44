package course1.lesson5;

public class Emplyee {
    public String FIO;
    public String position;
    public String email;
    public int telephone_number;
    public int salary;
    public int age;

   public Emplyee (String FIO, String position, String email, int telephone_number, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone_number = telephone_number;
        this.salary = salary;
        this.age = age;

    }
    public void info() {

        System.out.println("FIO" + FIO + "position" + position + "email"  + email + "telephone_number" + telephone_number + "salary" + salary + "age" + age);
    }

    public int getAge() {
        return age;
    }
}
