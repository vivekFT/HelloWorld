package com.github.vivek;


class HelloWorld{
	public static int printCount = 0;
	//This function is added to test the git commit feature	
	public void printOneToTen(){
		for(int i = 0; i < 10 ; i++){
			System.out.println("Printing this for 10 times");
		}
	}	

	public static void main(String args[]){
		printOneToTen();
		System.out.println("Hello World");
	}
}
