package Practice;

import java.util.Arrays;

public class hashing 
{
    int arr[];
    int cap;
    int size;
    hashing(int cap)
    {
        this.cap = cap;
        size = 0;
        arr = new int[cap];
        Arrays.fill(arr,-1);
    }
    int hash(int key)
    {
        return (key%cap);
    }
    boolean search(int key)
    {
        int h = hash(key);
        int i = h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
            {
                System.out.println("key found");
                return true;
            }
            i = (i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }
    boolean insert(int key)
    {
        int i = hash(key);
        while(arr[i]!=-1&&arr[i]!=-2&&arr[i]==key)
            i = (i+1)%cap;
        if(arr[i]==key)
            return false;
        else
        {
            arr[i] = key;
            size++;
            return true;
        }
    }
    boolean erase(int key)
    {
        int h = hash(key);
        int i = h;
        while(arr[i]!=-1)
        {
            if(arr[i]==key)
            {
                arr[i] = -2;
                return true;
            }
            i = (i+1)%cap;
            if(i==h)
                return false;
        }
        return false;
    }
}
