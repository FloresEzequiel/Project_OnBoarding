import java.util.List;

public class Square {

    public int [] [] square (int x){
        int [][] result = new int[x][x];

        for(int i=0; i<x;i++){
            for(int j=0; j<x;j++){
                result[i][j]=x;
            }
        }
        return result;
    }




}
