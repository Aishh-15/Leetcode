class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        boolean bulky = (length >= 10000 || width >= 10000 || height >= 10000 ||
                (long)length * width * height >= 1000000000);

        boolean heavy = mass >= 100;

        if(bulky && heavy)
            return "Both";
        if(!bulky && !heavy)
            return "Neither";
        if(bulky)
            return "Bulky";

        return "Heavy";
    }
}