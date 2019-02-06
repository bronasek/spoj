// ID 15918
// AL_10_12 - Żegnaj lato na rok
// zagiel bieli- Jeszcze się tam żagiel bieli, chłopców, którzy odpłynęli..."-  cichutko i smętnie, mocno przy tym fałszując, podśpiewuje sobie pod nosem pani Maria Sędziospoj i tak naprawdę nikt nie wie dlaczego. Możliwe, że tak naprawdę pani Profesor wspomina, coroczną wakacyjną pracę na obozach żeglarskich i wszystkich adeptów żeglarstwa, którzy "wypłynęli" z jej rąk. W każdym razie pani Maria znowu przygotowała swoje wcześniejsze, dobrze znane, lekko tylko zmienione zadanie.
// 
// Oto to zadanie: Ile liczb naturalnych z podanego przedziału [sp, sk], jest podzielnych przez co najmniej jedną z trzech podanych liczb a, b lub c?
// 
// 
// 
// 
// 
// Wejście
// Najpierw, w pierwszej linii trzy liczby całkowite 0 < a, b, c < 231. 
// Potem nieokreślona ilość zapytań, par liczb całkowitych 0 < sp ≤ sk < 231 (każda para w nowej linii), które określają początek i koniec przedziału.
// 
// Wyjście
// Dla każdego podanego przedziału podać w oddzielnej linii wynik, liczbę będącą odpowiedzią na pytanie.
// 
// Przykład
// Wejście:
// 3 5 7
// 1 2
// 1 3
// 3 5
// 1 100 
// Wyjście:
// 0
// 1
// 2
// 55

import java.util.Scanner;

public class AL_10_12 {                                     // id 15928
    
    public static void main(String[] args) {                // Żegnaj lato na rok
        
        try {
            long liczba, liczba2, sp = 0, sk = 0;
            long[] tab = new long[3];                                       
            long dzielnik;
            Scanner liczby = new Scanner(System.in);

            for (int i = 0; i < 3; ) {
                liczba = liczby.nextLong();
                if (liczba > 0 && liczba < 2147483649L) {
                    tab[i] = liczba;
                    i++;
                }
            }

            while (true) {   
                long nww12 = nww(tab[0], tab[1]);
                long nww23 = nww(tab[1], tab[2]);
                long nww13 = nww(tab[0], tab[2]);
                long nww123 = nww(nww12, tab[2]);
                
                liczba = liczby.nextLong();                    
                liczba2 = liczby.nextLong();
                if (liczba  > 0 && liczba2 >= liczba && liczba2 < 2147483649L) {
                    sp = liczba;
                    sk = liczba2;
                }
                dzielnik = ((sk / tab[0] + sk / tab[1] + sk / tab[2]) 
                        - (sk / nww12) - (sk / nww23) - (sk / nww13)                      
                        - (((sp-1) / tab[0] + (sp-1) / tab[1] + (sp-1) / tab[2]) 
                        - ((sp-1) / nww12) - ((sp-1) / nww23) - ((sp-1) / nww13)
                        + ((sp-1) / nww123));                                                     

                System.out.println(dzielnik);
            }
        }catch(Exception e){
            return;
        }
    }

    static long nwd(long x, long y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
    
    static long nww(long a, long b) { 
        return (a * b) / nwd(a, b);
    }
}