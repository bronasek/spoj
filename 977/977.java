// ID 977
// TABLICA - Tablica
// Napisz program, który wczytuje z wejścia ciąg liczb i wypisuje go w odwróconej kolejności.
// 
// Wejście
// Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość liczb całkowitych rozdzielonych spacjami.
// 
// Wyjście
// Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja jest równa (n+1-i)-tej liczbie wczytanej z wejścia, gdzie n to ilość wczytanych liczb. Poszczególne liczby należy rozdzielić spacjami.
// 
// Przykład
// Wejście:
// 1 2 3
// 
// Wyjście:
// 3 2 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tablica {                              // id 977

    public static void main(String[] args) {        // TABLICA 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            
            String[] c = br.readLine().split(" ");
            for (int i = c.length - 1; i >= 0; i--) {
                pw.print(c[i]);
                if (i != 0) {
                    pw.print(" ");
                }
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}