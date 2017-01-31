/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdademos;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Person {

    String name;
    String gender;

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        //System.out.println("I am " + this.name + " and I am a " + this.gender);
        return "I am " + this.name + " and I am a " + this.gender;
    }
}

