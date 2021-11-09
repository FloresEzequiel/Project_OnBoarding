

public class Profit {

    int [] mProfit(int [] arr){
        int [] result = new int[3];

        int buyDay=0;
        int sellDay=0;
        int maxProfit;
        for(int i =0; i<arr.length;i++){
            if(i==0){
                buyDay = arr[i];
            }else{
                if(buyDay>arr[i]){
                    buyDay=arr[i];
                }
            }
        }

        for(int j=0;j<arr.length;j++){
            if(j==0){
                sellDay = arr[j];
            }else{
                if(sellDay<arr[j]){
                    sellDay = arr[j];
                }
            }
        }

        maxProfit = sellDay-buyDay;
        result[0] = buyDay;
        result[1] = sellDay;
        result[2] = maxProfit;
        return result;

    }
}
