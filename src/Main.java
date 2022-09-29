import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug();       //instantiation (creation)
        Bug dudette = new Bug();
        Bug tinydude = new Bug();

        dudette.speak();
        tinydude.speak();
        tinydude.speak();
        dudette.sayName();
        dude.sayName();

        int ans = dudette.multiplicator(7 , 9);
        out.println("the answer is " + ans);

        //static methods
        //mostly in library/helper classes

        out.println(Math.pow(3,7));

        //Random Numbers (RNG) (PNG)
        // Math.random() ==> [0.0,1.0]

        // range = upper - lower +1
        //(int)(Math.random() * range + lower)
    }
}