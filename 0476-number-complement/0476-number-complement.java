class Solution {
    public int findComplement(int num) {

        int result = 0;
        int place = 1;

        while(num > 0) {

            if(num % 2 == 0)
                result += place;

            place *= 2;
            num /= 2;
        }

        return result;
    }
}