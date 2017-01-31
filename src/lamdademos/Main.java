/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdademos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        println("--- Misc Lambda Demo ---");
        
        //demo1();
        demo2();
        
    }

    static void demo1() {
        List<Person> persons = new ArrayList();

        persons.add(new Person("Jane", "Female"));
        persons.add(new Person("Mary", "Female"));
        persons.add(new Person("Adam", "Male"));
        persons.add(new Person("Carl", "Male"));
        
//        for (Person person: persons) {
//            println("Person is " + person);
//        }

        persons.forEach(person -> {
            println("Person: " + person);
        });
    }
    
    static void demo2() {
        int[] values = {1, 2, 5, 10, 9, 4, 3, 7};
        int sum = 0;
        
//        for (int i=0;i < 8;i++) {
//            println(" i is " + i + " value is " + values[i]);
//        }

//        int sum = 0;
//        for (int v: values) {
//            sum += v;
//            println("value is " + v);
//        }
//        println("sum of the array values = " + sum);
                
        IntStream.of(values)
                .sorted()
                .forEach(value -> println("value is " + value));
        
        sum = IntStream.of(values)
                .reduce(0, (x, y) -> x+ y);
        
        println("sum of the array values = " + sum);

        
        // Let's find the even values and display
        println("Find the even values and display them");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> println("value is " + value));
        
        
        // Let's find the odd values, mutliply by 10 and display
        println("Find the odd values, mutliply by 10 and display them");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value*10)
                .sorted()
                .forEach(value -> println("value is " + value));
        
        
        
        
    }
    
    private static void println(String msg) {
        System.out.println(msg);
    }
}

