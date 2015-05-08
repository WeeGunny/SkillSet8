//Luke Simpson
import java.util.*;
import java.io.*;

public class e1a {

    public static void main(String[] args)throws IOException {
        Scanner fin = new Scanner(new FileReader("81aIN.txt"));
        int arnNum[] = new int[4];
        double dAvg=0;
        double dHighest=0;
        int nStudent=0;
        for (int i = 0; i < 4; i++) {// read in 4 lines of marks.
            for (int j = 0; j < 4; j++) { // 4 marks per line
                arnNum[j] = fin.nextInt();
                System.out.print(arnNum[j] + " ");
                dAvg+=arnNum[j];
            }
            dAvg=dAvg/4;
            if(dAvg>dHighest){            
              dHighest=dAvg;
              nStudent=i+1;
            }  System.out.print(" Their Average is "+dAvg);
            System.out.println();
            
        }
        System.out.println("The Student with the highest Average is student  "+nStudent);
        fin.close();
    }
}
