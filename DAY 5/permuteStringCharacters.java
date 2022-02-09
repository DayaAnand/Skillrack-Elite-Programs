public class permuteStringCharacters {
    private static void permute(char str[], int left, int right) {
        if(left==right){
            System.out.println(str);
            return;
        }
        for(int index=left;index<=right;index++){
            swap(str,left,index);
            permute(str,left+1,right);
            swap(str,left,index);
        }
    }

    private static void swap(char str[], int x, int y) {
        char temp=str[x];
        str[x]=str[y];
        str[y]=temp;
    }
    public static void main(String[] args) {
        String aa="rack";
        char[] str=aa.toCharArray();
        int len=str.length;
        permute(str,0,len-1);
    }

    
}
