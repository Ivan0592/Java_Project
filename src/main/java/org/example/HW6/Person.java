package org.example.HW6;
import java.util.ArrayList;
import java.util.HashSet;
public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String city;
    int id;

    public Person(String firstName, String lastName, int age, String gender, String city, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format( "fn:%s ln:%s age:%d gender:%s city:%s id:%d", firstName, lastName, age, gender, city, id );
    }

    @Override
    public boolean equals(Object o) {
        Person t = (Person) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void city (HashSet<Person> pers) {
        ArrayList<String> citys = new ArrayList<>();
        ArrayList<String> onecity = new ArrayList<>();
        for (Person item: pers) {
            if (!(citys.contains(item.city))) {
                citys.add( item.city );
            } else {
                onecity.add( item.city );
            }
        }

        System.out.println("\nC одного города:");
        for (Person item: pers) {
            for (int i = 0; i < onecity.size(); i++) {
                if (onecity.get( i ) == item.city) {
                    System.out.printf( "fn:%s, c:%s id:%d\n", item.firstName, item.city, item.id );
                }
            }
        }
    }

    public static void moreTwentyYears (HashSet<Person> pers) {
        System.out.println("\nCтарше 20 лет:");
        for (Person item: pers) {
            if (item.age > 20) {
                System.out.println(item);
            }
        }
    }
}
