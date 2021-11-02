public class Operation {


    public String rps(String player1, String player2){
        String x;
        //rock =4
        //paper = 5
        //scissors = 8
        int a = player1.length();
        int b = player2.length();
        int total = a+b;
        if(total==13){
            if(a==8){
                x="Player 1 wins";
            }else{
                x="Player 2 wins";
            }
        }else if(total==12){
            if(a==8){
                x="Player 2 wins";
            }else{
                x="Player 1 wins";
            }
        }else if(total==9){
            if(a==5){
                x="Player 1 wins";
            }else{
                x="Player 2 wins";
            }
        }else{
            x="TIE";
        }

        return x;
    }

}
