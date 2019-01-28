// ID 4843
// WI_DZWON - Szkolne dzwonki
// Szkoła Zdolnych Programistów boryka się z niebagatelnym problemem dzwonków. Dyrektor szkoły chciałby bardzo, aby początki i końce lekcji ogłaszane były automatycznie, bez potrzeby angażowania woźnego. Nic więc dziwnego, że pilnie potrzebny jest program, który szybko wygeneruje informacje o godzinach, w których dzwonki powinny być uruchamiane.
// 
// Dyrektor już przemyślał problem i wie dokładnie, czego oczekuje od nieistniejącego jeszcze programu. Po pierwsze, godzina rozpoczęcia pierwszej lekcji może być zmienna i niekoniecznie musi być nią 800. Wynika z tego, że informację tę program musi przyjąć w postaci pierwszej danej wejściowej. Również długości przerw są zmienne, co akurat jest zupełnie zrozumiałe. Jedno tylko pozostaje niezmienne – długość lekcji, która zawsze trwa równo 45 minut.
// 
// Polecenie: napisz program, który generuje informacje o porach, w których w SZP powinien rozlegać się dźwięk dzwonka.
// 
// Dane wejściowe: nieznana z góry liczba wierszy tekstu, zawierających kolejno:
// 
// godzinę rozpoczęcia pierwszej lekcji w formacie HH:MM (np. 08:00)
// 
// dowolną liczbę długości kolejnych przerw, wyrażonych w minutach (całkowite t: t >0 i t<=10080)
// 
// 
// 
// Dane wyjściowe: jeden wiersz tekstu, a w nim lista rozdzielonych przecinkami pór uruchomienia dzwonka w formacie HH:MM
// 
// Przykład:
// 
// Wejście:
// 
// 08:00
// 
// 15
// 
// 15
// 
// 15
// 
// Wyjście:
// 
// 08:00,08:45,09:00,09:45,10:00,10:45,11:00,11:45

import java.lang.*;
import java.util.Scanner;

public class SzkolneDzwonki {                           // id 4843
    
    static int m, l = 45;
    
    public static void main(String[] args) {            // WI_DZWON

    	try {
            Scanner sc = new Scanner(System.in);
            String[] data = sc.nextLine().split(":");
            m = (Integer.parseInt(data[0]) * 60) + Integer.parseInt(data[1]);
 
            System.out.print(czas(0) + "," + czas(l));
     
            while (sc.hasNext())        // tu jebie bez konca, ale w SPOJ działa 
                System.out.print("," + czas(Integer.parseInt(sc.nextLine())) + "," + czas(l));
            
            sc.close();
            System.out.println("");

        } catch (Exception e) {
            return;
        }
    }
    
    public static String czas(int p) {
        String hr = "";
        String min = "";
        m = m + p;
        hr = "" + (m / 60) % 24;
        if (Integer.parseInt(hr) < 10) {
            hr = "0" + hr;
        }
        min = "" + (m % 60);
        if (Integer.parseInt(min) < 10) {
            min = "0" + min;
        }
        return hr + ":" + min;
    }
}