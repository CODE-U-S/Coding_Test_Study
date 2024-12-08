using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] num = Console.ReadLine().Split();
            long A = long.Parse(num[0]);
            long B = long.Parse(num[1]);
            long C = long.Parse(num[2]);
            long sum = A + B + C;
            Console.WriteLine(sum);
        }
    }
}