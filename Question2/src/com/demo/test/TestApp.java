package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestApp {
	
	public static void writeFile(List<String> l) {
		File f = new File("data.txt");
		if(f.exists()) {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));) {
				for(String s: l) {
					bw.write(s+"\n");
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void readFile() {
		File f = new File("data.txt");
		if(f.exists()) {
			try(BufferedReader br = new BufferedReader(new FileReader("data.txt"));){
				String l = br.readLine();
				while(l != null) {
					List<String> lst = new ArrayList<String>();
					lst.add(l);
					l = br.readLine();
				}
			}catch(IOException e) {
				System.out.println("file is empty");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> s = new ArrayList<>();
		System.out.println("Enter no. of strings");
		int m = sc.nextInt();
		System.out.println("Enter the strings");
		for(int i =0; i<m; i++) {
			String s1 = sc.next();
			s.add(s1);
		}
		System.out.println("String with length > 5");
		List<String> list2 = s.stream().filter((str) -> str.length() > 5).collect(Collectors.toList());
		if(list2 != null) {
			list2.stream().forEach(System.out::println);			
		} else {
			System.out.println("no string found");
		}
		writeFile(list2);
		sc.close();
		
	}

}
