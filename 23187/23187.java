// ID 23187
// FR_03_20 - T9
// Napisz program, który sprawdzi, czy podane słowo mogło powstać z danej kombinacji cyfr dzięki słownikowi T9.
// 
// Input
// W pierwszym wierszu jedna liczba t (0<t<100) oznaczająca liczbę zestawów testowych.
// 
// W kolejnych wierszach po dwa wyrazy, złożone z dużych i małych liter liter alfabetu angielskiego, oraz cyfr 0-9*. Długość wyrazów jest zawsze taka sama i nie przekracza 200.
// 
// *a-z, A-Z, 0-9
// 
// Output
// Jeśli z podanej kombinacji liczb można utworzyć dany wyraz, wypisz ‘’TAK - <wyraz>’’ – przykładowo ‘’TAK – Fraktal’’.
// 
// Jeśli nie można, wypisz ‘’NIE’’.
// 
// Każdy zestaw oddzielany jest znakiem nowej linii.
// 
// Example
// Input:
// 3
// 
// FraKtal 3725825
// 
// BlednaKomBinacjA123 2533625662462252122
// 
// NIE 643
// 
// Output:
// TAK – FraKtal
// 
// NIE
// 
// TAK - NIE

import java.io.*;
import java.util.*;

public class T9 {                                          // id 23187

    public static void main(String[] args){                // FR_03_20
     
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw=new PrintWriter(new BufferedOutputStream(System.out));
            int nrTest=Integer.parseInt(br.readLine());
            String[][] t={{"1"},{"2","A","B","C"},{"3","D","E","F"},{"4","G","H","I"},{"5","J","K","L"},{"6","M","N","O"},{"7","P","Q","R","S"},{"8","T","U","V"},{"9","W","X","Y","Z"},{"0"}};
            for (int i=0;i<nrTest;i++){
              String[] d=br.readLine().split(" ");
              String[] a=d[0].split("");
              String b=d[1];
              StringBuilder z=new StringBuilder("");
              for (int j=0;j<a.length;j++) {
                  for (int k=0;k<10;k++) {
                      for (int l=0;l<t[k].length;l++){
                          if(a[j].equalsIgnoreCase(t[k][l])){z.append(t[k][0]);}}}}
              String r = (Arrays.toString(a)).substring(1, (a.length * 3) - 1).replace(", ", "");
              if (b.equals(""+z)){
                      pw.println("TAK - "+r+"\n");
                  } else {
                      pw.println("NIE\n");}}
            br.close();
            pw.close();
        } catch (Exception e){
            return;}}}
