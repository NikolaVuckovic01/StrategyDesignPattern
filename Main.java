public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.doEat();
        dog.setEatBehavior(new ProteinDiet());
        dog.doEat();
        dog.doBark();
        dog.setBarkBehavior(new Growl());
        dog.doBark();
    }
}
