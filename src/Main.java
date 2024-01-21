import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Employee("Nuraly", "Alibekov", "Manager", 37580.00));
        people.add(new Employee("Asylzhan", "Ermekov", "Developer", 45674.00));
        people.add(new Student("Sanzhar", "Kobei", 2.0));
        people.add(new Student("Ernur", "Abdukhaim", 3.5));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}