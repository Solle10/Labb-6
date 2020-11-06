package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HangmanGuiTests {


    @Test
    public void TestHowManyWordsAnLetterHaveMaximum() {
        HangmanWordList list = new HangmanWordList();
        list.getWordCount();
        assertEquals(10, list.getWordCount());

    }

    @Test
    public void GetCorrectWordFromWordList() {
        HangmanWordList list = new HangmanWordList();
        list.getWordCount();
        assertEquals("MOVIE", list.getWord(8));
    }

    @Test
    public void NumberofGuesses(){
        HangmanGui hangman = new HangmanGui();
        assertEquals(8, hangman.getNumOfGuess());
    }

}















