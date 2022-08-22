package Dynamic_programming;

public class Egg_dropping_problem 
{
    public static void main(String args[])
    {
        int e = 50;
        int f = 1110;
        int res = Min_trials_dp(e, f);
        System.out.println(res);
    }
    public static int Min_trials(int e,int f)
    {
        if(f==1||f==0||e==1)
            return f;
        int min_value = Integer.MAX_VALUE,trial_floor,i; 
        for(i = 1;i<=f;i++)
        {
            trial_floor = Math.max(Min_trials(e-1, i-1), Min_trials(e, f-i));
            if(trial_floor<min_value)
                min_value = trial_floor;
        }
        return min_value+1;
    }
    public static int Min_trials_dp(int e,int f)
    {
        int dp[][] = new int[f+1][e+1];
        for(int i = 1;i<=e;i++)
        {
            dp[1][i] = 1;
            dp[0][i] = 0;
        }
        for(int i = 1;i<=f;i++)
            dp[i][1] = i;
        for(int i = 2;i<=f;i++)
        {
            for(int j = 2;j<=e;j++)
            {
                dp[i][j] = Integer.MAX_VALUE;
                for(int x = 1;x<=i;x++)
                {
                    dp[i][j] = Math.min(dp[i][j], 1+Math.max(dp[x-1][j-1], dp[i-x][j]));
                }
            }
        } 
        return dp[f][e]; 
    }   
}
