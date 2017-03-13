public class LineUp {
 public static void main(String[] args) {
 double d = 12.34512;
 // insert code here

 
// System.out.printf("|%7d| \n", d);
 System.out.printf("|%7f| \n", d);
 //System.out.printf("|%3.7d| \n", d);
 System.out.printf("|%3.7f| \n", d);
// System.out.printf("|%7.3d| \n", d);
 System.out.printf("|%7.3f| \n", d);
 
  boolean b2,b1=true;
//boolean b1;
if ((b2 = true) && b1 )
{
	System.out.println("m");
go();
}
 }

 public static void go() {

	 String o = "";

	 z:

	 for(int x = 0; x < 3; x++) {

	 for(int y = 0; y < 2; y++) {

	 if(x==1) break;

	 if(x==2 && y==1) break z;

	 o = o + x + y;

	 }

	 }

	 System.out.println(o);

	 

int a=1;
int b=0;
//int c=a/b;
try{int c=a;}

finally{
	
	System.out.println("ab");
}

Float pi = new Float(3.14f);
try
{
if (pi > 3) {

 System.out.print("pi is bigger than 3. ");

}

else {

 System.out.print("pi is not bigger than 3. ");

}
}
finally {

 System.out.println("Have a nice day.");

}
}

}
