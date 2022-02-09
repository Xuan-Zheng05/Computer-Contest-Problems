import java.util.*;
public class ccc12s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int arabic []= new int [a.length()/2]; 
		int roman [] = new int [a.length()/2];
		int result[]=new int[a.length()/2];
		int acount=0;
		int rcount=0;
		for(int i=0;i<a.length();i=i+2){
			char c = a.charAt(i);
			arabic[acount]= c-'0';
			acount++;
		}
		for(int i=1;i<a.length();i+=2){
			if(a.charAt(i)=='I')roman[rcount]=1;
			if(a.charAt(i)=='V')roman[rcount]=5;
			if(a.charAt(i)=='X')roman[rcount]=10;
			if(a.charAt(i)=='L')roman[rcount]=50;
			if(a.charAt(i)=='C')roman[rcount]=100;
			if(a.charAt(i)=='D')roman[rcount]=500;
			if(a.charAt(i)=='M')roman[rcount]=1000;
			rcount++;
		}
		for(int i=0;i<arabic.length;i++)	result[i]= arabic[i]*roman[i];
		
		for(int i=0;i<arabic.length-1;i++){
			if(roman[i]<roman[i+1]) result[i]=result[i]*-1;
		}
		int total=0;
		for(int i=0;i<arabic.length;i++) total=total+result[i];
		System.out.print(total);
	}

}