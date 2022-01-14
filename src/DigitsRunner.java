import javax.sound.midi.Soundbank;

public class DigitsRunner {
    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        System.out.println(d1); //Should print [1,5,7,0,4]

        Digits d2 = new Digits(0);
        System.out.println(d2); //Should print [0]

        System.out.println(new Digits(7).isStrictlyIncreasing());//Should print true
        System.out.println(new Digits(1356).isStrictlyIncreasing());//Should print true
        System.out.println(new Digits(1336).isStrictlyIncreasing());//Should print false
        System.out.println(new Digits(1536).isStrictlyIncreasing());//Should print false
        System.out.println(new Digits(65310).isStrictlyIncreasing());//Should print false



    }
}
