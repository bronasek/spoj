// ID 1019
// SYS - Systemy pozycyjne
// Zadanie polega na zamianie podanej liczby n, która jest w systemie dziesiątkowym, na liczbę w systemie szesnastkowym (cyfry:0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F) i jedenastkowym (cyfry:0,1,2,3,4,5,6,7,8,9,A).
// 
// Wejście
// W pierwszym wierszu wejścia znajduje się dokładnie jedna t (1<=t<=10000) oznaczająca liczbę zestawów danych. W każdym wierszu od 2 do t+1 znajduje się dokładnie jedna liczba całkowita n (1<=n<=106).
// 
// Wyjście
// W każdym wierszu wyjścia powinny znaleźć się dokładnie dwie liczby, pierwsza - oznaczająca podana liczbę w systemie szesnastkowym, druga - oznaczająca podana liczbę w systemie jedenastkowym.
// 
// Przykład
// Wejście:
// 2
// 1263
// 10
// 
// Wyjście:
// 4EF A49
// A A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SystemyPozycyjne {                     // id 1019

   public static void main(String[] args) {        // SYS 

      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw = new PrintWriter(System.out);
         int lt = Integer.parseInt(br.readLine());

         while (lt-- > 0) {
            int l = Integer.parseInt(br.readLine());
            String toHex = Integer.toHexString(l);

            pw.print(toHex.toUpperCase());
            pw.println(" " + decToEleven(l));
         }

         br.close();
         pw.close();

      } catch (Exception e) {
         return;
      }
   }
    
   private static String decToEleven(int l) {
      StringBuilder sb = new StringBuilder();
      int base = 11;
      int wynik = 0;
      int temp = l;

      while (temp > 0) {
         if (temp > 10) {
             wynik = temp % base;
         } else {
             wynik = temp;
         }
         if (wynik == 10) {
             sb.append("A");
         } else {
             sb.append(wynik);
         }
         temp /= base;
      }     
      return sb.reverse() + "";
   }
}