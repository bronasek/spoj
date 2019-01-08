// ID 978
// STOS - Stos
// Napisz program, który w 10-elementowej tablicy symuluje działanie stosu. Na początku stos jest pusty, a następnie ma się zapełniać lub opróżniać zgodnie z wczytanymi z wejścia poleceniami.
// 
// Wejście
// Na wejście programu podana zostanie pewna nieokreślona liczba zestawów danych. Zestawy składają się albo z jednej linii zawierającej znak - (polecenie zdjęcia liczby ze stosu i wypisania jej na wyjście), albo dwóch linii, z których pierwsza zawiera znak + (polecenie wstawienia liczby na stos), a druga niewielką liczbę całkowitą. Poszczególne zestawy zostaną rozdzielone znakiem nowej linii.
// 
// Wyjście
// Na wyjściu programu ma się pojawić ciąg napisów będących rezultatem wykonania pojawiających się na wejściu poleceń (jeżeli polecenie udało się wykonać, to wypisujemy jego rezultat: w przypadku wstawienia liczby na stos wypisujemy ':)'; w przypadku zdjęcia liczby jej wartość; w przypadku błędu ':('). Poszczególne napisy należy rozdzielić znakami nowej linii.
// 
// Przykład
// Wejście:
// +
// 1
// +
// 2
// +
// 3
// +
// 4
// +
// 5
// +
// 6
// +
// 7
// +
// 8
// +
// 9
// +
// 0
// +
// 1
// -
// -
// -
// -
// -
// -
// -
// -
// -
// -
// -
// 
// Wyjście:
// :)
// :)
// :)
// :)
// :)
// :)
// :)
// :)
// :)
// :)
// :(
// 0
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// :(

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Stos {                                     // id 978

    public static void main(String[] args) {            // STOS
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            String[] tab = new String[10];
            int ind = 0;
            
            while (br.ready()) {
                String x = br.readLine();
                if (x.equals("+")) {
                    if (ind < 10) {
                        tab[ind] = br.readLine();
                        ind++;
                        pw.println(":)");
                    } else {
                        pw.println(":(");
                    }
                } else if (x.equals("-")) {
                    ind--;
                    if (ind < 0) {
                        pw.println(":(");
                        ind++;
                    } else {
                        pw.println(tab[ind]);
                    }
                }
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}