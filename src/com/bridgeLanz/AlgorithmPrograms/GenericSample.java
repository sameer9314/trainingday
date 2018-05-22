package com.bridgeLanz.AlgorithmPrograms;

public class GenericSample {
//	public static int findintMax(int x,int y,int z) {
//		if(x>y && x>z) {
//			return x;
//		}
//		else if(y>x && y>z) {
//			return y;
//		}
//		return z;
//	}
	
//	public static String findStringMax(String x,String y,String z) {
//		if(x.compareTo(y)>0 && x.compareTo(z)>0 ){
//			return x;
//		}
//		else if(y.compareTo(x)>0 && y.compareTo(z)>0) {
//			return y;
//		}
//		return z;
//	}
	
//	public static int findintMax(int x,int y,int z) {
//		return (x>y) ? ((x>z)? x:y):z;
//	}
//	public static String findStringMax(String x,String y,String z) {
//		return  x.compareTo(y)<0 ? (x.compareTo(z)<0 ? x:y):z ;
//	}
	
	public static<T extends Comparable<T>> T findMax(T x,T y,T z) {
		return  x.compareTo(y)<0 ? (x.compareTo(z)<0 ? x:y):z ;
	}
	
	public static void main(String[] args) {
		System.out.println(GenericSample.findMax(22,15,6));
		System.out.println(GenericSample.findMax(22.7,15.4,6.1));
		System.out.println(GenericSample.findMax('s','y','q'));
		System.out.println(GenericSample.findMax("sameer","yellow","july"));
		//System.out.println(GenericSample.findMax(22,15.48,'j'));
}
}
