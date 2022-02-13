package com.company;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter any option from following");
        System.out.println( "1 : Paper \n" +
                            "2 : Rock \n" +
                            "3 : Scissor");
        int selection = sc.nextInt();
        int rdm = random.nextInt(2) + 1;
        System.out.println("Computer choice --->>" + rdm);
        if (selection == rdm){
            System.out.println("Draw match");
        }
        else{
            if (rdm == 3 && selection == 1 ){
                System.out.println("computer win");
            }
            else if(rdm == 1 && selection == 2){
                System.out.println("computer win");
            }
            else if(rdm == 2 && selection == 3){
                System.out.println("computer win");
            }
            else if(selection == 3 && rdm == 1){
                System.out.println("you win");
            }
            else if(selection == 1 && rdm == 2){
                System.out.println("you win");
            }
            else if(selection == 2 && rdm == 3){
                System.out.println("you win");
            }
            else {
                System.out.println("I am fail because you enter wrong choice ...");
            }
        }
    }
}
