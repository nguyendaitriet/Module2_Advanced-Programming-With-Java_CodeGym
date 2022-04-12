public class Test {
    public static void main(String[] args) {
        Animal myChicken = new Chicken();
        Animal myTiger = new Tiger();
        System.out.println(((Chicken) myChicken).howToEat());
        System.out.println(myChicken.makeSound());
        System.out.println(myTiger.makeSound());
        Fruit myMango = new Mango();
        Fruit myWatermelon = new Watermelon();
        System.out.println(myMango.howToEat());
        System.out.println(myWatermelon.howToEat());

    }
}
