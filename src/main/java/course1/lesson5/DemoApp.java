package course1.lesson5;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
        Emplyee [] emplyees = new Emplyee[5];
        for (int i = 0; i < emplyees.length; i++) {

            emplyees[0] = new Emplyee("Petr Petrovich Petrov", "Engeneer", "asdd@sdf.ru", 85256588, 10000, 52);
            emplyees[1] = new Emplyee("Sidor Sidorovich Sidorov", "Worker", "asffd@sggff.ru", 8666588, 100000, 32);
            emplyees[2] = new Emplyee("Fedor Fedorovich Fedorov", "Driver", "ad@sf.ru", 85444588, 100, 25);
            emplyees[3] = new Emplyee("Sergei Sergeevich Sergeev", "Programmist", "ddd@sdf.ru", 844556588, 156600, 28);
            emplyees[4] = new Emplyee("Boris Borisovich Borisov", "Director", "wertt@sd.ru", 811233588, 155500, 41);



        } for (Emplyee emplyee : emplyees)
        { if (emplyee.getAge() > 40) {
            emplyee.info();
        }
        }}


    }
