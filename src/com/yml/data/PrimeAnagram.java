package com.yml.data;

import java.util.Scanner;

class PrimePalindrome{
	int m,n,rev,c;
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the lower limit:");
		m=sc.nextInt();
		System.out.print("Enter the upper limit:");
		n=sc.nextInt();

		}
	void palindrome()
	{
		int num,tmp,i;
		System.out.println("The prime Palindromes are:");
		for(num=m;num<=n;num++)
		{
			c=0;
			rev=0;
			tmp=num;
			for(i=1;i<=tmp;i++)
			{
				if(tmp%i==0)
					c++;
			}
				if(c==2)
				{
					while
						(tmp>0)
					{
						rev=rev*10+(tmp%10);
						tmp/=10;
					}
					if(rev==num)
						System.out.print(num+"  ");
				}
			}
		}
	public static void main(String[] args) {
		PrimePalindrome p = new PrimePalindrome();
		p.input();
		p.palindrome();
	}
}