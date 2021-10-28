package com.app.ProvaIngSw_210410;

import java.util.Comparator;
import java.util.List;

public class MyListUtil {

	public List<Integer> sort(List<Integer> l, final int order) throws IllegalArgumentException {
		
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(order == 0)
					return o1.compareTo(o2);
				else if(order == 1)
					return o2.compareTo(o1);
				else
					throw new IllegalArgumentException("order must be 0 or 1 (was " + order + ")");
			}
			
		});
		
		return l;
		
	}
	
}
