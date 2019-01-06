// ID 1032
// PP0601B - Podzielność
// Wypisz wszystkie liczby ai podzielne przez x i niepodzielne przez y, gdzie 1 < ai < n < 100000.
// 
// Wejście
// Najpierw w oddzielnej linii t liczba przypadków testowych następnie w kolejnych t liniach liczby n x y.
// 
// Wyjście
// W kolejnych t liniach oddzielone pojedynczym odstępem liczby spełniające warunki zadania wypisane od najmniejszej do największej.
// 
// Przykład
// Wejście:
// 2 
// 7 2 4
// 35 5 12
// Wyjście:
// 2 6 
// 5 10 15 20 25 30

import java.io.*;

public class Podzielnosc {                          // id 1032

    public static void main(String[] args) {        // PP0601B 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                String[] c = br.readLine().split(" ");
                int n = Integer.parseInt(c[0]);
                int x = Integer.parseInt(c[1]);
                int y = Integer.parseInt(c[2]);
                
                
                for (int i = 1; i <= n; i++) {
                    if (i % x == 0 && !(i % y == 0)) {
                        pw.print(i);
                        pw.print(" ");
                    }
                }
                pw.println();
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}