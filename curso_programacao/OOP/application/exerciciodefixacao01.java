package OOP.application;

import java.util.Scanner;

import OOP.entities.Employee;
import OOP.entities.Rectangle;
import OOP.entities.Student;

public class exerciciodefixacao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

        // Exercício 02
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + employee.toString());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.println();
        System.out.println("Updated data: " + employee.toString());

        // Exercício 03
        Student student = new Student();
        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f%n", student.notaFinal());
        System.out.println(student.verificaAprovacao());

        sc.close();
    }
}
