import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class equalAlphaNDigits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str=in.nextLine();
        int counter=0,position=0,maxlen=0;
        Map<Integer,Integer> startposmap=new HashMap<>();
        startposmap.put(counter, position);
        for(char ch:str.toCharArray()){
            position++;
            if(Character.isAlphabetic(ch)){
                counter++;
            }
            else{
                counter--;
            }
            if(startposmap.containsKey(counter)){
                int currLen=position-startposmap.get(counter);
                // System.out.println("curr "+currLen);
                if(currLen>maxlen){
                    maxlen=currLen;
                }
            }
            else{
                startposmap.put(counter, position);
            }
        }
        for (int key: startposmap.keySet()) {
            System.out.println("key : " + key);
            System.out.println("value : " + startposmap.get(key));
        }
        System.out.println("ans"+maxlen);
    }   
}
