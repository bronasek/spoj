// ID 499
// PA05_POT - Czy umiesz potęgować
// Zadanie: POT (Czy umiesz potęgować)
// Dla danych dwóch liczb naturalnych a i b, wyznaczyć ostatnią cyfrę liczby ab.
// 
// Zadanie
// Napisz program, który:
// wczyta ze standardowego wejścia: podstawę a oraz wykładnik b,
// wyznaczy ostatnią cyfrę liczby ab,
// wypisze wynik na standardowe wyjście.
// Wejście
// W pierwszej linii wejścia znajduje się jedna liczba całkowia D (1≤D≤10), oznaczjąca liczbę przypadków do rozważenia. Opis każdego przypadku podany jest w jednym wierszu, zawierającym dwie liczby naturalne a i b oddzielone pojedynczym odstępem (spacją), takie, że (1 ≤ a,b ≤ 1 000 000 000).
// 
// Wyjście
// Dla każdego przypadku z wejścia Twój program powinien wypisać (w osobnej linii dla każdego przypadku z wejścia) cyfrę jedności liczby ab zapisanej dziesiętnie.
// 
// Przykład
// Dla danych wejściowych:
// 2
// 2 3
// 3 3
// poprawną odpowiedzią jest:
// 8
// 7

import java.io.*;                                   // id 499

public class CzyUmieszPotęgować {                   // PA05_POT

    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nT = Integer.parseInt(br.readLine());
            
            while (nT-- > 0) {
                String [] dane = br.readLine().split(" ");
                int a = Integer.parseInt(dane[0].substring(dane[0].length() - 1));
                int b;
                if (dane[1].length() == 1)
                    b = Integer.parseInt(dane[1].substring(dane[1].length() - 1));
                else
                    b = Integer.parseInt(dane[1].substring(dane[1].length() - 2));
                
                switch(a) {
                    case 1:
                        pw.println(a);
                        break;
                    case 2:
                        if (b % 4 == 1) pw.println(a);
                        else if (b % 4 == 2) pw.println("4");
                        else if (b % 4 == 3) pw.println("8");
                        else if (b % 4 == 0) pw.println("6");
                        break;
                    case 3:
                        if (b % 4 == 1) pw.println(a);
                        else if (b % 4 == 2) pw.println("9");
                        else if (b % 4 == 3) pw.println("7");
                        else if (b % 4 == 0) pw.println("1");
                        break;
                    case 4:
                        if (b % 2 == 0) pw.println("6");
                        else pw.println(a);
                        break;
                    case 5:
                        pw.println(a);
                        break;
                    case 6:
                        pw.println(a);
                        break;
                    case 7:
                        if (b % 4 == 1) pw.println(a);
                        else if (b % 4 == 2) pw.println("9");
                        else if (b % 4 == 3) pw.println("3");
                        else if (b % 4 == 0) pw.println("1");
                        break;
                    case 8:
                        if (b % 4 == 1) pw.println(a);
                        else if (b % 4 == 2) pw.println("4");
                        else if (b % 4 == 3) pw.println("2");
                        else if (b % 4 == 0) pw.println("6");
                        break;
                    case 9:
                        if (b % 2 == 0) pw.println("1");
                        else pw.println(a);
                        break;
                    case 0:
                        pw.println(a);
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