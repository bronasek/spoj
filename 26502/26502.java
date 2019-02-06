// 26502
// FR_05_01 - Dzień tygodnia
// Dzień tygodnia
// 
// Wyznacz dzień tygodnia za n dni. 
// Dni tygodnia oznaczamy skrótami: Pn, Wt, Sr, Cz, Pt, So, Nd
// 
// Wejście
// W pierwszym wierszu wejścia znajduje się liczba całkowita d (1 ≤ d ≤ 1000) oznaczająca liczbę przypadków testowych. Każdy przypadek opisany jest w osobnym wierszu, na który składa się skrót dnia tygodnia i liczba n (1 ≤ n ≤ 109). 
// 
// Wyjście
// Dla każdego przypadku testowego wyznacz skrót dnia tygodnia, który nastąpi za n dni, licząc od dnia tygodnia podanego na wejściu.
// 
// 
// Przykład
// 
// Wejście
// 4
// Cz 1
// Pt 2
// So 3
// Nd 4
// 
// Wyjście
// Pt
// Nd
// Wt
// Cz

import java.io.*;

public class DzieńTygodnia {                        // id 26502

    public static void main(String[] args) {        // FR_05_01

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nrTest = Integer.parseInt(br.readLine());
            String day;
            int liczba;
            
            for (int i = 0; i < nrTest; i++) {
                String[] dane = br.readLine().split(" ");
                day = dane[0];
                liczba = Integer.parseInt(dane[1]);
            
                switch (day) {
                case "Pn": 
                    pw.println(wynik(1, liczba));
                    break;
                case "Wt": 
                    pw.println(wynik(2, liczba));
                    break;
                case "Sr": 
                    pw.println(wynik(3, liczba));
                    break;
                case "Cz": 
                    pw.println(wynik(4, liczba));
                    break;
                case "Pt": 
                    pw.println(wynik(5, liczba));
                    break;
                case "So": 
                    pw.println(wynik(6, liczba));
                    break;
                case "Nd": 
                    pw.println(wynik(7, liczba));
                    break;
                }
            }
                                    
            pw.flush();
            pw.close();
            br.close();
        } catch (Exception e) {
            return;
        }
    }
    
    static String wynik(int dzien, int liczba) {
        int jakiDzien = (dzien + liczba) % 7;
        String wynik = "";
        
        switch (jakiDzien) {
            case 1:
                wynik = "Pn";
                break;
            case 2:
                wynik = "Wt";
                break;
            case 3:
                wynik = "Sr";
                break;
            case 4:
                wynik = "Cz";
                break;
            case 5:
                wynik = "Pt";
                break;
            case 6:
                wynik = "So";
                break;
            case 0:
                wynik = "Nd";
                break;
            default:
                break;
        }
        return wynik;
    }
}