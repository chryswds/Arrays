/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysinteractions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import inpututils.InputUtils;

/**
 *
 * @author chrystiandybas
 */
public class ArraysInteractions {
    
    /**
    *code that let the user choose the numbers that will go in the array
    * do not allow text at all
    * if any text entered - display an error and ask again
    * @param numbers The numbers that will fill the array
    */
    public void chooseNumbers(int[] numbers){
        for ( int i = 0; i < numbers.length; i++ ){
            InputUtils myInput = new InputUtils();
            
            numbers[i] = myInput.askUserForInt("enter number " + (i+1));
        } 
    }
    /**
    *code that generate random numbers to fill the array
    * numbers chosen are between -100 and 100
    * @param numbers The numbers that will fill the array
    */
    public void randomGenerate(int[] numbers){
        
        Random rd = new Random();
        
        for(int i = 0; i<numbers.length; i++){
            numbers[i]= rd.nextInt(201) - 100; 
        }
    }
    /**
    * code that shows how many times the numbers appeared in the array
    * only shows numbers that appear more than once in the array
    * @param numbers The numbers that will fill the array
    */
    public void countFrequency(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        boolean repeatedNumbersFound = false;
        
        for (int i : numbers) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        System.out.println("Frequency of each number in the array:");
        for (int i : frequencyMap.keySet()) {
            if (frequencyMap.get(i) > 1){
            System.out.print(i + " appeared " + frequencyMap.get(i) + " times || ");
            repeatedNumbersFound = true;
            }
        }
        if (!repeatedNumbersFound) {
        System.out.println("There were no repeated numbers in this array");
    } else {
        System.out.println("");
    }
    }
    /**
    * code that prints the sum of all the numbers in the array
    * @param numbers The numbers that will fill the array
     * @return the sum of all numbers
    */
    public int totalArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("The total sum of the numbers in the array is " + sum);
        return 0; 
    }
    /**
    * code that prints the numbers in the array in an ascending sequence
    * @param numbers The numbers that will fill the array
     * @return numbers in an ascending sequence
    */
    public int sequenceArrayNum(int[] numbers){
        
        Arrays.sort(numbers);
        System.out.print("The numbers in sequence are ");
        for(int i : numbers){
            System.out.print( i + " ");
        }
        System.out.println("");
        return 0;
    }
    /**
    * code that prints the numbers in the array in a descending sequence
    * @param numbers The numbers that will fill the array
     * @return numbers in a descending sequence
    */
    public int descendingSequence(int[] numbers){
        Arrays.sort(numbers);
        for(int i = numbers.length-1; i>=0;i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        return 0;
    }
    /**
    * code that prints the average of the numbers in the array
    * @param numbers The numbers that will fill the array
     * @return the average of the number in the array
    */
    public double calculateArrayAvg(int[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("The avarage is " + sum / numbers.length);   
        return 0;      
    }
}
    

