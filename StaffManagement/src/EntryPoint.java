import jdk.swing.interop.SwingInterOpUtils;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;
import java.util.Random;

public class EntryPoint {
    public static void main(String[] args) {
        String FirstName, LastName;
        int age, i, k, f;
        double MSalary;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        i = rand.nextInt(10) + 1;
        f = i;
        k = 0;
        int n =0;

        Employee[] obj = new Employee[i];
        while (i>0) {
            System.out.println("you have " + i + " insertions left");
            System.out.println("Please input the employee's first name: ");
            FirstName = scan.nextLine();
            System.out.println("Please input the employee's Last name: ");
            LastName = scan.nextLine();
            System.out.println("Please input the employee's age: ");
            age = scan.nextInt();
            System.out.println("Please input the employee's Monthly Salary: ");
            MSalary = scan.nextDouble();
            obj[n] = new Employee(FirstName, LastName, age, MSalary);
            scan.nextLine();
            i -= 1;
            n += 1;
        }

        while (k<f) {
            obj[k].info();
            k+=1;
        }
    }
}
