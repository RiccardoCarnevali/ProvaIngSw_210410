package com.app.ProvaIngSw_210410;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {

	public List<Integer> sort(List<Integer> l, final int order) throws IllegalArgumentException {
		
//		l.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(order == 0)
//					return o1.compareTo(o2);
//				else if(order == 1)
//					return o2.compareTo(o1);
//				else
//					throw new IllegalArgumentException("order must be 0 or 1 (was " + order + ")");
//			}
//			
//		});
		
		if(order < 0 || order > 1)
			throw new IllegalArgumentException("order must be 0 or 1 (was " + order + ")");
		
		for(int i = 1; i < l.size(); ++i) {
			int key = l.get(i);
			int j = i - 1;
			
			while(j >= 0) {
				if(order == 0) {
					if(l.get(j).compareTo(key) > 0) {
						Integer temp = l.get(j);
						l.set(j, l.get(j + 1));
						l.set(j + 1, temp);
					}
					else {
						break;
					}
				}
				
				if(order == 1) {
					if(l.get(j).compareTo(key) < 0) {
						Integer temp = l.get(j);
						l.set(j, l.get(j + 1));
						l.set(j + 1, temp);
					}
					else {
						break;
					}
				}
				
				--j;
			}
		}
		
		return l;
		
	}	
}
