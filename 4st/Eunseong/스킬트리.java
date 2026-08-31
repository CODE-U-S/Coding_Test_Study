class Solution {
    public int solution(String skill, String[] skill_trees) {
        int index = 0;
        int answer = 0;
        for (String s : skill_trees) {
            index = 0;
            boolean flag = true;
            //System.out.println(s + " : ");
            for (char c : s.toCharArray()) {
                // if (index < skill.length()) {
                //     System.out.println(skill.charAt(index) + " / " + c);
                // } else {
                //     System.out.println("길이초과");
                // }
                if (index < skill.length() && c == skill.charAt(index)) {
                    index++;
                    flag = true;
                } else if (skill.contains(Character.toString(c))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}