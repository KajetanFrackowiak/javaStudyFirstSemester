package Lab10.Task5And6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 8);
        Triangle triangle1 = new Triangle(2, 4, 7);

        Trapezium trapezium = new Trapezium(2, 22, 4, 4, 6);
        Trapezium trapezium1 = new Trapezium(3, 4, 5, 66, 7);

        System.out.println("TRIANGLE: ");
        System.out.println("Perimeter: " + triangle.obliczObwod());
        System.out.println("Area: " + triangle.obliczPole() + "\n\n");

        System.out.println("TRAPEZIUM:");
        System.out.println("Perimeter: " + trapezium.obliczObwod());
        System.out.println("Area: " + trapezium.obliczPole());

        System.out.println(triangle.compareTo(triangle1));
        System.out.println(trapezium.compareTo(trapezium1) + "\n\nSTUDENCI:\n");

        Student student = new Student("Kajetan", "Frąckowiak", "s28404");
        Student student1 = new Student("Piotr", "Żyła", "s28405");
        Student student2 = new Student("Duplikat", "Kajetana", "s28404");

        System.out.println(student.getIndex());
        System.out.println(student1);
        System.out.println(student.compareTo(student1));
        System.out.println(student1.compareTo(student));
        System.out.println(student.compareTo(student2));

        Student[] students = {
                new Student("Luke", "Shaw", "s28451"),
                new Student("David", "De Gea", "s11111"),
                new Student("Marcus", "Rashford", "s50134"),
                new Student("Lisandro", "Martinez", "s22222")
        };

        System.out.println("------------------------------------");
        try {
            Arrays.sort(students);
        } catch (Exception e) {
            System.out.println("Problem with sorting");
        }
        System.out.println("------------------------------------");


        for (Student studentSorted : students) {
            System.out.println(studentSorted);
        }

    }
}
