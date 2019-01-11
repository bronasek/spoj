// ID 708
// PTCLTZ - Problem Collatza
// Dany jest ciąg xn określony rekurencyjnie:
// x0=s, 
// xn+1=3*xn+1, jeśli xn jest nieparzyste i 
// xn+1=xn/2, jeśli xn jest parzyste
// 
// Napisz program, który oblicza pierwsze takie n, dla którego xn=1.
// 
// Wejście
// 
// 
// W pierwszej linii liczba testów t. W każdym z t kolejnych wierszy jedna liczba całkowita s, 1 <= s <= 10000.
// 
// Wyjście
// W każdej linii jedna liczba - obliczona wartość n.
// 
// Przykład
// Wejście:
// 5
// 1 
// 2
// 8
// 3
// 567
// Wyjście:
// 0
// 1
// 3
// 7
// 61

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProblemCollatza {                          //id 708

    public static void main(String[] args) {            // PTCLTZ

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                int s = Integer.parseInt(br.readLine());
                int n = 0;
                
                while (s > 1) {
                    s = s % 2 == 0 ? s / 2 : 3 * s + 1;
                    n++;
                }
                pw.println(n);
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}