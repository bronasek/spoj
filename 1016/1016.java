// ID 1016
// VSR - Predkość średnia
// Pociąg z miejscowości A do B jedzie z prędkością v1, a wraca z miejscowości B do A z prędkością v2. Obliczyć średnią prędkość na całej trasie. Uwaga: Dane wejściowe będą tak dobrane, aby wynik był liczba całkowitą.
// 
// Wejście
// Na wejściu znajduje się dokładnie jedna liczba całkowita t (1<=t<=1000) oznaczająca liczbę zestawów danych. W wierszach od 2 do t+1 znajdują się dwie liczby całkowite oddzielone spacja v1 oraz v2 (1<=v1,v2<=10000).
// 
// Wyjście
// Wyjście składa się z t wierszy. W każdym wierszu powinna znaleźć się dokładnie jedna liczba całkowita oznaczająca średnią prędkość.
// 
// Przykład
// Wejście:
// 2
// 50 50
// 60 40
// 
// Wyjście:
// 50
// 48

import java.io.*;

public class PredkoscSrednia {                      // id 1016

    public static void main(String[] args) {        // VSR 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                String[] c = br.readLine().split(" ");
                int a = Integer.parseInt(c[0]);
                int b = Integer.parseInt(c[1]);
                
                pw.println((2 * a * b) / (a + b));
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}