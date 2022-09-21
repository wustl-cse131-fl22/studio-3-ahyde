package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int n;
		int i;
		int k;
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to check until");
		n = in.nextInt();
		int[] prime = new int[n];
		for (i=0; i<n; i++) {
			prime[i] = i;
		}
		
		for (i=2; i<n; i++) {
			if(prime[i] != 0) {
				for(k=2; k < n; k++) {
					if (prime[i]*k >= n) { 
						break;
					} else {
						prime[k*prime[i]]=0;
					}
				}
			}
		}
		for(i = 2; i < n; i++)
		{
			if(prime[i]!=0)
			{
				System.out.println(prime[i]);
			}
		}
		}
	}
		
		

