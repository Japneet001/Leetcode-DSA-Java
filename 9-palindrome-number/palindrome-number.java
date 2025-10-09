class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int temp = x;
        if (x < 0) return false;
        while(x > 0){
            num = num * 10 + (x % 10);
            x = x / 10;
        }
        return temp == num;
    }
}