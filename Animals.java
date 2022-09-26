import Animal.Mammal.Dog;

// Question 3: create class Animal with method void eat and print I am a omnivorous.
// another class Mammal extend Animal with method void nature and prints I am a Mammal.
// another class Dog extends Mammal with method void sound and prints I bark.
// create a main method and object of class and call all the methods.
// 👆🏻also method the inheritance type on the top of the program.

// extends 

public class Animals {
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.eat();
        ob.nature();
        ob.sound();

    }
}