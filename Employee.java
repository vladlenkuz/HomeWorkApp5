package HomeWork5;

public class Employee {

    private String surnameNamePatronymic;
    private String position;
    private  String email;
    private String telephone;
    private int salary;
    private int age;


    public Employee(String name,String position,String email,
                    String telephone,int salary,int age){
        this.surnameNamePatronymic = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public  void printEmplo(){
            System.out.println("ФИО: " + surnameNamePatronymic +
                    " , почта: " + email + ", должность: " + salary + ", телефон: " + telephone +
                    ", зарплата: " + salary + ", возраст: " + age);
    }

    public  void printEmplo40(){
        if (age > 40) {
            System.out.println("ФИО: " + surnameNamePatronymic +
                    " , почта: " + email + ", должность: " + salary + ", телефон: " + telephone +
                    ", зарплата: " + salary + ", возраст: " + age);
        }
    }

    @Override
    public  String toString(){
        return "ФИО: " + surnameNamePatronymic +
                " , почта: " + email + ", должность: " + salary + ", телефон: " + telephone +
                ", зарплата: " + salary + ", возраст: " + age;
    }
}
