package Hashing;
public class Driver_code_chaining
{
    public static void main(String[] args) 
	{ 
	    hash_table_open_addressing_linear_probing mh = new hash_table_open_addressing_linear_probing(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.delete(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
} 