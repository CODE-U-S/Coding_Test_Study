using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] s = Console.ReadLine().Split();
            Console.WriteLine(double.Parse(s[0]) / double.Parse(s[1]));
        }
    }
}