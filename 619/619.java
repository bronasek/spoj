// ID 619
// PP0504D - Reprezentacja liczb typu float
// Napisz funkcję
// 
// void printfloat(float);
// 
// która dla zadanej liczby typu float wypisze jej reprezentację szesnastkową.
// 
// Wejście
// W pierwszej linii liczba testów t, w kolejnych t wierszach jedna liczba zmiennoprzecinkowa w zakresie typu float.
// 
// Wyjście
// W kolejnych t wierszach odzielone pojedynczymi spacjami bajty reprezenacji kolejnych liczb, w kolejności od najstarszego bajtu.
// 
// Przykład
// Wejście:
// 5
// 1 
// -1 
// 0 
// 123.125 
// -345
// 
// Wyjście:
// 3f 80 0 0 
// bf 80 0 0 
// 0 0 0 0 
// 42 f6 40 0 
// c3 ac 80 0 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReprezentacjaLiczbTypuFloat {              // id 619

    public static void main(String[] args) {            // PP0504D 

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int lt = Integer.parseInt(br.readLine());
            
            while (lt-- > 0) {
                float w = Float.parseFloat(br.readLine());
                
                if (w == 0) {
                    pw.println("0 0 0 0");
                } else {
                    int b = Float.floatToIntBits(w);
                    String hTS = Integer.toHexString(b);
                    
                    pw.print(printText(hTS.charAt(0), hTS.charAt(1)) + " ");
                    pw.print(printText(hTS.charAt(2), hTS.charAt(3)) + " ");
                    pw.print(printText(hTS.charAt(4), hTS.charAt(5)) + " ");
                    pw.println(printText(hTS.charAt(6), hTS.charAt(7)));
                }
            }
            br.close();
            pw.close();
            
        } catch (Exception e) {
            return;
        }
    }
    
    public static String printText(char tekst1, char tekst2) {
        if (tekst1 == '0') return "" + tekst2;
        else return "" + tekst1 + tekst2;
    }
}