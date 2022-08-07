package Stacks;
import java.util.Stack;
public class parenthesis 
{
    public static void main(String args[])
    {
        String str[] = {"([{}{(}])","((())","{[()]}","{}([{}])","((()))"};
        for(int i = 0;i<str.length;i++)
        {
            System.out.println(parenthesis_check(str[i]));
        }
    }
    public static String parenthesis_check(String str)
    {
        if(str.length()==0)
        {
            return "No";        
        }
        else
        {
            Stack<Character> st = new Stack<>();
            for(int i = 0;i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(ch==')'||ch=='}'||ch==']')
                {
                    char ch1 = st.peek();
                    if(((ch1=='('))&&(ch==')')||((ch1=='{'))&&(ch=='}')||((ch1=='['))&&(ch==']'))
                        st.pop();
                    else if(st.isEmpty()==true)
                        return "No";
                    else
                        return "No";
                }
                else
                    st.push(str.charAt(i));
            }

            if(st.isEmpty()==true)
            {
                return "Yes";
            }
            else
                return "No";
        }
    }    
}
