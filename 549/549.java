// ID 549
// RNO_DOD - Proste dodawanie
// Twoim zadaniem jest dodać wszystkie liczby całkowite podane na wejściu.
// 
// Wejście
// W pierwszym wierszu znajduje się liczba t testów (0 < t < 100) Każdy test opisany jest w następujący sposób. W pierwszym wierszu dana jest liczba n - liczba liczb do zsumowania. Następnie podanych jest n liczb pooddzielanych spacją.
// 
// Przykład
// Input:
// 2
// 5
// 1 2 3 4 5
// 2
// -100 100
// 
// Output:
// 15
// 0

import java.io.*;

public class ProsteDodawanie {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- > 0) {
                int dT = Integer.parseInt(br.readLine());
                String[] ciag = br.readLine().split(" ");
                int wynik = 0;
                
                for (int i = 0; i < dT; i++) {
                    wynik += Integer.parseInt(ciag[i]);
                }
                pw.println(wynik);
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}