
/*
 1) Given an array of integers representing stock price on single day, find max profit that
 can be earned by 1 transaction. So you need to find pair (buyDay,sellDay) where buyDay < = sellDay
 and it should maximise the profit.

    For example :
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        Max profit can be gain by buying at 1st day(0 based indexing) and sell at 4th day.
        Max profit = 99-12 =87
 */
public class Main {

    public static void main(String [] Args){
        Profit p = new Profit();
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        int [] res=  p.mProfit(arr);
        System.out.println(" Max profit can be gain by buying at the "+ res[0] +"th day and selling at the "+ res[1]+ "th day"
        +" to receive a max profit of "+ res[2]);

        int arr2[]={33,21,43,1021,332,37};
        int [] res2=  p.mProfit(arr2);
        System.out.println(" Max profit can be gain by buying at the "+ res2[0] +"th day and selling at the "+ res2[1]+ "th day"
                +" to receive a max profit of "+ res2[2]);


    }

}
