package Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GHg {
public static void main(String[] args) {
	String s="qwertyuiopasdfghjklzxcvbnmytr 3212@ewq";
	char[] ch=s.toCharArray();
	List l=new ArrayList();
	for(int i:ch) {
		l.add(i);
	}
	Set set=new HashSet(l);
	if(set.size()==26) {
		System.out.println("panagram");
	}
		else {
			System.out.println("not panagram");
		}
	
	
}
}
