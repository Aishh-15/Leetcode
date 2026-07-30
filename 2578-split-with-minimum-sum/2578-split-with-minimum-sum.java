class Solution {
    public int splitNum(int num) {

        char[] arr = String.valueOf(num).toCharArray();

        Arrays.sort(arr);

        String a = "";
        String b = "";

        for(int i = 0; i < arr.length; i++) {

            if(i % 2 == 0)
                a += arr[i];
            else
                b += arr[i];
        }

        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}