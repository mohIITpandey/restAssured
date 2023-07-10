package Mock;

import java.util.LinkedHashSet;

public class pracrice {
public static void main(String[] args) {
	String s="mnbvcxzasdfghjklpoiuytrewqdfghjkjhgfx";
	char[]ch=s.toCharArray();
	if(s.length()<26) {
		System.out.println("it is not panagram");}
		else {
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(Character ch1:ch) {
		set.add(ch1);
	}
			int []s1=new int[26];
			for(int i=0;i<s1.length;i++) {
				for(Character ch2:set) {
				int count=0;
				for(int j=0;j<s.length();j++) {
					if(s.charAt(j)==ch2) {
						count++;
					}
				}
				s1[i]=count;
			}
	        if(s1[i]==0) {
	        	System.out.println("it is not panagram");
	        	break;
	        }
			}
			for(int i=0;i<s1.length;i++) {
				if(s1[i]>0) {
					continue;
				}else {
					System.out.println("it is not panagram");
					break;
				}}
			if(s1[s1.length-1]>0) {
				System.out.println("it is a panagram number");
			}
			
			
			
		}
		
		}
	}

