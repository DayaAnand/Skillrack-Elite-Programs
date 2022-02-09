import java.util.*;
public class photographHeight {

    public static void main(String[] args) {
		//Your Code Here
        Scanner in = new Scanner(System.in);
        String firstLine[] = in.nextLine().split(",");
        int N=Integer.parseInt(firstLine[0].trim());
        int K=Integer.parseInt(firstLine[1].trim());
        String names="ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0,N); //getting the range of alpabets for caculation
        List<String>photos = new ArrayList<>();
        for(int ctr=1;ctr<=K;ctr++){
            photos.add(in.nextLine().trim().replaceAll(",",""));
        }
        boolean missing=false;
        for(Character name:names.toCharArray()){
            int relCount=0;
            Queue<Character> queue = new ArrayDeque<>();
            List<Character> visited = new ArrayList<>();
            queue.add(name);
            visited.add(name);
            
            while(!queue.isEmpty()){ //loop to calculate for all successors
                Character student = queue.poll();
                for(String seq: photos){
                    if(seq.contains(student.toString())){
                        String succ=seq.substring(seq.indexOf(student)); //succ - successor
                        for(Character succStud:succ.toCharArray()){
                            if(!visited.contains(succStud)){
                                queue.add(succStud);
                                visited.add(succStud);
                                relCount++;
                            }
                        }
                    }
                }
            }
            
            queue.add(name);
            while(!queue.isEmpty()){ //loop to calculate for all predessors
                Character student = queue.poll();
                for(String seq: photos){
                    if(seq.contains(student.toString())){
                        String pred=seq.substring(0,seq.indexOf(student));//substring alone chamges here
                        for(Character predStud:pred.toCharArray()){
                            if(!visited.contains(predStud)){
                                queue.add(predStud);
                                visited.add(predStud);
                                relCount++;
                            }
                        }
                    }
                }
            }

            if(relCount!=N-1){
                System.out.print(name+" ");
                missing=true;
            }
        }
        if(!missing){
            System.out.print("N/A");
        }
	}
}
