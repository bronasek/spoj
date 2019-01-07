// ID 1011
// POL - Połowa
// Dla podanego ciągu długości 2*k, wypisz na standardowe wyjście dokładnie pierwszą połowę ciągu.
// 
// Wejście
// W pierwszej linijce wejścia znajduje się jedna liczba całkowita t (1<=t<=100). Każdy wiersz o numerze od 2 do t+1, zawiera ciąg długości 2*k (1<=k<=1000).
// 
// Wyjście
// Dla każdego przypadku testowego na wyjściu powinien pojawić się ciąg będący pierwszą połową wczytanego ciągu.
// 
// Example
// Wejście:
// 3
// pierwszy
// lubiec
// ktotozrobi
// 
// Output:
// pier
// lub
// ktoto

import java.io.*;

public class Polowa {                               // id 1011

    public static void main(String[] args) {        // POL
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                String c = br.readLine();
                pw.println(c.substring(0, c.length() / 2));
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}
