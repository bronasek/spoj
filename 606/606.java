// ID 606
// PP0502B - Tablice
// Odwróć kolejność elementów w tablicy.
// 
// Wejście
// Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (n ≤ 100) i n liczb oddzielonych spacjami.
// 
// Wyjście
// Dla każdego testu n liczb w porządku odwrotnym niż na wejściu.
// 
// Przykład
// Wejście:
// 2
// 7 1 2 3 4 5 6 7
// 3 3 2 11
// 
// Wyjście:
// 7 6 5 4 3 2 1
// 11 2 3

import java.io.*;

public class Tablice {                                  // id 606

    public static void main(String[] args) {            // PP0502B
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- > 0) {
                String[] ciag = br.readLine().split(" ");
                int ile = Integer.parseInt(ciag[0]);
                
                for (int i = ile; i > 0; i--) {
                    pw.print(ciag[i]);
                    if (i != 1) pw.print(" ");
                    
                }
                pw.println();
            }
            
            br.close();
            pw.close();
            
        } catch(Exception e) {
            return;
        }
    }
}