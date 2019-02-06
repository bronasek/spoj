// ID 1502
// POTSAM - Samolot
// Bajtockie Linie Lotnicze wzbogaciły swoją flotę o nowy model samolotu. W samolocie tym jest n1 rzędów miejsc siedzących w klasie biznesowej oraz n2 rzędów w klasie ekonomicznej. W klasie biznesowej każdy rząd ma k1 miejsc siedzących, a w klasie ekonomicznej — k2 miejsc.
// 
// Zadanie
// Napisz program, który:
// wczyta informacje na temat dostępnych miejsc siedzących w samolocie,
// wyznaczy sumaryczną liczbę wszystkich miejsc siedzących,
// wypisze wynik
// Wejście
// W pierwszym i jedynym wierszu wejścia znajdują się cztery liczby naturalne n1, k1, n2, i k2 (1<=n1,k1,n2,k2<=1000), pooddzielane pojedynczymi odstępami.
// 
// Wyjście
// Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą - liczbę miejsc siedzących w analizowanym samolocie.
// 
// Przykład
// Wejście
// 2 5 3 20
// 
// Wyjście
// 70

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class POTSAM {                                   // id 1502

    public static void main(String[] args) {            // Samolot

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int n1, k1, n2, k2;
            
            String[] data = br.readLine().split(" ");
            n1 = Integer.parseInt(data[0]);
            k1 = Integer.parseInt(data[1]);
            n2 = Integer.parseInt(data[2]);
            k2 = Integer.parseInt(data[3]);
            
            pw.println(n1*k1+n2*k2);
            
            br.close();
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}