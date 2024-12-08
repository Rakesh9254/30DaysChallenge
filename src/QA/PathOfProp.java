package QA;

public class PathOfProp {
	public static void main(String[] args) {
		///Users/rakesh/Desktop/Workspace/Days90ChallengeDSA/src/QA
		String pathofproperty=System.getProperty("user.dir");
		System.out.println(pathofproperty);
		
		System.getProperties().list(System.out);
		
	}

}
