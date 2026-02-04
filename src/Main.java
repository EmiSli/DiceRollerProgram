import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String PlayAgain;

        do{
            int NumberOfDice;
            int total=0;




            while(true){
                System.out.print("Enter the number of rolls: ");
                if(scanner.hasNextInt()){
                    NumberOfDice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                }else{
                    System.out.println("Please enter a valid number.");
                    scanner.nextLine();
                }
            }



            if(NumberOfDice>0){
                for(int i=0; i<NumberOfDice; i++){
                    int randomNumberOfDices= random.nextInt(1,7);
                    printRoll(randomNumberOfDices);
                    System.out.println("You rolled " + randomNumberOfDices);
                    total+=randomNumberOfDices;
                }
                System.out.println("\nYour total is: " + total);

            }else{
                System.out.println("Number of rolls must be greater than 0");
            }



            do{
                System.out.println("Do you want to play again? (Y-yes/N-no): ");
                PlayAgain = scanner.nextLine();

            }while(!PlayAgain.equalsIgnoreCase("y")&&!PlayAgain.equalsIgnoreCase("n"));

        }while(PlayAgain.equalsIgnoreCase("y"));

        scanner.close();
    }

    static void printRoll(int number){
        String die1= """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String die2= """
                 -------
                |   ●   |
                |       |
                |   ●   |
                 -------
                """;
        String die3= """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String die4= """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String die5= """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String die6= """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(number){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default ->System.out.print("Invalid number");
        }

    }

}
