//Program to demonstrate MultiLevel inheritance
package com.tns.ifet.dayfive.multiilevelinheritance;



import java.time.LocalDate;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating objects with LocalDate
        Person p1 = new Person("Atharv", 7878767676L, LocalDate.of(2000, 12, 2));
        System.out.println(p1);

        p1 = new Employee("Pranav", 8080807070L, LocalDate.of(1995, 5, 7), "Sales", 45000);
        System.out.println(p1);

        p1 = new LevelOneEmployee("Madhur", 9880807227L, LocalDate.of(1988, 2, 15), "Account", 85000, 200,
                "Signing Authority");
        System.out.println(p1);
    }
}
