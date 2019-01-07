// ID 997
// CALC - Kalkulator
// Napisz program, który działa jak prosty kalkulator obsługujący pięć operacji: dodawanie, odejmowanie, mnożenie, dzielenie i obliczanie reszty z dzielenia liczb całkowitych.
// 
// Wejście
// Na wejście programu podana zostanie pewna nieokreślona liczba zestawów danych. Zestawy składają się z jednoznakowego symbolu operacji do wykonania (+ dodawanie, - odejmowanie, * mnożenie, / dzielenie całkowitoliczbowe, % reszta z dzielenia) oraz następujących po nim dwóch liczb całkowitych. Poszczególne składowe zestawu zostaną rozdzielone spacjami, a same zestawy znakiem nowej linii. Liczba testów nie przekracza 100, wynik zawiera się w typie int32.
// 
// Wyjście
// Na wyjściu programu ma się pojawić ciąg liczb będących rezultatem wykonania pojawiających się na wejściu poleceń. Poszczególne liczby należy rozdzielić znakami nowej linii. Uwaga! Można założyć, że dane wejściowe nie zawierają polecenia dzielenia przez 0.
// 
// Przykład
// Wejście:
// + 7 9
// - 0 4
// * 5 6
// / 8 3
// % 5 2
// 
// Wyjście:
// 16
// -4
// 30
// 2
// 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Kalkulator {                               // id 997

    public static void main(String[] args) {            // CALC 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            
            while (br.ready()) {
                String[] c = br.readLine().split(" ");
                String s = c[0];
                int a = Integer.parseInt(c[1]);
                int b = Integer.parseInt(c[2]);
                
                switch (s) {
                    case "+":
                        pw.println(a + b);
                        break;
                    case "-":
                        pw.println(a - b);
                        break;
                    case "*":
                        pw.println(a * b);
                        break;
                    case "/":
                        pw.println(a / b);
                        break;
                    case "%":
                        pw.println(a % b);
                        break;
                }
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}