import java.util.Arrays;
/*
    2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    Examples
squarePatch(3) --> [
[3, 3, 3],
[3, 3, 3],
[3, 3, 3]
]

squarePatch(5) --> [
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5]
]

squarePatch(1) --> [
[1]
]

squarePatch(0) --> []
Notes
n >= 0.
If n = 0, return an empty array.
 */
public class Main {

    public static void main(String [] args){

        Square s = new Square();
        //System.out.println(Arrays.deepToString(s.square(5)));

        int [][] x = s.square(3);
        for(int i =0; i<x.length;i++){
            System.out.println(Arrays.toString(x[i]));
        }

        int [][] y = s.square(5);
        for(int j =0; j<y.length; j++){
            System.out.println(Arrays.toString(y[j]));
        }

        int [][] z = s.square(1);
        for(int k=0; k<z.length;k++){
            System.out.println(Arrays.toString(z[k]));
        }
        System.out.println(Arrays.deepToString(s.square(0)));

    }
}
