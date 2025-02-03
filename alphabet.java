import java.util.Scanner;
// #Main_Class
public class alphabet {
    Scanner s = new Scanner(System.in);

    // #Welcome_Method
    public void welcome() {
        clearScreen();
        System.out.println("========== Welcome to the Alphabet Program ==========\n Please Enter Any Alphabets You Want : ");
        String AlpInput = s.next();

        // #Choose_alphabet_Method
        switch (AlpInput) {
            case "A":
            case "a":
                clearScreen();
                System.out.println("A for Apple");
                exit();
                break;

            case "B":
            case "b":
                clearScreen();
                System.out.println("B for Ball");
                exit();
                break;

            case "C":
            case "c":
                clearScreen();
                System.out.println("C for Cat");
                exit();
                break;
            
            case "D":
            case "d":
                clearScreen();
                System.out.println("D for Dog");
                exit();
                break;
            
            case "E":
            case "e":
                clearScreen();
                System.out.println("E for Elephant");
                exit();
                break;
            
            case "F":
            case "f":
                clearScreen();
                System.out.println("F for Fish");
                exit();
                break;
            
            case "G":
            case "g":
                clearScreen();
                System.out.println("G for Goat");
                exit();
                break;
        
            case "H":
            case "h":
                clearScreen();
                System.out.println("H for Horse");
                exit();
                break;
            
            case "I":
            case "i":
                clearScreen();
                System.out.println("I for Ice Cream");
                exit();
                break;

            case "J":
            case "j":
                clearScreen();
                System.out.println("J for Jug");
                exit();
                break;

            case "K":
            case "k":
                clearScreen();
                System.out.println("K for Kite");
                exit();
                break;

            case "L":
            case "l":
                clearScreen();
                System.out.println("L for Lion");
                exit();
                break;

            case "M":
            case "m":
                clearScreen();
                System.out.println("M for Monkey");
                exit();
                break;

            case "N":
            case "n":
                clearScreen();
                System.out.println("N for Nest");
                exit();
                break;

            case "O":
            case "o":
                clearScreen();
                System.out.println("O for Orange");
                exit();
                break;

            case "P":
            case "p":
                clearScreen();
                System.out.println("P for Parrot");
                exit();
                break;

            case "Q":
            case "q":
                clearScreen();
                System.out.println("Q for Queen");
                exit();
                break;

            case "R":
            case "r":
                clearScreen();
                System.out.println("R for Rabbit");
                exit();
                break;

            case "S":
            case "s":
                clearScreen();
                System.out.println("S for Sun");
                exit();
                break;

            case "T":
            case "t":
                clearScreen();
                System.out.println("T for Tiger");
                exit();
                break;

            case "U":
            case "u":
                clearScreen();
                System.out.println("U for Umbrella");
                exit();
                break;

            case "V":
            case "v":
                clearScreen();
                System.out.println("V for Van");
                exit();
                break;

            case "W":
            case "w":
                clearScreen();
                System.out.println("W for Watch");
                exit();
                break;

            case "X":
            case "x":
                clearScreen();
                System.out.println("X for Xylophone");
                exit();
                break;

            case "Y":
            case "y":
                clearScreen();
                System.out.println("Y for Yak");
                exit();
                break;

            case "Z":
            case "z":
                clearScreen();
                System.out.println("Z for Zebra");
                exit();
                break;
                
            default:
                clearScreen();
                System.out.println("Invalid Input");
                exit();
                break;
        }
    }

    // #Exit_Method
    public void exit() {
        System.out.println("Do you want to continue? (Y/N)");
        String choice = s.next();
        if (choice.equals("Y") || choice.equals("y")) {
            welcome();
        } else {
            System.out.println("Thank You for Using the Alphabet Program");
        }
    }

    // #Clear_Screen_Method
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        alphabet alp = new alphabet();
        alp.welcome();
    }
}