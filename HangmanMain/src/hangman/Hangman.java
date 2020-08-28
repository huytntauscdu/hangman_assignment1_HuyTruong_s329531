/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author huytruongngotruong
 */
public class Hangman {
    
    //variable word bank for Hangman
    String[] wordBanks = {"DISAVOW", "KEYHOLE","QUIZZES", 
                         "WHOMEVER", "ZIGZIG", "WHEEZY", 
                         "UNWORTHY", "WHIZZING", "JOCKEY",
                         "MICROWAVE"};
    public static String[] answerArray;      //variable answer array, which is get 1 word from word bank
    public int indexWordBanks;         //variable get the index from word bank
    public static String[] emptyArray;      //variable for empty array to show in GUI
    StringBuilder stringbuilder = new StringBuilder();      //variable string builder
    public static String emptyBlankString;      //variable empty blank string 
    
    //constructor for hangman class
    public Hangman()
    {
        initialComponent();
    }
    
    //initial component method
    public final void initialComponent()
    {
        
    }
    
    //random word from word bank method
    public void randomWords()
    {
        answerArray = wordBanks[randomIndexWordBanks()].split("");
        emptyArray = new String[answerArray.length];
        for(int i = 0; i < answerArray.length ;i++)
        {
            emptyArray[i] = " ___ ";
            stringbuilder.append(emptyArray[i]);
        }
        emptyBlankString = stringbuilder.toString();

    }//End mothod random word from word bank
    
    //print random word from word bank
    public void printRandomWord()
    {
        System.out.println("answer: ");
        for(int i = 0; i < answerArray.length; i++)
        {
            System.out.print(answerArray[i] + " ");
        }
        System.out.println();
        System.out.println("empty array: ");
        for(int i = 0; i < emptyArray.length; i++)
        {
            System.out.print(emptyArray[i] + " ");
        }
    }//en random word method
    
    //Eandom index word banks
    public int randomIndexWordBanks()
    {
        Random rand = new Random(); 
        return rand.nextInt(wordBanks.length); 
    }
    //End of random index word bank mehod

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hangman hangmanRun = new Hangman();
        //hangmanRun.initialComponent();
        hangmanRun.randomWords();
        hangmanRun.printRandomWord();
        GUI gui = new GUI();
        gui.defaultResult();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        

        
    }
    
}
