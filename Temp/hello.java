package Temp;
public class hello
{
    public static void process(int size)
        {
            int n = size;
            if(size==0)
                System.out.println("Wrong size");
            else
            {
                start_end_line(size);
                //Upward Triangle
                int i = 0;
                for(i = 0;i<size-1;i++)
                {
                    if(i%2==0)
                    {
                        Upward_spaces_forward(n);
                        for(int j = 0;j<i*2;j++)
                        {
                            System.out.print("=");
                        }
                        Upward_spaces_backward(n);
                        System.out.println();
                        n--;
                    }
                    else
                    {
                        Upward_spaces_forward(n);
                        for(int j = 0;j<i*2;j++)
                        {
                            System.out.print("-");
                        }
                        Upward_spaces_backward(n);
                        System.out.println();
                        n--;
                    }

                }
                System.out.print("|<");
                for(int k = 0;k<((size-1)*2);k++)
                {
                    if(i%2==0)
                        System.out.print("=");
                    else
                        System.out.print("-");
                }
                System.out.println(">|");
                //Lower Triangle
                i--;
                int p = 1,l;
                for(l = i;l>=0;l--)
                {
                    if(l%2==0)
                    {
                        Lower_spaces_forward(p);
                        for(int u = 0;u<l*2;u++)
                        {
                            System.out.print("=");
                        }
                        Lower_spaces_backward(p);
                        System.out.println();
                        p++;
                    }
                    else
                    {
                        Lower_spaces_forward(p);
                        for(int u = 0;u<l*2;u++)
                        {
                            System.out.print("-");
                        }
                        Lower_spaces_backward(p);
                        System.out.println();
                        p++;
                    }
                }
                start_end_line(size);
            }

            
        }
        public static void start_end_line(int size)
        {
            int m = size;
            System.out.print("+");
            for(int i = 0;i<(m*2);i++)
            {
                System.out.print("-");
            }
            System.out.print("+");
            System.out.println();
        }
        public static void Upward_spaces_forward(int size)
        {
                System.out.print("|");
                for(int j = 0;j<size-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("/");
        }
        public static void Upward_spaces_backward(int size)
        {
                System.out.print("\\");
                for(int j = 0;j<size-1;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("|");
        }
        public static void Lower_spaces_forward(int size)
        {
                System.out.print("|");
                for(int j = 0;j<size;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("\\");
        }
        public static void Lower_spaces_backward(int size)
        {
                System.out.print("/");
                for(int j = 0;j<size;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("|");
        }    
    public static void main(String args[])
        {
            process(7);
        }
}