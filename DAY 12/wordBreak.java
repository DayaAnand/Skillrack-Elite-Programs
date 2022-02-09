import java.util.*;

public class wordBreak {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String words[] = in.nextLine().split("\\s+"); //splitting with spaces
        String str = in.nextLine();
        List<String> wordsList = Arrays.asList(words);
        breakWord(wordsList, str, "", 0);
    }

    public static void breakWord(List<String> wordsList, String str, String output, int start) {
        if (start == str.length()) { //base condtion for recursion //to print the string
            System.out.println(output.trim());
            return;
        }
        for (int index = start; index < str.length(); index++) {
            String word = str.substring(start, index + 1); // in substring the last argument is exclusive
            if (wordsList.contains(word)) {
                breakWord(wordsList, str, output + word + " ", index + 1);
            }
        }
    }
}
