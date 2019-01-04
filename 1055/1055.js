// ID 1055
// PP0602A - Parzyste nieparzyste
// Wczytaj ciąg liczb. Następnie wypisz wczytane liczby w taki sposób, aby najpierw pojawiły się te, które wystąpiły na pozycjach parzystych, a następnie te, które wystąpiły na pozycjach nieparzystych; z zachowaniem pierwotnej kolejności w obrębie obu grup. Numerujemy od 1.
// 
// Wejście
// Najpierw t - liczba testów. Następnie dla każdego testu liczba n i n liczb, n <= 100.
// 
// Wyjście
// Dla każdego testu n liczb w opisanym porządku.
// 
// Przykład
// Wejście:
// 2 
// 4 1 2 3 5
// 3 9 8 7 
// 
// Wyjście:
// 2 5 1 3
// 8 9 7

let testNr = parseInt(readline());

while (testNr-- > 0) {
   let arr = readline().split(" ");
   let answer = "";

   let count = parseInt(arr[0]);
   for ( let i = 2; i <= count; i += 2 ) {
      answer += arr[i] + " ";
   }

   for ( let i = 1; i <= count; i += 2 ) {
      answer += arr[i] + " ";
   }

   putstr(answer + "\n");
}