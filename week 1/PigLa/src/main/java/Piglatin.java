import java.util.Locale;

public class Piglatin {


    public String pL(String word){
        String x="";
        StringBuilder a = new StringBuilder();
        String [] split = word.split(" ");
        int count=0;
        for(String y: split){
            String temp =y.substring(0,1).toLowerCase();

            if(temp.equals("a")||temp.equals("e")||temp.equals("i")||temp.equals("o")||temp.equals("u")){

               if(y.contains(".")){
                   a.append(y,0,y.length()-1);
                   a.append("way");
                   a.append(y,y.length()-1,y.length());
               }else{
                   a.append(y);
                   a.append("way");
                   a.append(" ");
               }
            }else{

                if(count==0){
                    a.append(y.toUpperCase(),1,2);
                    a.append(y,2,y.length());
                    a.append(temp);
                    a.append("ap");
                    a.append(" ");
                    count+=1;
                }else if(y.contains(".")){
                    a.append(y,1,y.length()-1);
                    a.append(temp);
                    a.append("ap");
                    a.append(".");

                }else{
                    a.append(y,1,y.length());
                    a.append(temp);
                    a.append("ap");
                    a.append(" ");
                }


            //    System.out.println(y);
               // System.out.println(temp);
              //  System.out.println(a);
            }

        }

        return a.toString();
    }

}
