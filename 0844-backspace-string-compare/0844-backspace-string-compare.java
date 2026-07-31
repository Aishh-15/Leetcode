class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c != '#')
                a.append(c);
            else if(a.length() > 0)
                a.deleteCharAt(a.length() - 1);
        }

        for(char c : t.toCharArray()) {
            if(c != '#')
                b.append(c);
            else if(b.length() > 0)
                b.deleteCharAt(b.length() - 1);
        }

        return a.toString().equals(b.toString());
    }
}