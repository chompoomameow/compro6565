
package th.ac.nu.students.u51346565.compro.ch03;

import java.util.Scanner;

public class Ex05 {
     
   public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Card Notation:");
        String input = in.next();
        String valueCard = input.substring(0, 1);
        String typeCard = input.substring(1, 2);
        if(valueCard.equals("a")||valueCard.equals("A")){
        valueCard = "Ace";
        }
        if(valueCard.equals("j")||valueCard.equals("J")){
        valueCard = "Jack";
        }
        if(valueCard.equals("q")||valueCard.equals("Q")){
        valueCard = "Queen";
        }
        if(valueCard.equals("k")||valueCard.equals("K")){
        valueCard = "King";
        }
        if(valueCard.equals("2")||valueCard.equals("3")||valueCard.equals("4")||valueCard.equals("5")
        ||valueCard.equals("6")||valueCard.equals("7")||valueCard.equals("8")||valueCard.equals("9")){
        valueCard = "Card Values";
        }

        if(typeCard.equals("d")||typeCard.equals("D")){
        typeCard = "Dimonds";
        }
        if(typeCard.equals("h")||typeCard.equals("H")){
        typeCard = "Hearts";
        }
        if(typeCard.equals("s")||typeCard.equals("S")){
        typeCard = "Spades";
        }
        if(typeCard.equals("c")||typeCard.equals("C")){
        typeCard = "Clubs";
        }

        System.out.println(valueCard+" of "+typeCard);
        }
 }
