// ID 27236
// AL_28_01 - Piramidka
// Masz dane słowo S o nieparzystej długości N. Na podstawie tego słowa wypisz piramidę taką jak w przykładzie.
// 
// Wejście
// W pierwszej linii wejścia znajduje się nieparzysta liczba całkowita N (1 ≤ N ≤ 29).
// 
// W drugiej linii wejścia znajduje się napis S. Napis ten składa się tylko i wyłącznie z małych liter alfabetu łacińskiego.
// 
// Wyjście
// Wypisz piramidę na podstawie słowa S w taki sposób jak w przykładzie.
// 
// Przykład
// Wejście:
// 9
// piramidka
// Wyjście:
// ....m....
// ...ami...
// ..ramid..
// .iramidk.
// piramidka

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            int nr = Integer.parseInt(br.readLine());
            String tmp = br.readLine();
            int temp2 = nr/2+1;
 
            for (int i = temp2; i > 0; i--) {
                StringBuilder tekst = new StringBuilder(tmp);
                for (int j = 0; j < tekst.length() ; j++) {
                    if (j < tekst.length()-(tekst.length()-(i-1)) || j > tekst.length() - i) {
                        tekst.replace(j, j + 1, ".");
                    }
                    pw.print(tekst.charAt(j));
                }
                pw.println("");
                pw.flush(); 
            }
            
            br.close();
            pw.close();
        } catch(Exception e) {
            return;
        }
	}
} 