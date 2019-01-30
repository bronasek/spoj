// ID 17140
// AL_13_10 - To zadanie jest łatwe!
// Jak to mówią "Reklama dźwignią handlu!". Skoro tu jesteś, to przemówiła do ciebie nazwa zadania i masz nadzieję, że jest ona prawdziwa. Niestety, reklamy i spoty nie zawsze mówią prawdę i często czujemy się oszukani przez system. Czytając to zastanawiasz się, czy autor jest uczciwy i rzeczywiście umieścił łatwe zadanie, czy tylko chciał, aby ilość odwiedzin tej strony była większa? Przekonaj się sam czytając treść zadania:
// 
// Sprawdź, czy istnieje taki podciąg (niekoniecznie spójny) pierwszego ciągu, który jest równoważny drugiemu ciągowi.
// 
// Wejście
// W pierwszym wierszu liczba t określająca ilość zestawów danych, gdzie t < 105.
// 
// Każdy zestaw składa się z dwóch ciągów wielkich liter języka łacińskiego. Każdy ciąg ma co najmniej jeden i co najwyżej 103 znaków.
// 
// Wyjście
// Dla każdego zestawu wypisz "Tak", jeśli z pierwszego ciągu można wybrać taki podciąg, który jest równy drugiemu ciągowi lub napis "Nie" w przeciwnym wypadku.
// 
// Przykład
// Wejście:
// 4
// ALGOLIGA GOLA
// LATWEZADANIE LATANIE
// SSAK KAS
// ALAMA ALAMAKOTA
// 
// Wyjście:
// Tak
// Tak
// Nie
// Nie

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
      int nrTest = Integer.parseInt(br.readLine());
      
      for (int t = 0; t < nrTest; t++) {
          String[] data = br.readLine().split(" ");
          String[] ciag1 = data[0].split("");
          String[] ciag2 = data[1].split("");
          
          if (ciag2.length > ciag1.length) {
              pw.println("Nie");
          } else {
              int i = 0;
              for (int j = 0; j < ciag1.length; j++) {
                  if (ciag2[i].equals(ciag1[j])) {
                      i++;
                  } 
                  if (i == ciag2.length){
                      break;
                  }
              }
              
              if (i == ciag2.length) {
                  pw.println("Tak");
              } else {
                  pw.println("Nie");
              }
          }
      }
      
      pw.flush();
      pw.close();
      br.close();
    } catch (Exception e) {
      return;
    }
	}
} 