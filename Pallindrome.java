class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int digit;
        int newNum = 0;
        while (num > 0) {
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        if (newNum == x) {
            return true;
        } else {
            return false;
        }
    }
}