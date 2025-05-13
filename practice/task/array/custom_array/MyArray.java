package practice.task.array.custom_array;

import java.util.Arrays;
import java.util.List;

public class MyArray {

	private static final int max_capacity = 4;
	private String[] data;
	private int size = 0;

	public MyArray() {
		data = new String[max_capacity];

	}

	public void add(String element) {
		checkCapacity();
		data[size] = element;
		size++;
	}
	
	public String getIndex(int index) {
		if(index <0 || index>size) {
			System.out.println("invalid index");
		}
		return null;
	}

	
	private void checkCapacity() {
		if (size == data.length) {
			int newCapacity = size * 2;
			String[] newArr = new String[newCapacity];
			String[] copyArray= copyArray(newArr);
			data = copyArray;
		}
	}

	public String[] copyArray(String [] newArr) {
		for (int i = 0; i < data.length; i++) {
			newArr[i] = data[i];
		}
		return newArr;
	}
	
	public String getString(int index) {
		if((index>0 || index<size)) {
			return data[index];
		}else {
			return "Invalid index";
			
		}
		
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
	}
	public void displayList() {
		List<String> lis = Arrays.asList(data);
		List<String>elements = lis.subList(0, size);
		System.out.println(elements);
	}

}
