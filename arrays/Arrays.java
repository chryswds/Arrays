/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import inpututils.InputUtils;
import java.util.Scanner;
import arraysinteractions.*;

/**
 *
 * @author chrystiandybas
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myKB = new Scanner(System.in);

        int[] numbers;
        
        ArraysInteractions interactions = new ArraysInteractions();
        
        InputUtils myInput = new InputUtils();
        
        int maxsize = myInput.askUserForInt("How many numbers do you want the array to have? ");
        
        numbers = new int[maxsize];
        
        int option = 0;
        
        do{
            try{
                System.out.println("Choose an option \n"
            + "1)Choose the numbers \n"
            + "2)Let them be randomly generated (-100 to 100) \n"
            + "3)Quit");
                
                option = myKB.nextInt();
                if(option == 1){
                    interactions.chooseNumbers(numbers);
                }
                else if(option == 2){
                    interactions.randomGenerate(numbers);
                }
                else if(option == 3){
                    System.out.println("");
                }
                else{
                    System.out.println("You need to chose a valid option");
                }
            }catch(Exception e){
                System.out.println("You need to choose a valid option");
            }
            
        }while(option < 0 || option > 3);
        if(option != 3){
        int choice = 0;
        
        while(choice != 6){
            try{
                System.out.println("Choose an option \n"
                + "1)Print out the numbers in sequence \n"
                + "2)Print out the avarage of the numbers \n"
                + "3)Print out the total of the numbers \n"
                + "4)Print out the frequency of each number that appeared more than once \n"
                + "5)Display numbers in a descending order \n"
                + "6)Quit");
                
                choice = myKB.nextInt();
                
                
                if(choice == 1){
                    interactions.sequenceArrayNum(numbers);
                }
                else if (choice == 2){
                    interactions.calculateArrayAvg(numbers);
                }
                else if(choice == 3){
                    interactions.totalArray(numbers);
                }
                else if (choice == 4){
                    interactions.countFrequency(numbers);
                }
                else if(choice == 5){
                    interactions.descendingSequence(numbers);
                }
                else if(choice == 6){
                    System.out.println("");
                }
                else{
                    System.out.println("You need to chose a valid option");
                }
            }catch(Exception e){
                System.out.println("You need to chose a valid option");
                myKB.nextLine();
            }
        } 
        
    }
    }  
}   
    

