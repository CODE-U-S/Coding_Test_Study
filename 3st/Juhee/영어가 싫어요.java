class Solution {
    public long solution(String numbers) {
        String[] matchNumbers = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
