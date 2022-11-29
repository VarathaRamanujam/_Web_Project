package com.student.demo;

import java.util.Comparator;
import java.util.List;

import com.student.demo.model.Students;

public class MyComparator implements Comparator<Students> {

//		@Override
//		public int compare(Students_obj arg0, Students_obj arg1) {
//			
//			 // used for int
//			if(arg0.age>arg1.age) return 1; 
//			else if (arg0.age<arg1.age) return -1;
//			else return 0;
//			 
//			
//			//used for string
//			//return arg0.name.compareTo(arg1.name);
//		}

//		public MyComparator() {
//	}

		@Override
		public int compare(Students o1, Students o2) {
			if(o1.getRegisterNumber()>o2.getRegisterNumber()) return 99; 
			else if (o1.getRegisterNumber()<o2.getRegisterNumber()) return -100;
			else return 0;
		}


		}



