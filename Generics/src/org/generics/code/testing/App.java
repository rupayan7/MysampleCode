package org.generics.code.testing;

import java.util.ArrayList;
import java.util.List;

/* T- Type
 * E - Elements
 * N - numbers
 * K- Keys
 * V- Value
 */

class NameList<T, K, N, E, V> {
	private T data;
	private K key;
	private N number;
	private E element;
	private V value;
	
	public NameList() {
		
	}

	public NameList(T data, K key, N number, E element, V value ) {
		this.data = data;
		this.key = key;
		this.number = number;
		this.element = element;
		this.value = value;
	}

	public NameList(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	

	public NameList(N number , E element, V value) {
		super();
		this.number = number;
		this.element = element;
		this.value = value;
	}

	
	  @Override public String toString() { return "Generic [data=" + data +
	  ", key=" + key + ", number=" + number + ", element=" + element + ", value=" +
	  value + "]"; }
	 

	public T getData() {
		return data;
	}

	public K getKey() {
		return key;
	}

	public N getNumber() {
		return number;
	}

	public E getElement() {
		return element;
	}

	public V getValue() {
		return value;
	}
	void display(List<NameList<T, K, N, E, V>> list) {
		for(NameList<T, K, N, E, V> l :list)
		{
			System.out.println("Elements : "+l);
		}
	}
	

}

public class App {

	@SuppressWarnings("unchecked")
	public static <K, V, N, E, T> void main(String[] args) {
		List<NameList<T, K, N, E, V>> list = new ArrayList<NameList<T, K, N, E, V>>();
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>(1, "Rupayan"));
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>(2, "Sweta"));
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>(1, "Sreyasi"));
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>(1, "Saswata"));
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>(1.2F, "Kalitala", "Suman"));
		list.add((NameList<T, K, N, E, V>) new NameList<Object,Object,Object,Object,Object>("Debipur", "6", 1.5D, "Kalitala", "Vollo"));
		
		NameList<T, K, N, E, V> g = new NameList<T, K, N, E, V>();
		g.display(list);
		
	}

}
