package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			int m = sc.nextInt();
			a.add(m);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			int m = sc.nextInt();
			b.add(m);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			int m = sc.nextInt();
			c.add(m);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.print("Total students: " + total.size());
		
		sc.close();
	}
}
