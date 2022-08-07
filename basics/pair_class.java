package basics;

public class pair_class<T,V> {

	public static void main(String[] args) 
	{
		

	}
	 T ab;
	 V ac;
	 public pair_class(T ab,V ac )
	 {
		 this.ab = ab;
		 this.ac = ac;
	 }
	public T getab()
	{
		return ab;
	}
	public V getac()
	{
		return ac;
	}
	public void setab(T ab)
	{
		this.ab = ab;
	}
	public void setac(V ac)
	{
		this.ac = ac;
	}

}
