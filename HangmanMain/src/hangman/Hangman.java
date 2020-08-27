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
    
    //String filename = "words.txt";
    String[] wordList;
    String[] wordBanks = {"DISAVOW", "KEYHOLE","QUIZZES", 
                         "WHOMEVER", "ZIGZIG", "WHEEZY", 
                         "UNWORTHY", "WHIZZING", "JOCKEY","MICROWAVE"};
    public static String[] answer;
    public int index;
    public static String[] resultArray;
    StringBuilder stringbuilder = new StringBuilder();
    public static String resultstring;
    
    
    public Hangman()
    {
        initialComponent();
    }
    
    public final void initialComponent()
    {
        
    }
    
    public void randomWords()
    {
        //index = randomIndex();
        answer = wordBanks[randomWordBank()].split("");
        resultArray = new String[answer.length];
        for(int i = 0; i < answer.length ;i++)
        {
            resultArray[i] = " ___ ";
            stringbuilder.append(resultArray[i]);
        }
        resultstring = stringbuilder.toString();
        System.out.println("answer: ");
        for(int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
        System.out.println("result array: ");
        for(int i = 0; i < resultArray.length; i++)
        {
            System.out.print(resultArray[i] + " ");
        }
    }
    
    public int randomWordBank()
    {
        Random rand = new Random(); 
        return rand.nextInt(wordBanks.length); 
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hangman hangmanRun = new Hangman();
        //hangmanRun.initialComponent();
        hangmanRun.randomWords();
        GUI gui = new GUI();
        gui.defaultResult();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        //gui.guessButtonVisible();
        //hangman.printWord();
        //hangman.initialWord();
        //hangman.readFile(filename);
        
    }
    
}
