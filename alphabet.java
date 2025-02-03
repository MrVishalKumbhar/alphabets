import java.util.Scanner;
// #Main_Class
public class alphabet {
    Scanner s = new Scanner(System.in);

    // #Welcome_Method
    public void welcome() {
        System.out.println("========== Welcome to the Alphabet Program ==========\n Please Enter Any Alphabets You Want : ");
        String AlpInput = s.next();

        // #Choose_alphabet_Method
        switch (AlpInput) {
            case "A":

                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void main(String[] args) {
        alphabet alp = new alphabet();
        alp.welcome();
    }
}