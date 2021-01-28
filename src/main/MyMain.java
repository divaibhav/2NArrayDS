package main;

import implementation.MyArrayImplementation;

public class MyMain {
    public static void main(String[] args) {
        int size = 5;
        MyArrayImplementation numbers =
                new MyArrayImplementation(size);
        System.out.println
                ("insert = "+ numbers.insert(2));
        System.out.println
                ("insert = "+ numbers.insert(22));
        System.out.println
                ("insert = "+ numbers.insert(8));
        numbers.traverse();
        //numbers.delete();
        numbers.traverse();
        System.out.println("sorted");
        numbers.sort();
        numbers.traverse();
        System.out.println
                ("found = " + numbers.search(55));
    }
}
