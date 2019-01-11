// ID 723
// PTROL - ROL
// Przesuń elementy tablicy cyklicznie w lewo.
// 
// Wejście
// Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (1 < n ≤ 100) i n liczb.
// 
// Wyjście
// Dla każdego testu n liczb w zmienionym porządku.
// 
// Przykład
// Wejście:
// 2
// 7 1 2 3 4 5 6 7 
// 3 2 1 10
// 
// Wyjście:
// 2 3 4 5 6 7 1 
// 1 10 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ROL {                                  // id 723

    public static void main(String[] args) {        // PTROL 

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                String[] c = br.readLine().split(" ");
                StringBuilder sb = new StringBuilder();
                int l = Integer.parseInt(c[0]);
                
                for (int i = 2; i < l + 1; i++) {
                    sb.append(c[i] + " ");
                }
                sb.append(c[1]);
                pw.println(sb);
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}