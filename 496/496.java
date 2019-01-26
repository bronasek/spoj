// ID 496
// FCTRL3 - Dwie cyfry silni
// Zadanie: Silnia
// Niech n będzie nieujemną liczbą całkowitą. Liczbę n! (czytaj n-silnia) definiuje się następująco. Jeśli n ≤ 1, to n! = 1. Dla n > 1, n! jest równe iloczynowi wszystkich liczb od 1 do n, czyli n! = 1 * 2 * ... * n. Na przykład 4! = 1*2*3*4 = 24.
// 
// Zadanie
// Napisz program, który:
// wczyta ze standardowego wejścia nieujemną liczbę całkowitą n,
// policzy cyfrę dziesiatek oraz cyfrę jedności w zapisie dziesiętnym liczby n!,
// wypisze wynik na standardowe wyjście.
// Wejście
// W pierwszej linii wejścia znajduje się jedna liczba całkowia D (1≤D≤30), oznaczjąca liczbę przypadków do rozważenia. Opis każdego przypadku składa się z jednej linii, w której znajduje się jedna nieujemna liczba całkowita n (0 ≤ n ≤ 1 000 000 000).
// 
// Wyjście
// Dla każdego przypadku z wejścia. Twój program powinien wypisać w osobnej linii dokładnie dwie cyfry (oddzielone pojedynczą spacją): cyfrę dziesiątek i cyfrę jedności liczby n! zapisanej w systemie dziesiętnym.
// 
// Przykład
// Dla danych wejściowych:
// 2
// 1
// 4
// poprawną odpowiedzią jest:
// 0 1
// 2 4

import java.io.*;

public class DwieCyfrySilni {                           // id 496

    public static void main(String[] args) {            // FCTRL3
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- > 0) {
                int nr = Integer.parseInt(br.readLine());
                
                if (nr < 2) pw.println("0 1");
                else if (nr == 2) pw.println("0 2");
                else if (nr == 3) pw.println("0 6");
                else if (nr == 4) pw.println("2 4");
                else if (nr == 5 || nr == 6 || nr == 8) pw.println("2 0");
                else if (nr == 7) pw.println("4 0");
                else if (nr == 9) pw.println("8 0");
                else if (nr > 9) pw.println("0 0");
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}