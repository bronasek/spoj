// ID 568
// BFN1 - Zabawne Dodawanie Piotrusia
// Piotruś w klasie na lekcji matematyki bardzo się nudził i pani postanowiła dać mu dodatkowe zadanie do rozwiązania. Piotruś otrzymał kartkę, na której napisane były małe liczby. Piotruś ma za zadanie stwierdzić, czy dana liczba jest palindromem (tzn. czy czyta się ją tak samo od lewej do prawej strony, jak od prawej do lewej). Jeżeli nie, Piotruś powinien dodać do siebie wartość liczby czytanej od lewej do prawej oraz wartość liczby czytanej od prawej do lewej, sprawdzić, czy suma jest palindromem, i jeżeli nie -- kontynuować proces, aż otrzyma palindrom.
// 
// Przykładowo, mając daną liczbę 28, Piotruś stwierdzi, że nie jest ona palindromem i wykona dodawanie 28 + 82 = 110. Liczba 110 wciąż nie jest palindromem, zatem Piotruś wykona jeszcze dodawanie 110 + 011 = 110 + 11 = 121. Wynik tego dodawania jest już palindromem, więc obliczenia zostaną zakończone.
// 
// Twoim zadaniem jest napisać program, który dla każdej liczby rozważanej przez Piotrusia wypisze palindrom (wynik obliczeń Piotrusia), oraz liczbę dodawań prowadzących do wyniku.
// 
// Wejście
// Pierwsza linia wejścia zawiera liczbę t (t <= 80), określającą ile liczb znajduje się na kartce Piotrusia. Każda z następnych t linii zawiera dokładnie jedną liczbę naturalną n (1 <= n <= 80), dla której Piotruś musi wykonać obliczenia.
// 
// Wyjście
// Dla kolejnych liczb podanych na kartce wypisz po jednej linijce zawierającej dwie liczby całkowite oddzielone spacją. Pierwsza oznacza palindrom otrzymany przez Piotrusia, druga -- liczbę dodawań wykonanych, by go otrzymać.
// 
// Przykład
// Wejście:
// 3
// 28
// 68
// 5
// 
// Wyjście:
// 121 2
// 1111 3
// 5 0

import java.io.*;

public class ZabawneDodawanie {                     // id 568

    public static void main(String[] args) {        // BFN1
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- >0) {
                String l = br.readLine();
                
                if (Integer.parseInt(l) < 10) pw.println(l + " 0");
                else {
                    String[] lST = l.split("");
                    if (lST[0].equals(lST[1])) pw.println(l + " 0");
                    else {
                        int licznik = 0;
                        boolean flaga = false;
                        StringBuilder lS = new StringBuilder(l);
                        int wynik = 0;
                        
                        while (flaga != true) {
                            wynik = Integer.parseInt(lS.toString()) + Integer.parseInt(lS.reverse().toString());
                            lS = lS.delete(0, lS.length()).append(wynik);
                            
                            if (wynik == Integer.parseInt(lS.reverse().toString())) flaga = true;
                            else flaga = false;
                            
                            licznik++;
                        }
                        pw.println(wynik + " " + licznik);
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