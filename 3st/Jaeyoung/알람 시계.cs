using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] num = Console.ReadLine().Split();
            long H = long.Parse(num[0]);
            long M = long.Parse(num[1]);

            M -= 45;
            if ( M < 0 ) {
                M += 60;
                H -= 1;

                if ( H < 0 ) {
                    H = 23;
                }
            }
            Console.WriteLine($"{H} {M}");
        }
    }
}