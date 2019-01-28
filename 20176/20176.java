// ID 20176
// AL_17_01 - Mundial 2014
// Mundial 2014
// 
// Twoim zadaniem jest napisać program, który wypisze na standardowe wyjście: Mundial 2014
// 
// Zadanie wydaje się bardzo łatwe, i takie jest. Jedyna niedogodność, to zakaz używania cyfr [0-9] w kodzie źródłowym. 

import java.io.PrintWriter;

public class AL_17_01 {                                             // id 20176

    public static void main(String[] args) {                        // Mundial 2014
        
        try {
            PrintWriter write = new PrintWriter(System.out);    
            StringBuilder dwa = new StringBuilder("Mu"); 
            StringBuilder zero = new StringBuilder(""); 
            StringBuilder jeden = new StringBuilder("n"); 
            StringBuilder cztery = new StringBuilder("dial"); 

            write.append(dwa).append(jeden).append(cztery).append(" ");
            write.print(dwa.length());
            write.print(zero.length());
            write.print(jeden.length());
            write.println(cztery.length());

            write.flush();
            write.close();
        } catch (Exception e) {
            return;
        }
    }
}