using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            int A = int.Parse(Console.ReadLine());
            int B = int.Parse(Console.ReadLine());
            int num1 = B % 10;
            int num10 = (B / 10) % 10;
            int num100 = B / 100;
            Console.WriteLine(A * num1);
            Console.WriteLine(A * num10);
            Console.WriteLine(A * num100);
            Console.WriteLine(A * B);
        }
    }
}