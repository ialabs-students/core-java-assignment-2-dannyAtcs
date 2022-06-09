package com.assignment2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayDescendingOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many inputs do you want to enter : ");
		int n = sc.nextInt();
		
		List<BigInteger> list = new ArrayList<BigInteger>();
		
		
		for(int i=0;i<n;i++)
		{
			BigInteger no = sc.nextBigInteger();
			list.add(no);
		}
		
		System.out.println("Print List Before Sorting : " + list);
		
		//method call
		arrayListSortDesc(list);
		System.out.println("Print List After Sorting : " + list);
		
		sc.close();
	}
	
	//This function will use Collection framework in this first it will sort the list
    //and then it reverse the list 	
	public static List<BigInteger> arrayListSortDesc(List<BigInteger> list) {
		
		Collections.sort(list, Collections.reverseOrder());
		return list;
		
	}
}
