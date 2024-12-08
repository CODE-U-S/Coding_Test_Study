using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] n = Console.ReadLine().Split();
            for ( int i = 1 ; i <= 9 ; i++ ) 
                Console.WriteLine($"{int.Parse(n[0])} * {i} = {int.Parse(n[0])*i}");
        }
    }
}