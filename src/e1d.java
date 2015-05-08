
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class e1d {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("Wages.txt"));
        String sInitial, sName;
        double dWage, dHours, dTotal;
        for (int i = 0; i < 4; i++) {
            sInitial = fin.next();
            sName = fin.next();
            dWage = fin.nextDouble();
            dHours = fin.nextDouble();
            dTotal = dWage * dHours;
            if (dTotal >= 300) {
                System.out.println(sInitial + sName + " Makes " + dTotal);
            }
        }
    }
}
