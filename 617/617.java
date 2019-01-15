// ID 617
// PP0504B - StringMerge
// Napisz funkcję:
// 
// char* string_merge(char *, char *);
// która sklei ze sobą dwa łańcuchy biorąc na przemian po jednym znaku z każdego łańcucha i umieści w nowej dynamicznie alokowanej tablicy znaków, do której zwróci wskaźnik. Należy wziąć po tyle znaków ile jest w krótszym łańcuchu.
// 
// Input
// 
// 
// W pierwszej linii liczba testów t, w kolejnych liniach po dwa łańcuchy znaków odzielone spacją.
// 
// Output
// W każdej linii jeden łańcuch, wynik działania funkcji string_merge.
// 
// Example
// Input:
// 4
// a bb
// abs sfd
// ewr w
// wqeqweqweq eqweqwe
// Output:
// ab
// asbfsd
// ew
// weqqewqewqewqe

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReprezentacjaLiczbTypuFloat {              // id 619

    public static void main(String[] args) {            // PP0504D 

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                float w = Float.parseFloat(br.readLine());
                
                if (w == 0) {
                    pw.println("0 0 0 0");
                } else {
                    int b = Float.floatToIntBits(w);
                    String hTS = Integer.toHexString(b);
                    
                    pw.print(printText(hTS.charAt(0), hTS.charAt(1)) + " ");
                    pw.print(printText(hTS.charAt(2), hTS.charAt(3)) + " ");
                    pw.print(printText(hTS.charAt(4), hTS.charAt(5)) + " ");
                    pw.println(printText(hTS.charAt(6), hTS.charAt(7)));
                }
            }
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
    
    public static String printText(char tekst1, char tekst2) {
        if (tekst1 == '0') return "" + tekst2;
        else return "" + tekst1 + tekst2;
    }
}