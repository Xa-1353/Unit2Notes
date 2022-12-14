import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Bug dude = new Bug(s; 35, f:false);       //instantiation (creation)
        Bug dudette = new Bug(s:40, t:true);
        Bug tinydude = new Bug();

        dudette.speak();
        tinydude.speak();
        tinydude.speak();
        dudette.sayName();
        dude.sayName();

        dude.setFly(true);
        dudette.setSize(40);

        int ans = dudette.multiplicator(7 , 9);
        out.println("the answer is " + ans);

        //static methods
        //mostly in library/helper classes

        out.println(Math.pow(3,7));

        //Random Numbers (RNG) (PNG)
        // Math.random() ==> [0.0,1.0]

        // range = upper - lower +1
        //(int)(Math.random() * range + lower)

        int d6 = (int)(Math.random()*6 + 1);
        out.println("you rolled: " + d6);
    }
}