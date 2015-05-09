//Luke Simpson
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2b {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("Stuff.txt"));
        int nLongest = 0, nLetter;
        Character cLetter;
        String sWord, sLongest = null;
        do {
            String sSentence = fin.nextLine();
            String[] words = sSentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                sWord = words[i];
                if (sWord.length() > nLongest) {
                    sLongest = sWord;
                    nLongest = sLongest.length();
                }
            }
        } while (fin.hasNext());
        System.out.println("The Longest word is " + sLongest + " and it is " + nLongest + " letters long.");
    }
}

