public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "chuck chuck";
    }

    @Override
    public String howToEat() {
        return "boiled";
    }
}
