
public class UC1 {
	
	public static char[] BoardCreating () {
		char[] x = new char[10];
      
        for (int i = 0; i < x.length; i++) {
        	x[i] = ' ' ;
        
        }      
		return x;
	}

	public static void main(String[] args) {
		BoardCreating();        
	

}
}