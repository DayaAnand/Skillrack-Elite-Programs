public class firstRepeatingCharacter {
    public static void main(String[] args) {
        String str="abcbaa";
        int ascii[]= new int[128];
        for(int i=0;i<str.length();i++){
            ascii[str.charAt(i)]++;
        }
        for(int i=0;i<128;i++){
            if(ascii[i]==2){
                System.out.print((char)i);
                return;
            }
        }
        // for(int l=0;l<128;l++){ //I think we cannot print the hashed array
        //     System.out.println(ascii[l]);
        // }

    }
}
