public class OuterClass {  
  
 public String pub = "Outer - public";  
  
 class InnerClass {  
  public String pub = "Inner - public";  
  
  void printMe() {  
  
   // i am calling local vaiable  
   System.out.println(pub);  
  
   // i am calling outer class variable  
   System.out.println(OuterClass.this.pub);  
  }  
  
  
 }  
 
 OuterClass.InnerClass oin =new OuterClass().new InnerClass();
 
  
}  