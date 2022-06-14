import java.util.regex.Pattern;

class PatternMatcher{

	public static void main(String[] args){
		System.out.println("Hello world");
		String pattern = "/CUSTOMER/\\d*/FILES";
		String testString = "/CUSTOMER/7765/FILES";
		System.out.println("Does pattern : " + pattern + " matches string : " + testString);
		System.out.println(Pattern.matches(pattern, testString));
	}
}
