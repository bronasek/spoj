// ID 33591
// FR_08_02 - Korekta
// Jasiu, Stasiu, Wiesiu i Grzesiu lubią grać w Brydża. Za każdym razem dzielą się na dwa dwuosobowe zespoły, no i grają. Każdy z nich prowadzi ogólną ewidencję liczby gier wygranych i przegranych. Jasiu błędnie zsumował swoje wyniki i chciałby to skorygować. Znając liczbę gier wygranych i przegranych pozostałych graczy, należy wyznaczyć liczbę gier wygranych i przegranych Jasia. 
// 
// Wejście
// W pierwszym wierszu wejścia znajduje się liczba całkowita d (1 ≤ d ≤ 1000) oznaczająca liczbę przypadków testowych. W kolejnych wierszach danych jest po sześć liczb całkowitych nieujemnych nie większych od 106 oznaczających liczbę zwycięstw i porażek odpowiednio Stasia, Wiesia i Grzesia. 
// 
// Wyjście
// Dla każdego przypadku testowego należy wypisać dwie wartości - liczbę zwycięstw i porażek Jasia.
// 
// 
// 
// Przykład
// 
// Wejście
// 2
// 8 7 3 12 10 5
// 0 10 0 10 10 0
// 
// Wyjście
// 9 6
// 10 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FR_08_02 {                             // id 33591

    public static void main(String[] args) {        // Korekta
            
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nrTests = Integer.parseInt(br.readLine());
            int aw, ap, bw, bp, cw, cp;
            
            for (int i = 0; i < nrTests; i++) {
                String[] data = br.readLine().split(" ");
                aw = Integer.parseInt(data[0]);
                ap = Integer.parseInt(data[1]);
                bw = Integer.parseInt(data[2]);
                bp = Integer.parseInt(data[3]);
                cw = Integer.parseInt(data[4]);
                cp = Integer.parseInt(data[5]);
                
                pw.print(2*(aw + ap) - (aw + bw + cw));
                pw.print(" ");
                pw.println(2*(aw + ap) - (ap + bp + cp)); 
            }
            br.close();
            pw.flush();
            pw.close();
        } catch(Exception e) {
            return;
        }
    }
}