import java.util.List;


public class SpecialCasesofFinally {

 String s;
 private List<String> answers; 

public static void main(String[] args) throws Exception
{
	
SpecialCasesofFinally s=new SpecialCasesofFinally();
s.s.equals("");
	System.out.println(m1()+s.s);

}

private static int m1() throws Exception {
	try
	{
		
	int j=10/0;
	return 10;
	}
	catch(Exception e)
	{
		throw new Exception(e);
		//return 20;
		}

	finally
	{
		return 30;
		
		}

	}

public List<String> getAnswers() {
	return answers;
}

public void setAnswers(List<String> answers) {
	this.answers = answers;
}
}



