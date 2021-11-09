

public class Gcd {


    public int gcd( Integer[] numbers){
        int x=0;

        for(int y: numbers){
            x = gcdNum(x,y);

            if(x == 1){
                return 1;
            }
        }
        return x;
    }

    public int gcdNum(int x, int y){

        if(x==0){
            return y;
        }
        else{
            return gcdNum(y%x,x);
        }
    }


}
