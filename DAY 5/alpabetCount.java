public class alpabetCount {
    public static void main(String[] args) {
        String str="apple";
        int ascii[]= new int[128];
        for(int i=0;i<str.length();i++){
            ascii[str.charAt(i)]++;
        }
        for(int i=0;i<128;i++){
            if(ascii[i]!=0){
                System.out.print((char)i);
                System.out.print(ascii[i]);
            }
        }
    }
}
