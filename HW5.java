package Lesson5;

public class HW5 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Borisova Anzhelika Anatolevna","QA Engineer","qa@mail.ru",777,3000000,17);
        Employee emp2 = new Employee("Ivanov Petr Sergeevich","Manager","ya@mail.ru",999,10000,25);
        Employee emp3 = new Employee("Lapin Ivan Pertovich","Developer","yfg@mail.ru",444,4000000,41);
        Employee emp4 = new Employee("Melnikov Mikhail Vasilevich","Cook","cook@mail.ru",555,100000,27);
        Employee emp5 = new Employee("Sidorova Mariya Maksimovna","Geologist","fff@mail.ru",577,20000,50);

        Employee[] emp = new Employee[5];
        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;
        emp[3] = emp4;
        emp[4] = emp5;
        for(int i=0; i < emp.length; i++){
            if(emp[i].getAge() > 40){
                emp[i].printEmployee();
            }
        }

    }

}
