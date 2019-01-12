// ID 663
// PP0506A - Sort 1
// Dana jest lista punktów na płaszczyżnie. Posortuj je względem odległości od środka układu współrzędnych w metryce euklidesowej.
// 
// Wejście
// W pierwszej linii liczba testów t (t < 100). Dla każdego testu najpierw n (1 ≤ n ≤ 1000) - liczba punktów i w kolejnych n liniach opis każdego punktu w formacie: 
// nazwa x y
// gdzie nazwa jest unikalnym dla każdego testu ciągiem co najwyżej 10 liter alfabetu łacińskiego, a x i y są współrzędnymi punktu. Obie współrzędne są całkowite oraz -1000 ≤ x, y ≤ 1000. Kolejne testy oddzielone są jednym pustym wierszem. Żadne 2 punkty nie leżą w tej samej odległości od środka układu współrzędnych.
// 
// Wyjście
// Dla każdego przypadku testowego w kolejnych n liniach posortowane punkty. Po każdym przypadku testowym jedna linia odstępu.
// 
// Przykład
// Wejście:
// 2
// 3
// A 0 0
// C 5 5
// B 1 -1
// 
// 1 
// X 1 1
// 
// Wyjście:
// A 0 0
// B 1 -1
// C 5 5
// 
// X 1 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Sort1 {                                // id 663

    public static void main(String[] args) {        // PP0506A 
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nt = Integer.parseInt(br.readLine());
            
            while (nt-- > 0) { 
                int lp;
                String n = br.readLine();
                    if (!n.isEmpty()) lp = Integer.parseInt(n);
                    else {
                        lp = Integer.parseInt(br.readLine());
                    }
                    
                String[] nazwa = new String[lp];
                double[] odl = new double[lp];
                int[] ax = new int[lp];
                int[] bx = new int[lp];

                for (int i = 0; i < lp; i++) { 
                    String[] c = br.readLine().split(" ");  
                    nazwa[i] = c[0];
                    ax[i] = Integer.parseInt(c[1]);
                    bx[i] = Integer.parseInt(c[2]);
                    odl[i] = Math.sqrt(ax[i] * ax[i] + bx[i] * bx[i]);
                }
                
                if (lp > 1) {
                    for (int j = 0; j < lp - 1; j++) {
                        for (int i = 1; i < lp - j; i++) {
                            double odlTemp;
                            String nazwaTemp;
                            int axTemp;
                            int bxTemp;
                            if (odl[i - 1] > odl[i]) {
                                nazwaTemp = nazwa[i];
                                nazwa[i] = nazwa[i - 1];
                                nazwa[i - 1] = nazwaTemp;
                                odlTemp = odl[i];
                                odl[i] = odl[i - 1];
                                odl[i - 1] = odlTemp;
                                axTemp = ax[i];
                                ax[i] = ax[i - 1];
                                ax[i - 1] = axTemp;
                                bxTemp = bx[i];
                                bx[i] = bx[i - 1];
                                bx[i - 1] = bxTemp;
                            }
                        }
                    }
                }

                for (int i = 0; i < lp; i++) {
                    pw.println(nazwa[i] + " " + ax[i] + " " + bx[i]);
                }

                pw.println();
                
            }
            
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
}