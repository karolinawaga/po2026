package lab4.zadania;

import lab4.animals.Animal;
import lab4.animals.Dog;
import lab4.animals.Parrot;
import lab4.animals.Snake;

import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        //tab na 100
        Animal[] animals = new Animal[100];
        Random random = new Random();

        //tap pomocnicz do los typu zwierz
        String[] typy = {"Dog", "Parrot", "Snake"};

        //tab wypelniona losowymi zwierzetami
        for (int i = 0; i < animals.length; i++) {
            String wylosowanyTyp = typy[random.nextInt(typy.length)];

            if (wylosowanyTyp.equals("Dog")) {
                animals[i] = new Dog("Pies" + i);
            } else if (wylosowanyTyp.equals("Parrot")) {
                animals[i] = new Parrot("Papuga" + i);
            } else {
                animals[i] = new Snake("Waz" + i);
            }
        }

        //Suma wszystkich nog
        int sumaNog = 0;
        for (Animal animal : animals) {
            sumaNog += animal.getLegs();

            animal.makeSound();
        }


        System.out.println("suma l.nog " + sumaNog);
    }
}