/*
        leetcode:70 爬楼梯
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        //1.确定dp数组以及下标的含义 dp[i]表示爬到第i层有dp[i]种方法
        int[] dp = new int[n + 1];
        //3.dp数组初始化
        dp[1] = 1;
        dp[2] = 2;
        //4.确认遍历顺序
        for (int i = 3; i <= n; i++) {
            //2.确定递推公式
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
