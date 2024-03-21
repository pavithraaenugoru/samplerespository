package com.basic;
public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.print("Sum of digits: "+sum);*/
		int n=123;
		//System.out.print((n/10)+(n%10)); //only for 2 digits
		//System.out.print((n%10)+((n/10)%10)+(n/100)); //only for 3 digits
		//System.out.print((n%4==0)?true:false); //leap yr using ternaryoperator
		/*if(n==((n/100)+" "+(n%100)/10+" "+(n%100)%10)){
			System.out.print("It is Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}*/
		System.out.print((n/100==(n%100)%10)?"p":"np");
		System.out.println("changed");
	}
}
