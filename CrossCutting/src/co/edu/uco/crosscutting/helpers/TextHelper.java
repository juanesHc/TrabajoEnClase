package co.edu.uco.crosscutting.helpers;

public class TextHelper {
	
	public static final String EMPTY="";
	
	private TextHelper() {
		
	}
	
	public static boolean isNull(final String string) {
		return ObjectHelper.isNull(string);
	}
	
	public static String getDefault(final String string,final String defaultValue) {
		return ObjectHelper.getDefault(string, defaultValue);
	}
	
	public static String getDefault(final String string) {
		return ObjectHelper.getDefault(string, EMPTY);
	}
	
	public static boolean isEmpty(final String string) {
		return getDefault(string).intern()==EMPTY.intern();
		}
	
	public static void main (String[] args) {
		String a="";
		String b=new String("");
		
		System.out.println(isEmpty(b));
	}

}
