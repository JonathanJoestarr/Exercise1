package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
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
    
        System.out.println("Congratulations, you guessed the correct Card Value!");
        System.out.println();
        
        System.out.println("My name is Jonah, Jonah Gorcsi, but you can just call me by my first name");
        System.out.println();
        
        System.out.println("My career ambition: I plan on either becoming a web designer, or a marketer");
        System.out.println("-- I will develop a website that hosts my portfolio");
        System.out.println("-- I wish to do well in College and most importantly, learn.");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Listening to Music");
        System.out.println("-- Roleplaying");
        System.out.println("-- Editing Videos");

        System.out.println();
        
    
    }

}
