package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
//		String [] arr = {"job","ken","hint"};
//		//List<String> arrList = Arrays.asList(arr);
//		//System.out.println(arrList.get(2));
//		
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("kenn");
//		a.add("add");
//		a.add("dc");
//		System.out.println(a.get(1));
		try {
	     int [] arr1= {2,5,6,1};
	    	Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));	
		}
		catch(Exception e){
			Object[] arr1 = new Object[3];
			Arrays.sort(arr1, Collections.reverseOrder());
		}

	}

}
