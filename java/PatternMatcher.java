import java.util.regex.Pattern;

class PatternMatcher{

	public static boolean isMatch(String pattern, String testString){
		System.out.println("#--------");
		System.out.println("Does pattern : " + pattern + " matches string : " + testString);
		boolean b = Pattern.matches(pattern, testString);
		System.out.println(b);
		return b;
	}

	public static void main(String[] args){
		String pattern = "/CUSTOMER/\\d*/FILES";
		String testString = "/CUSTOMER/7765/FILES";
		PatternMatcher.isMatch(pattern, testString);
		
		pattern = "/person/.*/name";
		testString = "/person/3/name";
		PatternMatcher.isMatch(pattern, testString);
	}
}
