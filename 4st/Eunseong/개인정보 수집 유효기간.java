import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            for (int j = 0; j < terms.length; j++) {
                if (privacies[i].substring(11).equals(Character.toString(terms[j].charAt(0)))) {
                    int year[] = {Integer.parseInt(today.substring(0,4)), Integer.parseInt(privacies[i].substring(0,4))};
                    int month[] = {Integer.parseInt(today.substring(5,7)), Integer.parseInt(privacies[i].substring(5,7))};
                    int day[] = {Integer.parseInt(today.substring(8,10)), Integer.parseInt(privacies[i].substring(8,10))};
                    int term = Integer.parseInt(terms[j].substring(2));
                    System.out.println(year[1] + " " + month[1] + " " + day[1] + " " + Integer.parseInt(terms[j].substring(2)));
                    month[1] += term;
                    System.out.println(year[1] + " " + month[1] + " " + day[1]);
                    if (month[1] > 12) {
                        if (month[1] % 12 != 0) {
                            year[1] += month[1] / 12;
                            month[1] %= 12;
                        } else {
                            year[1] += month[1] / 12 - 1;
                            month[1] = 12;
                        }
                    }
                    System.out.println(year[1] + " " + month[1] + " " + day[1]);
                    if (year[0] > year[1] || (year[0] == year[1] && month[0] > month[1]) || (year[0] == year[1] && month[0] == month[1] && day[0] >= day[1])) {
                        answer.add(i + 1);
                        break;
                    }
                }
            }
        }
        int result[] = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}