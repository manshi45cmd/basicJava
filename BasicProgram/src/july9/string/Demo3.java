package july9.string;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	
		String s = "sachin";
		for(int i = 0;i<=5;i++) {
			s= s + i;
			//System.out.println(s);
		} System.out.println(s);
		
		String ss = "ramesh";
		System.out.println(ss);
		System.out.println(ss.charAt(2));
		System.out.println("lenth of string"+ ss.lastIndexOf(ss));
		
		char aa[] = ss.toCharArray();
		for(char pp : aa) {
			System.out.println(pp);
			
			
			String bb = "ramlal";
			
			for(int i = 0;i<bb.length() ; i++) {
				String t = " ";
				for(int j = i;j<bb.length();j++) {
					t= t + bb.charAt(j);
					System.out.println(t);
					
				}
			}
		}
	}

}
