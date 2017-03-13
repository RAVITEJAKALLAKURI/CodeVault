
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculator {
    static ArrayList<Integer> it = new ArrayList<Integer>();
    static String fin;
    static String s="";
    public static void main(String[] args) {
       
        String firstName = JOptionPane.showInputDialog("Enter your name " );
        String secondName = JOptionPane.showInputDialog("Enter your Partner name " );
        int num;
        Other o = new Other();
        String sen = firstName + "loves" + secondName;
        String sent = sen.toUpperCase();
     
        char[] ch = sent.toCharArray();
        for(int i=0 ; i<sent.length(); i++){
            num=1;
            char chr = sent.charAt(i);
            
            if(o.check(chr)){
            }
            else{
                o.put(chr);
               
                for(int j=i+1 ; j<sent.length();j++){
                    if(chr==ch[j])
                        num+=1;
                }
                it.add(num);
            }
        }
        cal();
        display();
        int n = Integer.parseInt(s);
        if(n>100)
            n=100;
        JOptionPane.showMessageDialog(null, firstName.toUpperCase() + " LOVES TO " + secondName.toUpperCase() + " "+ n + "%", "Love Percentage", 1);
    }
    public static void display(){
       
            for(int i :it){
                s += i;
            }
           
           
    }
    public static void cal(){
        int j;
        j=it.size();
       for(int k=0;it.size()>2;k++){
        for(int i=0;i<(j-1);i++){
            int sum = it.get(i) + it.get(j-1);
            it.remove(j-1);
            it.remove(i);
            it.add(i, sum);
           
           j=it.size();
        }
       
       }
       
    }
   
}

class Other {
	   
    ArrayList<Character> ch = new ArrayList<Character>();
   
    public boolean check(char c){
        for(int i=0;i<ch.size();i++){
            if(c==ch.get(i))
                return true;
        }
        return false;
    }
   
    public void put(char c){
        ch.add(c);
       
    }
   
}
