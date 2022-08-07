package basics;

public class new_pair_class {

	public static void main(String[] args) 
	{
		int_pair_class<String> ob = new int_pair_class<String>("asdfg","ertyu");
		pair_class<Character, Double> oc = new pair_class<Character,Double>('a', 1234.345);
		System.out.println(ob.getab());
		System.out.println(ob.getac());
		System.out.println(oc.getab());
		System.out.println(oc.getac());
	}

}
