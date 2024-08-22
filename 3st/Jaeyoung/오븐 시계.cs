using System;
namespace BOJ {
    class Program {
        static void Main() {
            string[] num = Console.ReadLine().Split();
            int H = int.Parse(num[0]);
            int M = int.Parse(num[1]);
            int C = int.Parse(Console.ReadLine());

            int T = H * 60 + M;
            T += C;

            H = (T / 60) % 24;
            M = T % 60;
            Console.WriteLine($"{H} {M}");
        }
    }
}