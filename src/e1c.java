//Luke Simpson
import java.util.*;
import java.io.*;

public class e1c {

    public static void main(String[] args) throws IOException {
        int e = 0;
        Scanner fin = new Scanner(new FileReader("Stuff.txt"));
        String sSentence = fin.nextLine();
        Character cLetter;
        String[] words = sSentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                cLetter = words[i].charAt(j);
                if (cLetter == 'e' || cLetter == 'E') {
                    e++;
                }
            }
            System.out.println(words[i].length()+" Letter in word "+(i+1));
        }
        System.out.println("There are " + words.length + " words");
        System.out.println("There are " + e + " Letter e'");
        
    }
}
