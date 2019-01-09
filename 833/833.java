// ID 833
// BINOMS - Dwumiany
// Dla liczb całkowitych n i k, 0 <= k <= n <= 1000, wyznacz liczbę różnych k-elementowych podzbiorów zbioru n-elementowego. Liczby n i k będą dobrane tak, aby wynik nie przekroczył 1 000 000 000.
// 
// Input
// T [ liczba testów, T <= 10000 ]
// n_1 k_1
// n_2 k_2
// ...
// n_T k_T
// 
// Output
// wynik_1
// wynik_2
// ...
// wynik_T
// 
// Przykład
// Input:
// 3
// 0 0
// 7 3
// 1000 2
// 
// Output:
// 1
// 35
// 499500

import java.io.*;

public class Dwumiany {                              // id 833
    
    public static void main(String[] args) {         // BINOMS
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- > 0) {
                String [] dane = br.readLine().split(" ");
                int a = Integer.parseInt(dane[0]);
                int b = Integer.parseInt(dane[1]);
                
                pw.println(licz(a, b));
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
    
    public static long licz(int a, int b) {
        
        if ( b > a/2 ) {
            b = a - b;
        }
        
        if (b == 0 || b == a) {
            return 1;
        }
        long wynik = a - b + 1;
        for (int i = 2; i <= b; i++) {      
            wynik = wynik * (a - b + i);
            wynik = wynik / i;
        }
        return wynik;
        
    }
}