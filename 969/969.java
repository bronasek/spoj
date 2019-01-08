// ID 969
// ROWNANIE - Równanie kwadratowe
// Napisz program, który wyznacza liczbę pierwiastków rzeczywistych równania kwadratowego.
// 
// Wejście
// Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość zestawów danych. Każdy zestaw składać się będzie z 3 liczb rzeczywistych (współczynników A, B i C równania Ax^2 + Bx + C = 0) rozdzielonych spacjami. Poszczególne zestawy zostaną rozdzielone znakiem nowej linii. Można przyjąć, że A jest różne od zera.
// 
// Wyjście
// Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja jest równa liczbie pierwiastków rzeczywistych i-tego wczytanego z wejścia równania. Poszczególne liczby należy rozdzielić znakami nowej linii.
// 
// Przykład
// Wejście:
// 0.3 0.3 0.4
// 0.5 1 0.5
// -0.5 -0.5 0
// 
// Wyjście:
// 0
// 1
// 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RównanieKwadratowe {                   // id 969

    public static void main(String[] args) {        // ROWNANIE 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            
            while (br.ready()) {
                String[] x = br.readLine().split(" ");
                double a = Double.parseDouble(x[0]);
                double b = Double.parseDouble(x[1]);
                double c = Double.parseDouble(x[2]);
                double d = (b * b) - (4 * a * c);
                
                if (d < 0) {
                    pw.println(0);
                } else if (d == 0) {
                    pw.println(1);
                } else {
                    pw.println(2);
                }
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}