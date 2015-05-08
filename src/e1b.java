//Luke Simpson
import java.util.*;
import java.io.*;

public class e1b {

    public static void main(String[] args) throws IOException {
        String sName, sFirst, sLast;
        boolean bFirst, bLast;
        Scanner fin = new Scanner(new FileReader("Names.txt"));
        for (int n = 0; n < 6; n++) {
            sName = fin.nextLine();
            String[] split = sName.split(" ");
            sFirst = split[0];
            sLast = split[1];
            bFirst = Correct(sFirst);
            bLast = Correct(sLast);
            if (bFirst == true) {
                System.out.print(sFirst+" ");
            }
            if (bLast == true) {
                System.out.print(sLast);
            }
            System.out.println();
        }
    }

    public static boolean Correct(String sName) {
        Character cLetter;
        Character cFirst = sName.charAt(0);
        for (int i = 1; i < sName.length(); i++) {
            cLetter = sName.charAt(i);
            if (Character.isUpperCase(cLetter)) {
                return false;
            }
        }
        if (Character.isLowerCase(cFirst)) {
            return false;
        } else {
            return true;
        }

    }
}
