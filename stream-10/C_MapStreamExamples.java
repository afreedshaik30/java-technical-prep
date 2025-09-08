import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int age() {
        return age;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}

class Employee {
    int salary;
    String name;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}

public class C_MapStreamExamples {
    public static void main(String[] args) {
        // 1.
        List<User> users = Arrays.asList(
                new User(21, "Afreed"),
                new User(22, "Basha"),
                new User(23, "Charan"));

        System.out.println("User's Map : " + convertListToMap(users));

        // 2.
        List<Employee> employees = Arrays.asList(
                new Employee("John", 5000),
                new Employee("Alice", 7000),
                new Employee("Bob", 6000));

        System.out.println("Employees sorted by salary: " +

                sortEmployeesBySalary(employees));

        // 3.
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        System.out.println("Word Length Map: " + wordLengthMap(names));
    }

    // 1. Convert list of objects to Map
    public static Map<Integer, String> convertListToMap(List<User> users) {
        return users.stream()
                .collect(Collectors.toMap(User::age, User::name));
    }

    // 2. Sort employees by salary
    public static List<Employee> sortEmployeesBySalary(List<Employee> employees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .toList();
    }

    // 3. Word length map (distinct words)
    public static Map<String, Integer> wordLengthMap(List<String> nameList) {
        return nameList.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));
    }
}
