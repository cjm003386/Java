package ex06_1_array;

public class ForExample2 {
	public static void main(String args[]) {
	   String names[] = {"최무근", "하명희","최정욱","최정민"};
	   
	   for(String name : names) {
		   System.out.println(name);
	   }
	   
	   //기존 for문
	   for(int i =0; i<names.length; i++) {
		   System.out.println(names[i]);
		   }
	}

}
