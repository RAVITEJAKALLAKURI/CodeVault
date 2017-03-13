import java.util.Properties;


public class SystemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties p=System.getProperties();

p.list(System.out);

//jar -cvf ,-tvf,-xvf
	}

}
