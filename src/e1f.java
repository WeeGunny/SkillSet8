//Luke Simpson
import java.util.*;
import java.io.*;

public class e1f {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("Marks.txt"));
        Scanner fin2 = new Scanner(new FileReader("Choices.txt"));
        Scanner sin = new Scanner(System.in);
        String sFirst, sLast, sChoice;
        int nEnglish, nMath, nHistory, nAvg, nChoice;
        for (int n = 0; n < 5; n++) {
            sChoice = fin2.nextLine();
            System.out.println(sChoice);
        }
        nChoice = sin.nextInt();
        for (int i = 1; i <= 7; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            nHistory = fin.nextInt();
            nMath = fin.nextInt();
            nEnglish = fin.nextInt();
            nAvg = (nMath + nEnglish + nHistory) / 3;

            if (nChoice == 1) {
               System.out.print(sFirst + " "+sLast+" ");
                System.out.println(nAvg);
            }
            if (nChoice == 2) {
                if (nHistory > 80) {
                   System.out.println(sFirst + " "+sLast);
                }
            }
            if (nChoice == 3) {
                if (nEnglish > 50 && nMath > 50 && nHistory > 50) {
                   System.out.println(sFirst + " "+sLast);
                }
            }
            if (nChoice == 4) {
                if (nEnglish > 50 || nMath > 50) {
                   System.out.println(sFirst + " "+sLast);
                }
            }
            if (nChoice == 5) {
                for (int f = 0; f <= 2;) {
                    if (nEnglish < 50) {
                        f++;
                    } else if (nMath < 50) {
                        f++;
                    } else if (nHistory < 50) {
                        f++;
                    }
                    if (f >=2) {
                        System.out.println(sFirst + " "+sLast);
                        break;
                    }
                }
            }
        }
    }
}
