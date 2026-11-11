package lab4.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }

    @Override
    public String getDescription() {
        return "Pies " + name + "liczba nog " + legs;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " hau hauuu");
    }
}