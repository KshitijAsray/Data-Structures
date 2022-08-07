package Hashing;
public class hash_table_open_addressing_linear_probing 
{
    int[] arr;
    int m,size;
    hash_table_open_addressing_linear_probing(int b)
    {
        m = b;
        size = 0;
        arr = new int[m];
        for(int i = 0;i<m;i++)
        {
            arr[i] = -1;
        }
        print(arr);
    }
    public int My_hash(int key)
    {
        return key%m;
    }
    public boolean insert(int key)
    {
        if(size==m)
            return false;
        int i=My_hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
            i=(i+1)%m;
        if(arr[i]==key)
            return false;
        else{
            arr[i]=key;
            size++;
            return true;
        }
    }  
    public boolean search(int key)
    {
        if(size==0)
            return false;
        int h = My_hash(key);
        int i = h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
                return true;
            i = (i+1)%m;
            if(i==h)
            return false;
        }
        return false;
    }
    public boolean delete(int key)
    {
        if(size==0)
        return false;
        int h = My_hash(key);
        int i = h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
            {
                arr[i]=-2;
                return true;
            }
            i = (i+1)%m;
            if(i==h)
            return false;
        }
        return false;
    }
    public void print(int arr[])
    {
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
