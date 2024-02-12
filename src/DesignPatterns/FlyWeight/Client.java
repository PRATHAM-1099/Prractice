package DesignPatterns.FlyWeight;

public class Client {
    public static void main(String[] args) {

        //One object per character

        Letter  l1 = LetterFactory.createLetter('t');
        l1.display(0,0);

        Letter  l2 = LetterFactory.createLetter('o');
        l1.display(0,1);
    }
}
