class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;

        for(String s : strs) {

            boolean digit = true;

            for(char c : s.toCharArray()) {

                if(!Character.isDigit(c)) {
                    digit = false;
                    break;
                }
            }

            if(digit)
                max = Math.max(max, Integer.parseInt(s));
            else
                max = Math.max(max, s.length());
        }

        return max;
    }
}