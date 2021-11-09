/*
2) Create a function that takes an array of numbers and returns the greatest common factor of those numbers.
    Examples
        gcd({84, 70, 42, 56}) --> 14
        gcd({19, 38, 76, 133}) --> 19
        gcd({120, 300, 95, 425, 625}) --> 5
    Notes
        The GCD is the largest factor that divides all numbers in the array.

 */
public class Main {


    public static void main(String [] args){
        Gcd g = new Gcd();
        Integer [] x=  {84, 70, 42, 56};
        System.out.println(g.gcd(x));

        Integer [] y = {19, 38, 76, 133};
        System.out.println(g.gcd(y));

        Integer [] z = {120, 300, 95, 425, 625};
        System.out.println(g.gcd(z));
    }
}
