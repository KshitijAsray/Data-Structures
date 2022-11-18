package Extras;

class equation_solver {
    public static void main(String[] args) 
    {
        String str1 = "X*6=30";
        String str2 = "1+X=3";
        System.out.println(arithmetic(str1));
        System.out.println(arithmetic(str2));
    }
    public static int arithmetic(String input1)
    {
        int len = input1.length();
        int star = input1.indexOf('*');
        int plus = input1.indexOf('+');
        int sub = input1.indexOf('-');
        int div = input1.indexOf('/');
        int equal = input1.indexOf('=');
        int X = input1.indexOf('X');
        int ans = 0;
        if(star!=-1)
        {
            if(X>star)
            {
                int op1 = Integer.valueOf(input1.substring(0, star));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2/op1;
            }
            else
            {
                int op1 = Integer.valueOf(input1.substring(star+1,equal));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2/op1;
            }
        }
        if(plus!=-1)
        {
            if(X>plus)
            {
                int op1 = Integer.valueOf(input1.substring(0, plus));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2-op1;
            }
            else
            {
                int op1 = Integer.valueOf(input1.substring(plus+1,equal));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2-op1;
            }
        }
        if(div!=-1)
        {
            if(X>div)
            {
                int op1 = Integer.valueOf(input1.substring(0, div));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2*op1;
            }
            else
            {
                int op1 = Integer.valueOf(input1.substring(div+1,equal));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2*op1;
            }
        }
        if(sub!=-1)
        {
            if(X>sub)
            {
                int op1 = Integer.valueOf(input1.substring(0, sub));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2+op1;
            }
            else
            {
                int op1 = Integer.valueOf(input1.substring(sub+1,equal));
                int op2 = Integer.valueOf(input1.substring(equal+1, len));
                ans = op2+op1;
            }
        }
        return ans;
    }
}