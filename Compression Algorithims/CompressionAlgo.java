import java.util.*;

public class CompressionAlgo{
    public static void Compress(String s){
        
        for(int i = 0 ; i < s.length(); i++){
            int count = 1;
            while(s.length()-1 > i && s.charAt(i) == s.charAt(i+1)){
                count ++;
                i ++;
            }

            if(count == 1){
                System.out.print(s.charAt(i) +  "" + count);
            }
            else{
                System.out.print(s.charAt(i) + "" + count);
                
            }
        }
    }
    //to run add main method with input of a string and output using a print line.
} 
