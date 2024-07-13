import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter your string to check: ");
            String myStr = scanner.nextLine();
            if ("bye".equalsIgnoreCase(myStr)) break;
            PalinPermu palinPermu = new PalinPermu();
            System.out.println(palinPermu.isPalinPermu(myStr));
        } 

    }
}