import java.math.BigDecimal;

public class Employee {
    String fullName;
    String post;
    String email;
    String phoneNumber;
    double salary;
    int age;


    public Employee(String fullName, String post, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInformation() {
        System.out.println("ФИО: " + fullName +
                "\nДолжность: " + post +
                "\nEmail: " + email +
                "\nНомер телефона: " + phoneNumber +
                "\nЗарплата: " + salary +
                "\nВозраст: " + age);
    }
}
