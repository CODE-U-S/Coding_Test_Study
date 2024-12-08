using System;
namespace BOJ {
    class Program {
        static void Main(string[] args) {
            string[] s = Console.ReadLine().Split();
            Console.WriteLine(int.Parse(s[0]) * int.Parse(s[1]));
        }
    }
}