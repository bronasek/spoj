// ID 601
// PP0501A - NWD
// Napisz funkcję:
// 
//  int nwd(int a, int b);
// która oblicza największy wspólny dzielnik liczb a i b,
// 
//  0 <= a,b <= 1000000
// Input
// 
// 
// W pierwszej linii liczba testów t, w kolejnych liniach po dwie liczby w każdym wierszu.
// 
// Output
// W każdej linii jedna liczba - wynik działania funkcji nwd
// 
// Example
// Input:
// 5
// 1 4
// 4 1
// 12 48
// 48 100
// 123456 653421
// 
// Output:
// 1
// 1
// 12
// 4
// 3

import java.io.*;

public class NWD {                                  // id 601

    public static void main(String[] args) {        // PP0501A

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nrTest = Integer.parseInt(br.readLine());
            int a, b;
            
            for (int i = 0; i < nrTest; i++) {
                String[] dane = br.readLine().split(" ");
                a = Integer.parseInt(dane[0]);
                b = Integer.parseInt(dane[1]);
            
                pw.println(nwd(a, b));
            }
            
            pw.flush();
            pw.close();
            br.close();
        } catch (Exception e) {
            return;
        }
    }
    
    static long nwd(long x, long y) {
        while (x != y) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
}