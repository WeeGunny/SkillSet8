//Luke Simpson
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e2a {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("Stuff.txt"));
        int nWords = 0;
        do {
            String sSentence = fin.nextLine();
            String[] words = sSentence.split(" ");
            nWords += words.length;
        } while (fin.hasNext());
        System.out.println(nWords);
    }
}
