package lab4.animals;

public class Snake extends Animal {//dziedziczy przejmuje wszystkie pola i metody z animal
    public Snake(String name) {
        super(name, 0);//wywolanie konstruktora
    }

    @Override //nadpisuje metode, zdeklarowana w klasie animal
    public String getDescription() {
        return "waz " + name + "  l. nog " + legs;
    }
    @Override//nastepna metoda
    public void makeSound() {
        System.out.println(name + " ssssss");
    }
}

