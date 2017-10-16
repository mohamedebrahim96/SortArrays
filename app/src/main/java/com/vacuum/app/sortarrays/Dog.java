package com.vacuum.app.sortarrays;

import java.util.Comparator;

/**
 * Created by Home on 10/16/2017.
 */

public  class Dog implements Comparable<Dog> {
    private String name;
    private int age;

    public static final Comparator<Dog> DESCENDING_COMPARATOR = new Comparator<Dog>() {
        // Overriding the compare method to sort the age
        public int compare(Dog d, Dog d1) {
            return d.age - d1.age;
        }
    };

    public static final Comparator<Dog> ascending_COMPARATOR = new Comparator<Dog>() {
        // Overriding the compare method to sort the age
        public int compare(Dog d, Dog d1) {
            return d1.age - d.age;
        }
    };
    Dog(String n, int a) {
        name = n;
        age = a;
    }

    public String getDogName() {
        return name;
    }

    public int getDogAge() {
        return age;
    }

    // Overriding the compareTo method
    public int compareTo(Dog d) {
        return (this.name).compareTo(d.name);
    }

}
