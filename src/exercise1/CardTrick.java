package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * 
 * @author Jonah Gorcsi Jan 31st, 2023
 */
public class CardTrick{
    
    public static void main(String[] args){
        
        Scanner Userinput = new Scanner(System.in);
        
        System.out.println("Pick a card from values 1-14");
        
        String Cardchoice = Userinput.nextLine();
        
        System.out.
        
        Card[] hand = new Card[7];
        Card[] Value = new Card[14]; 
        Card[] Suit = new Card [4];

        for (int i = 0; i < hand.length; i++){
            Card card = new Card();
            System.out.printf("%f", Math.random() + Card[i]);
            System.out.printf("\n");
            
        for (int h = 0; h < Value.length; h++){
            System.out.printf("%f", Math.random() + Card[h]);
            System.out.printf("\n");
            
            }    
            
        for (int o = 0; o < Suit.length; o++){    
            System.out.printf("%f", Math.random() + Card[o]);
            System.out.printf("\n"); 
            
            }
     
        if(Userinput == Card){
            System.out.println("You guessed correctly");        
            }       
            
        }    
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
   }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {

        /* I'm Done! Jonah Gorcsi */
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
