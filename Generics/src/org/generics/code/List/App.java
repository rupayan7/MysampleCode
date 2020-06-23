package org.generics.code.List;

import java.util.ArrayList;
import java.util.List;

class DataSet<K extends Number,V>{
	private K key;
	private V value;
	
	
	public DataSet() {
		
	}
	
	
	public DataSet(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	
	


	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}


	@Override
	public String toString() {
		return "List [key=" + key + ", value=" + value + "]";
	}
	
	public void display(List<DataSet<K,V>> list) {
		for(DataSet<K,V> l: list)
		{
			System.out.println("Elements: "+l);
		}
	}
	
	
}

class ListVal<K extends Integer, V>{
	List<DataSet<K,V>> arrayList =  new ArrayList<DataSet<K,V>>();
	@SuppressWarnings("unchecked")
	void addValue() {
		arrayList.add((DataSet<K, V>) new DataSet<Integer, String>(1, "One"));
		arrayList.add((DataSet<K, V>) new DataSet<Integer, String>(10, "Ten"));
		arrayList.add((DataSet<K, V>) new DataSet<Integer, String>(11, "Eleven"));
		arrayList.add((DataSet<K, V>) new DataSet<Integer, String>(2, "Two"));
		arrayList.add((DataSet<K, V>) new DataSet<Integer, String>(20, "Twenty"));
		//arrayList.add((DataSet<K, V>) new DataSet<String, String>("Buni", "Twenty"));
		
		DataSet<K,V> ds = new DataSet<K,V>();
		ds.display(arrayList);
	}
}




public class App {

	public static <K extends Integer, V> void main(String[] args) {
		ListVal<K,V> lv = new ListVal<K,V>();
		lv.addValue();
		
		

	}

}
