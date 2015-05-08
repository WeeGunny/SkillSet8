//Luke Simpson
import java.util.*;
import java.io.*;

public class e1g {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("Checks.txt"));
        String sFirst,sLast;
        int nChecks;
        double dCharge=0;
        for (int i = 0; i < 5; i++) {
            sFirst = fin.next();
            sLast = fin.next();
            nChecks = fin.nextInt();
            for(int n=1;n<=nChecks;n++){
                if(n>5){
                    dCharge+=0.15;
                }
            }
            System.out.println(sFirst+" "+sLast+" "+ "$"+dCharge);
        }


    }
}
