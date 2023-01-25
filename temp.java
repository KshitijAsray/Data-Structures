class test
{
    public static void main(String args[])
    {
        String str = "52497689";
        StringBuilder sb = new StringBuilder(str.substring(0,2));
        int j = str.length()-1;
        for(int i = 2;i<str.length();i=i+1)
        {
            sb.append(str.charAt(j));
            sb.append(str.charAt(i));
            j--;
            if(sb.length()==str.length())
                break;
        }
        System.out.println(sb);
    }
}
/*Advantage Club has a unique way of celebrating. Suppose the last celebration was when the number of 
users was N and the next celebration will happen when the number of users grows to M, such that N and M have the 
same digits only in a different order. Ankit is a new joiner and he missed the last celebration, write a code to 
help Ankit find M, i.e. the number of users Advantage Club needs to reach for the next celebration. Example: Input: N = "524976"                
Output: M = "526479"Also, mention the Time Complexity of your code. */