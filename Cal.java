import java.util.*;

public class Cal{

	public static void add(int a, int b){
		System.out.println(a+b);
	}

	public static void mul(int a, int b){
		System.out.println(a*b);
  }
  
	public static void sub(int a, int b){
		System.out.println(Math.abs(a-b));
	}

	public static void main(String args[]){
		add(10,20);
    sub(100,50);
   	mul(50,10);
	}
}
