package ex06_1_array;

public class TwoArrayExample1 {
	public static void main (String args[]) {
		int table[][] = new int [3][4];//3青 4凯狼 农扁肺 积己
		
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		
		for(int i = 0; i<table.length; i++) 
			System.out.println("table[0]["+ i + "] = " + table[0][i]);
		
		for(int i = 0; i<table.length; i++) 
			System.out.println("table[0]["+ i + "] = " + table[1][i]);
		
		for(int i = 0; i<table.length; i++) 
			System.out.println("table[0]["+ i + "] = " + table[2][i]);
		
		
		System.out.println("============================");
		
		for(int k=0; k<table.length; k++) {
			for(int i=0;i<table[k].length;i++)
				System.out.println("table[" + k + "][" + i + "]=" + table[k][i]);
		}
	
	}
}
				
			
