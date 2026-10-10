package OOPSConcepts;

public class vaishnavip extends prashantv implements A, B {

    @Override
    public void eat() {
        System.out.println("prashant and vaishnavi eating pizza");
    }

    @Override
    public void walk() {
        System.out.println(" and walking FC Road");
    }

    public static void main(String[] args) {
        vaishnavip v = new vaishnavip();

        v.eat();
        v.walk();
    }
}