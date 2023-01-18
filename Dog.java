public class Dog {
    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;

    public Dog(){
        eatBehavior = new NormalDiet();
        barkBehavior = new PlayfulBark();
    }
    public void setEatBehavior(EatBehavior eb){
        eatBehavior=eb;
    }
    public void setBarkBehavior(BarkBehavior bb){
        barkBehavior=bb;
    }
    public void doEat(){
        eatBehavior.eat();
    }
    public void doBark(){
        barkBehavior.bark();
    }
}
