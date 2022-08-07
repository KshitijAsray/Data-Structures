package recursion;
public class asdf 
{ 
	public static void main(String args[])
	{
		ally(13);
	}
	    static void ally(long n) 
	    { 	
	        int j = 0;
	       for(int i = 1;i<n;i++)
	       {
	           if(noofdigits(i)==1)
	                j++;
	           else
	           {
	        	   System.out.println(i);
	                 int arr[] = array_elements(i,noofdigits(i));
	                 print(arr);
	                 System.out.println();
	                 int arr1[]= sort(arr);
	                 print(arr1);
	                 System.out.println();
	                 int a = arrayToInt(arr1);
	                 System.out.print(a);
	                 if(i==a)
	                 j++;
	                 for(int p = 0;p<arr.length;p++)
	 		    	{
	 		    		arr[p] = 0;
	 		    	}
	           }
	           
	       }
	        System.out.println(j);
	    }
	    public static void print(int arr[])
		{
			for(int i = 0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	    static int arrayToInt(int[] arr)
	    {
	        StringBuilder s = new StringBuilder(); 

	    for (int i : arr)
	    {
	         s.append(i);
	    }

	    return Integer.parseInt(s.toString());
	    }
	    static int[] array_elements(int n,int c)
	    {
	        int arr[] = new int[c];
	        int o = 0;
	        while(n!=0)
	        {
	            arr[o] = n%10;
	            n/=10;
	        }
	        return arr;
	    }
	    static int noofdigits(long n)
	    {
	      //int i = 0;
	      int c = 0;
	      while(n!=0)
	      {
	          c++;
	          n/=10;
	      }
	      return c;
	    }
	    static int[] sort(int arr[])
	    {
			for(int i = 0;i<arr.length;i++)
			{
				for(int j = i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j] = temp;
					}
				}
				
			}
			return arr;
	    }
	}
