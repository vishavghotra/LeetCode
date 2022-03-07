class Solution {
    public int subtractProductAndSum(int n) {
         if (n == 0)
            return 0;
        int resultSum = 0;
        int resultMul = 1;
        while (n > 0) {
            int intermediate = n % 10;
            resultSum += intermediate;
            resultMul *= intermediate;
            n = n / 10;

        }
        return resultMul - resultSum;
    }
}