package com.searchfunction;
import java.util.*;

public class Search {
	
	static List<Product> ProductList = new ArrayList<>();
	static List<Product> SortedList = new ArrayList<>();
	
	public static void add(Product p) {
		ProductList.add(p);
		SortedList.add(p);
		SortedList.sort(Comparator.comparingInt(pr->pr.ProductId));
	}
	
	public static Product BS(int id) {
		Product res=null;
		int len=SortedList.size();
		int end=len-1;
		int st=0;
		int mid=st+(end-st)/2;
		while(st<=end) {
			int v1 = SortedList.get(mid).ProductId;
			if(v1==id) {
				return SortedList.get(mid);
			}
			if(v1>id) {
				end=mid-1;
				mid=st+(end-st)/2;
			}
			else {
				st=mid+1;
				mid=st+(end-st)/2;
			}
		}
		
		return res;
	}
	
	public static Product LS(int id) {
		Product res=null;
		for(Product p:ProductList) {
			if(p.ProductId==id) {
				res=p;
				break;
			}
		}
		return res;
	}
}
