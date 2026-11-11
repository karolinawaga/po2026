package lab4.animals;

public abstract class Animal {
        protected String name;
        protected int legs;

        // konstruktor
        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        //metoda abstrakcyjna, kazde zwierze po swojemu nadaje nazw, dzwieki
        public abstract String getDescription();
        public abstract void makeSound();

        //metoda do pobierania l.nog
        public int getLegs() {
            return legs;
        }
}

