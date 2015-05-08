//Luke Simpson
import java.util.*;
import java.io.*;

public class e1h {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("GCD.txt"));
        int nNum1,nNum2,nGCD = 0;
        for(int i=0;i<4;i++){
            nNum1 = fin.nextInt();
            nNum2 = fin.nextInt();
            for(int n=1;n<=nNum2;n++)
              if(nNum2%n==0&&nNum1%n==0){
                  nGCD=n;
              }  
            System.out.println(nGCD);
        }
    }
}
