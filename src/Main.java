public class Main {
    public static void main (String[] args) {

        Employee[] allEmployees = {
                new Employee(
                        "Ivanov Ivan Ivanovich",
                        "product owner",
                        "one@mail.ru",
                        "+7-999-111-11-11",
                        250000.00,
                        39),
                new Employee(
                        "Sidorov Semen Semenovich",
                        "manager",
                        "two@mail.ru",
                        "+7-999-222-22-22",
                        250000.00,
                        47),
                new Employee(
                        "Petrov Petr Petrovich",
                        "programmer",
                        "three@mail.ru",
                        "+7-999-333-33-33",
                        200000.00,
                        41),
                new Employee(
                        "Pavlov Pavel Pavlovich",
                        "designer",
                        "four@mail.ru",
                        "+7-999-444-44-44",
                        150000.00,
                        32),
                new Employee(
                        "Fedorov Fedor Fedorovich",
                        "tester",
                        "five@mail.ru",
                        "+7-999-555-55-55",
                        100000.00,
                        27)
        };

        for (Employee employee : allEmployees) {

            if (employee.age > 40) {
                employee.printInformation();
                System.out.println();
            }
        }
    }
}
