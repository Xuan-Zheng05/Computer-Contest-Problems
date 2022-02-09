import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine();
        HashMap<String, Integer> s = new HashMap();
        int [] score = new int[n];
        String name [] = new String[n];
        
        //name
        for(int i = 0 ;i < n; i++){
            name[i] = input.nextLine();
            s.put(name[i], i);
        }
        
        //score
        for(int i = 0; i<k; i++){
            for(int j = 0; j < n; j++){
                int a = input.nextInt();
                score[j] += a;
            }
        }
        
        //name + score
        for(int i = 0; i< n;i++){
        	s.put(name[i],score[i]);
        }
        
        //printing
        for(int i = 0; i<n; i++){
        	int max = Collections.max(s.values());
            for (Entry<String, Integer> entry : s.entrySet()) {
                if (entry.getValue()==max) {
                	System.out.println(i+3 + ". " +entry.getKey());  
                	s.remove(entry.getKey());
                	break;
                }
            }
        }
        


        
    }
}