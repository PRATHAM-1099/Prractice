package DesignPatterns.FlyWeight;

public class DocumentCharacter implements Letter{
    private char character;
    private String fontType;
    private int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int row, int column) {
        System.out.println(row + " And " + column + " " + character + " " + fontType + " " + size);
    }
}
