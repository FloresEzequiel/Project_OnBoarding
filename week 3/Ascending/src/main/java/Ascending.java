import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    /*
        1) Write a function that returns true if a string consists of
            ascending or ascending AND consecutive numbers.
           Examples
            ascending("223425") --> true
            // Consecutive numbers 23, 24, 25
            ascending("2324256") --> false
            // No matter how this string is divided, the numbers are not consecutive.
            ascending("444445") --> true
            // Consecutive numbers 444 and 445.
           Notes
                A number can consist of any number of digits, so long as the numbers
                are adjacent to each other, and the string has at least two of them.
     */
    boolean ascend(String word){
        boolean x=false;

        List<String> num = new ArrayList<>();
        //232425
        for(int j=1; j<=word.length()/2;j++){
            for(int i =0; i<word.length();i++){
                if(i+j<=word.length()){
                    if(j==1){
                        num.add(word.substring(i,i+j));
                    }else if(j==2){
                        num.add(word.substring(i,i+j));
                        i=i+1;

                        if(i==word.length()||i>word.length()||i==word.length()-2){
                            num.add(word.substring(word.length()-1));
                        }
                    }
                    else if(j==3){
                        num.add(word.substring(i,i+j));
                        i=i+2;

                    }

                }
            }

            for(int k=0; k<num.size()-1;k++){
                int num1 = Integer.parseInt(num.get(k));
                int num2 = Integer.parseInt(num.get(k+1));


                if(num1<num2&&num1+1==num2){
                    x=true;

                }else{
                   x= false;
                   break;
                }
            }

            if(x){
                break;
            }else{
                num.clear();
            }

        }
        return x;
    }
}
