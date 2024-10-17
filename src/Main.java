import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Mark", 38, "Driver", 30000, 45000);
        Person person2 = new Person("Tom", 33, "Teacher", 80000, 85000);
        Person person3 = new Person("Ilon", 30, "Welder", 55000, 65000);
        Person person4 = new Person("Stive", 28, "Baker", 45000, 55000);
        Person person5 = new Person("Antoni", 31, "Lawyer", 70000, 90000);

        Person[] people = {person1,person2,person3,person4,person5};
        System.out.println(Arrays.toString(people));

       System.out.println(" ");
        Person.getSalaryMax(people);
        System.out.println(" ");
        Person.getSalaryMin(people);
        System.out.println(" ");
        Person.getPhone(people);



    }
}