// ID 438
// PRIME_T - Liczby Pierwsze
// Sprawdź, które spośród danych liczb są liczbami pierwszymi
// 
// Input
// n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]
// 
// Output
// Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.
// 
// Example
// Input:
// 3
// 11
// 1
// 4
// 
// Output:
// TAK
// NIE
// NIE

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LiczbyPierwsze {                           // id 438
    
    public static void main(String[] args) {            // PRIME_T
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nrTest = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < nrTest; i++) {
                int liczba = Integer.parseInt(br.readLine());
                
                    if (czyPierwsza(liczba))
                        pw.println("TAK"); 
                    else
                        pw.println("NIE"); 
            }
            
            pw.flush();
            pw.close();
            br.close();
            
        } catch (Exception e) {
            return;
        }
    }
    
    static boolean czyPierwsza(int l){
        
        if (l == 1)
            return false;
        
        for (int j = 2; j * j <= l; j++) {      
            if (l % j == 0)
                return false;
        }
        return true;
    }
}