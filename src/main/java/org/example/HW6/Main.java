package org.example.HW6;
import java.util.Arrays;
import java.util.HashSet;

import static org.example.HW6.Person.moreTwentyYears;
import static org.example.HW6.Person.city;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 21, "men", "Moscow", 11);
        Person p2 = new Person("Petr", "Petrov", 44, "men", "Karaganda", 22);
        Person p3 = new Person("Petr", "Fedorov", 57, "men","Kaluga", 22);
        Person p4 = new Person("Olga", "Alekseeva", 22, "women", "Samara", 333);
        Person p5 = new Person("Mari", "Sokolova", 15, "women", "Pavlodar", 27);
        Person p6 = new Person("Igor", "Voronov", 19, "men", "Moscow", 78);
        Person p7 = new Person("Den", "Ivanov", 37, "men", "Moscow", 777);

        System.out.println(p1);  // fn:Ivan ln:Ivanov age:21 gender:men city:Moscow id:11

        System.out.println(p1 == p2);  // false
        System.out.println(p1.equals( p2 ));  // false
        System.out.println(p2.equals( p3 ));  // true

        HashSet<Person> persons = new HashSet<Person>( Arrays.asList(p1, p2, p3, p4, p5, p6, p7) );

        city(persons);

        moreTwentyYears( persons );
    }
}
