class Solution {
    public int candy(int[] ratings) {
       int[] result = new int[ratings.length];
    result[0] = 1;
        for(int i = 0;  i < ratings.length; i++)
            result[i] = 1;
    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1])
        result[i] = result[i - 1] + 1;
     
    }
    for (int i = ratings.length - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1])
        result[i] = Math.max(result[i], result[i + 1] + 1);

    }
    int sum = 0;
    for (int nums : result)
      sum += nums;
    return sum;  
    }
}