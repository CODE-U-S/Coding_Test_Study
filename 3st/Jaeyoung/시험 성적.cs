using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] Num = Console.ReadLine().Split();
            int A = int.Parse(Num[0]);
            if ( A >= 90 && A <= 100  ) {
                Console.WriteLine("A");
            } else if ( A >= 80 && A <= 89 ) {
                Console.WriteLine("B");
            } else if ( A >= 70 && A <= 79 ) {
                Console.WriteLine("C");
            } else if ( A >= 60 && A <= 69 ) {
                Console.WriteLine("D");
            } else {
                Console.WriteLine("F");
            }
        }
    }
}