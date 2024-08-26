using System;
public class Solution {
    public string solution(string s) {
        string[] num = s.Split();
        int[] n = new int[num.Length];
        for ( int i = 0 ; i < num.Length ; i++ ) {
            n[i] = int.Parse(num[i]);
        }
        Array.Sort(n);

        return $"{n[0]} {n[n.Length-1]}";
    }
}