// ID 506
// FLAMASTE - Flamaster
// Flamaster
// Kasia niedawno poznała wszystkie literki w szkole. Z wielką pasją potrafiła całe dnie spędzać na pisaniu długich słów swoim ulubionym flamastrem. Pisała i pisała "tasiemce" tak długo, aż flamaster wypisał się. Kasia posmutniała. Z trudem, ale udało jej się uprosić swoją mamę, aby kupiła jej nowy pisak. Musiała jednak obiecać, że tym razem będzie bardziej oszczędna przy jego używaniu żeby wystarczył na dłużej. Kasia zaczęła zastanawiać się w jaki sposób będzie mogła zrealizować obietnicę daną mamie. 
// 
// Postanowiła, że aby zaoszczędzić wkład flamastra będzie wypisywała skróconą wersję wymyślanych wyrazów. Jeśli miała zamiar napisać więcej niż dwie takie same literki obok siebie w wyrazie, to teraz napisze literkę a następnie liczbę, określającą ilość wystąpień tej literki.
// Zadanie
// Twoim zadaniem jest dla zadanego wyrazu, który wymyśliła Kasia, podanie skróconej wersji tego wyrazu.
// Wejście
// W pierwszej linijce wejścia znajduje się liczba naturalna C, 1 ≤ C ≤ 50, oznaczająca ilość zestawów danych. W kolejnych C wierszach wejścia znajdują się zestawy danych. Każdy zestaw składa się z niepustego wyrazu złożonego z samych dużych liter alfabetu amerykańskiego. Długość wyrazu nie przekracza 200 znaków.
// Wyjście
// Dla każdego zestawu danych, dla zadanego wyrazu, na wyjściu powinna znaleźć się jego skrócona wersja.
// Przykład
// Dla danych wejściowych:
// 4
// OPSS
// ABCDEF
// ABBCCCDDDDEEEEEFGGHIIJKKKL
// AAAAAAAAAABBBBBBBBBBBBBBBB
// prawidłowym rozwiązaniem jest:
// OPSS
// ABCDEF
// ABBC3D4E5FGGHIIJK3L
// A10B16

import java.io.*;

public class Flamaster {                                // id 506
    
    static int l, nr;
    static PrintWriter pw;
    
    public static void main(String[] args) {            // FLAMASTE

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(System.out);
            int nrTest = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < nrTest; i++) {
                String[] dane = br.readLine().split("");
                l = 1;
                nr = dane.length;
                
                if (dane.length == 1) pw.print(dane[0]); 
                else {
                    for (int j = 1; j < dane.length; j++) {
                        spr(dane[j - 1], dane[j]);
                    }
                }
                pw.println("");
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
    
    static void spr(String a, String b) {
        if (!(a.equals(b))) {
            if (l == 2) pw.print(a + a);
            else if (l > 2) pw.print(a + l);
            else pw.print(a);
            if (nr < 3) pw.print(b);
            l = 1;
            nr--;
        }
        else {
            l++;
            if (nr < 3) {
                if (l == 2) pw.print(b + b);
                else if (l > 2) pw.print(b + l);
            }
            nr--;
        }
    }
}