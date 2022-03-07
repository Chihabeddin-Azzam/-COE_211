import java.util.Scanner;
public class EntryPoint {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int i;
            System.out.println("Which service would you like to use?\n" +
                    "[1]: Basic week visualizer\n" +
                    "[2]: Advanced week visualizer\n" +
                    "[3]: Basic calculator\n" +
                    "[4]: Employee repertoire\n");
            i = scan.nextInt();

            switch (i) {
                case 1:
                    BasicWeek b = new BasicWeek();
                    b.printDays();
                    break;
                case 2:
                    AdvancedWeek a = new AdvancedWeek();
                    a.printDays();
                    break;
                case 3:
                    Calculator c = new Calculator();
                    break;
                case 4:
                    Employee e = new Employee();
                    System.out.println(e.toString());
                    break;
                default:

                    break;

            }

    }
}