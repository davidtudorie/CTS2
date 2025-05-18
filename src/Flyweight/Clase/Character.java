package Flyweight.Clase;

public class Character {
    char character;
    Font font;

    public Character(char character, Font font) {
        this.character = character;
        this.font = font;
    }

    public void print(){
        System.out.println(this.character +" "+ font.toString());
    }

}
