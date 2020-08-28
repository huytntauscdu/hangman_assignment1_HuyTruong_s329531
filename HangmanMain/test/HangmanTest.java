/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hangman.GUI;
import hangman.Hangman;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Integer;


/**
 *
 * @author huytruongngotruong
 */
public class HangmanTest {
    
    public String[] wordBanks = {"flapjack", "buzzard", "knapsack"};
    public int indexWordBanks;
    public String[] wordAnswer;
    
    Hangman hangmanClass;
    GUI guiClass;
    
    public HangmanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void compareLetterFromButtons()
    {
       String letterA = "A";
       String letterB = "B";
       String letterC = "C";
       String letterD = "D";
       String letterE = "E";
       String letterF = "F";
       String letterG = "G";
       String letterH = "H";
       String letterI = "I";
       String letterJ = "J";
       String letterK = "K";
       String letterL = "L";
       String letterM = "M";
       String letterN = "N";
       String letterO = "O";
       String letterP = "P";
       String letterQ = "Q";
       String letterR = "R";
       String letterS = "S";
       String letterT = "T";
       String letterU = "U";
       String letterV = "V";
       String letterW = "W";
       String letterX = "X";
       String letterY = "Y";
       String letterZ = "Z";
       hangmanClass = new Hangman();
       guiClass = new GUI();
       assertSame(letterA, guiClass.ButtonA.getText());
       assertSame(letterB, guiClass.ButtonB.getText());
       assertSame(letterC, guiClass.ButtonC.getText());
       assertSame(letterD, guiClass.ButtonD.getText());
       assertSame(letterE, guiClass.ButtonE.getText());
       assertSame(letterF, guiClass.ButtonF.getText());
       assertSame(letterG, guiClass.ButtonG.getText());
       assertSame(letterH, guiClass.ButtonH.getText());
       assertSame(letterI, guiClass.ButtonI.getText());
       assertSame(letterJ, guiClass.ButtonJ.getText());
       assertSame(letterK, guiClass.ButtonK.getText());
       assertSame(letterL, guiClass.ButtonL.getText());
       assertSame(letterM, guiClass.ButtonM.getText());
       assertSame(letterN, guiClass.ButtonN.getText());
       assertSame(letterO, guiClass.ButtonO.getText());
       assertSame(letterP, guiClass.ButtonP.getText());
       assertSame(letterQ, guiClass.ButtonQ.getText());
       assertSame(letterR, guiClass.ButtonR.getText());
       assertSame(letterS, guiClass.ButtonS.getText());
       assertSame(letterT, guiClass.ButtonT.getText());
       assertSame(letterU, guiClass.ButtonU.getText());
       assertSame(letterV, guiClass.ButtonV.getText());
       assertSame(letterW, guiClass.ButtonW.getText());
       assertSame(letterX, guiClass.ButtonX.getText());
       assertSame(letterY, guiClass.ButtonY.getText());
       assertSame(letterZ, guiClass.ButtonZ.getText());
    }
    
    
    @Test
    public void checkLifePlayer()
    {
        int tempt = 7;
        hangmanClass = new Hangman();
        guiClass = new GUI();
        hangmanClass.randomWords();
        guiClass.compareWord(guiClass.ButtonA.getText());
        assertSame(tempt, guiClass.playerLife);
    }
    
}
