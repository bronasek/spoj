// ID 1042
// TRN - Transponowanie macierzy
// Transponuj podaną macierz.
// 
// Wejście
// W pierwszym wierszu znajdują się dwie liczby m n (1<=m,n<=200) oznaczające odpowiednio liczbę wierszy oraz liczbę kolumn. Następnie następuje m wierszy, w każdym n liczb.
// 
// Wyjście
// Na wyjściu powinna znaleźć się macierz transponowana do zadanej
// 
// Przykład
// Wejście:
// 4 3
// 1 2 5
// 4 3 3
// 3 4 9
// 8 7 7
// 
// Wyjście:
// 1 4 3 8
// 2 3 4 7
// 5 3 9 7

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TransponowanieMacierzy {               // id 1042

    public static void main(String[] args) {        // TRN
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            
            String[] ciag = br.readLine().split(" ");
            int rows = Integer.parseInt(ciag[0]);
            int cols = Integer.parseInt(ciag[1]);
            StringBuilder builder = new StringBuilder();
            String[][] tab = new String[cols][rows];
            
            for (int i = 0; i < rows; i++) {
                String[] ciagX = br.readLine().split(" ");
                
                for (int j = 0; j < ciagX.length; j++) {
                    tab[j][i] = ciagX[j];
                }
            }
            
            for (int i = 0; i < cols; i++) {
                
                for (int j = 0; j < rows; j++) {
                    builder.append(tab[i][j]).append(" ");
                }
                
                builder.append("\n");
            }
            
            pw.print(builder);
            
            br.close();
            pw.close();
            
        } catch(Exception e) {
            return;
        }
    }
}