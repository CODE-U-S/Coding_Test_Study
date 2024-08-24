using System;
using System.Collections.Generic;
using System.Linq;
namespace BOJ {
    class Program {
        static void Main(string [] args ) {
            string [] str = Console.ReadLine().Split();
            int A = int.Parse(str[0]);
            int B = int.Parse(str[1]);
            int C = int.Parse(str[2]);

            if (A == B && B == C) 
            {
                Console.WriteLine(10000 + (A * 1000));
            }
            else if (A == B)
            {
                Console.WriteLine(1000 + A * 100);
            }
            else if (A == C)
            {
                Console.WriteLine(1000 + A * 100);
            }
            else if (B == C)
            {
                Console.WriteLine(1000 + B * 100);
            }
            else
            {
                if (A > B && A > C)
                {
                    Console.WriteLine(100 * A);
                }
                else if(B > C)
                {
                    Console.WriteLine(100 * B);
                }
                else
                {
                    Console.WriteLine(100 * C);
                }
            }
        }
    }
}