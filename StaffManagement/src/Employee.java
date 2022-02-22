public class Employee {
    String FirstName, LastName;
    int age;
    double MonthlySalary;
    Employee(String Fname, String Lname, int Age, double Msalary) {
        FirstName = Fname;
        LastName = Lname;
        age = Age;
        MonthlySalary = Msalary;
    }
    public void info() {
        System.out.println("Employee's information: " + FirstName + " " + LastName + ", " + age + ", " + MonthlySalary);
    }

}
