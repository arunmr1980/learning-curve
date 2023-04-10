import java.util.regex.Pattern;

class StringReplacer{

	public static String searchAndReplace(String input, String searchString, String replaceString){
		System.out.println("#--------");
		System.out.println("Input String : '" + input + "'");
		System.out.println("Search String : '" + searchString + "'");
		System.out.println("Replace String : '" + replaceString + "'");
		String output = input.replaceAll(searchString,replaceString);
		System.out.println("Output : '" + output + "'");
		return output;
	}

	public static String replaceForUrl(String input){
		System.out.println("#--------");
		System.out.println("Input URL : '" + input + "'");
		String[] parts = input.split("/");
		StringBuilder sb = new StringBuilder();
		for(String part: parts){
			if(part.trim().length() > 0 ){
				sb.append("/");
				sb.append(searchAndReplace(part,"\\{.*\\}",".*"));
		        	System.out.println("sb -- '" + sb.toString() + "'");
			}
		}
		System.out.println("Cleaned url path : '" + sb.toString() + "'");
                return sb.toString();		
	}

	public static void main(String[] args){
		String input = "twinkle twinkle little star";
		String searchString = "twinkle";
		String replaceString = "yellow";
		StringReplacer.searchAndReplace(input, searchString, replaceString);

		input = "/person/{person_key}";
		StringReplacer.replaceForUrl(input);

		input = "/person/{person_key}/address/{address_key}";
		StringReplacer.replaceForUrl(input);
	}
}
