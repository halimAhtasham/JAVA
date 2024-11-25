import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sentence = input.nextLine();

        Sentence = Sentence.trim();
        String [] words = Sentence.split(" ");

        int numOfWords = words.length;
        PigLatinClass obj = new PigLatinClass();
        String msg = "";


        for (int i = 0; i < numOfWords; i++) {
            msg = msg + obj.pigLatin(words[i]) + " ";
        }
        System.out.println(msg);
        input.close();
    }
}

class PigLatinClass {
    String pigLatin(String s1){
        int len = s1.length();
        char [] c = new char[len];
        s1.getChars(0, len, c, 0);
        String s2 = new String(c, 1, len-1);
        String s3 = new String(c, 0, 1);
        String s4 = s2 + s3 + 'a';
        return s4;
    }
}