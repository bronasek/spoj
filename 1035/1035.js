// ID 1035
// PP0601A2 - Test 3
// Przepisz dane z wejścia na wyjście. Dane wejściowe są dwucyfrowymi liczbami naturalnymi. Zakończ działanie programu, gdy na wejściu pojawi się, trzecia liczba 42 poprzedzona jakąkolwiek inną liczbą, różną od 42.
// 
// Wejście
// W każdej linii jedna liczba dwucyfrowa.
// 
// Wyjście
// W każdej linii jedna liczba dwucyfrowa. Odczytane wartości 42 również powinny się pojawić.
// 
// Przykład
// Wejście:
// 42
// 42
// 12
// 13
// 42
// 11
// 42
// 43
// 42
// 42
// 99
// 01
// Wyjście:
// 42
// 42
// 12
// 13
// 42
// 11
// 42
// 43
// 42

let number = 0;
let prevNumber;
let count = 0;

while ((number = readline()) !== null && count < 3) {

   if (number == 42 && prevNumber != 42 && prevNumber != null) {
      count++;
   }

   prevNumber = number;

   print(number);
}