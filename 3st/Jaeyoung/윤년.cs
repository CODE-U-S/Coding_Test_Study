using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] Num = Console.ReadLine().Split();
            int A = int.Parse(Num[0]);
            if ( A % 4 == 0 && ( A % 100 != 0 || A % 400 == 0 ) ) {
                Console.WriteLine("1");
            } else {
                Console.WriteLine("0");
            }
        }
    }
}