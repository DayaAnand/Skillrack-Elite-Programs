import java.util.*;
public class combinationSorted {

    public static void main(String[] args) {
		//Your Code Here
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		List<String> values = new ArrayList<>(); // << left shift
		for(int ctr=1;ctr<(1<<str.length());ctr++){ //(2 power n) - 1  // if str=abc so (2 power 3)-1=7
		    StringBuilder sb= new StringBuilder();
		    for(int bmi=0;bmi<str.length();bmi++){ //bmi=bit mas index
		        if((ctr&(1<<bmi)) !=0){
		            sb.append(str.charAt(bmi));
		        }
		    }
		    values.add(sb.toString());
		}
		Collections.sort(values);
		for(String val:values){
		    System.out.println(val);
		}
	}
}