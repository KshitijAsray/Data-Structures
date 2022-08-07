package Graphs;
public class Node<T,V>
{
	public T weight;
	public V ver;
	public Node(V ver,T weight)
	{
		this.weight = weight;
		this.ver = ver;
	}
	public T get_weight()
	{
		return weight;
	}
	public V get_ver()
	{
		return ver;
	}
}
