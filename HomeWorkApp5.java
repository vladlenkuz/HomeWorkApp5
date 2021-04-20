package HomeWork5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] =  new Employee("А. Б. Бочаров", "Инженер", "hoodfuc@gmail.com",
                "89567801548", 100000, 25);
        employee[1] =  new Employee("В. А. Иваонв", "3д-дизайнер", "ivanob123@gmail.com",
                "89587801236", 70000, 43);
        employee[2] =  new Employee("В. О. Хамидулов", "Инженер-конструктор", "hamvlad@gmail.com",
                "89658941860", 3000000, 24);
        employee[3] =  new Employee("А. Б. Сидоров", "Дворник", "hightew@gmail.com",
                "89009814563", 30000, 19);
        employee[4] =  new Employee("А. Б. Астафьев", "Инженер", "astafevkostya@gmail.com",
                "89504318900", 80000, 45);
        printSystOut(employee);//Вывод через переопределенный метод toString в классе Employee;
        System.out.println();
        printSystOut40(employee);//Вывод через метод в классе Employee printEmplo40();
        System.out.println();
        printSystOut1(employee);//Вывод через метод в классе Employee printEmplo();


    }

    public static void printSystOut1(Employee[] employee){

        for (int i = 0; i < employee.length; i++) {

            employee[i].printEmplo();

        }
    }
    public static void printSystOut(Employee[] employee){

        for (Object personal: employee) {

            System.out.println(personal);//Сделал через переопределения toString;

        }
    }

    public static void printSystOut40(Employee[] employee){

        for (int i = 0; i < employee.length; i++) {
            employee[i].printEmplo40();

        }

    }
}
