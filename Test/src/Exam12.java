import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam12 {
	public static List<Integer> al=new ArrayList<Integer>();
        public static void main(String args[])
        {    
             int a = 1;
             int b = 2;
             int c;
             int d;
             c = ++b;
             d = a++;
             c++;
             b++;
             ++a;
             System.out.println(a + " " + b + " " + c);
             
             int g = 3;
             System.out.print(++g * 8); 
        
             String s1 = "HelloWorld";
             String s2 = s1.substring(1 , 4);
             System.out.println(s2); 
             
            
              
              String[] words={"encouragement","eye","obsolete","berserk","devour","license","library","customer","susus","penalty","bicycle","malayalam","radar","precipice"};
              System.out.println(GetValidPalindromes(Arrays.asList(words)));
        
        }
        
        private static List<String> GetValidPalindromes(List<String> words)
        {
          String input;
          List<String> ouput=new ArrayList<String>();
          for (int i=0;i<words.size();i++)
          {
          input=words.get(i);
            
            if(isPalindrome(input))
              ouput.add(input);
             
          }
          	/*int min;
          String temp;
        		for(int i=0;i<ouput.size()-1;i++)
        		{
        			
        			min=i;
        			for(int j=0;j<ouput.size()-1-i;j++)
        			{
        				if(ouput.get(j).compareTo(ouput.get(j+1))>0)
        				{
        				temp=ouput.get(j);
        				
        				ouput.add(j,ouput.get(j+1));
        				ouput.add(j+1,temp);
        				}
        			}
        			
        		}*/
          
          
          	String min;
        		for(int i=1;i<ouput.size();i++)
        		{
        			
        			min=ouput.get(i);
        			int j;
        			for(j=i-1;j>=0 && (min.compareTo(ouput.get(j))<0);j--)
        			{
        				//a[j+1]=a[j];
        				ouput.remove(j+1);
                  ouput.add(j+1,ouput.get(j));
                  
        			}
        			ouput.remove(j+1);
        			ouput.add(j+1,min);
        			
        		}
          
          return ouput;
        }

        private static boolean isPalindrome(String input)
        {
         String orig=input;
          for(int i=0;i<orig.length()/2;i++)
          {
          if(input.charAt(i)!=input.charAt(input.length()-1-i))
            return false;
          
          }
          
          

        return true;
        }
    } 