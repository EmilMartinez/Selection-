package Operator;

public class UseString {

	public static void main(String[] args) {
		String st = "We are great students";
				
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.length());
		System.out.println(st.compareTo(st));
		System.out.println(st.offsetByCodePoints(0, 0));
		System.out.println(st.codePoints());
		System.out.println(st.offsetByCodePoints(0, 10));
		System.out.println(st.startsWith("We"));
		System.out.println(st.subSequence(0,17));
		System.out.println(st.substring(0,21));
		System.out.println(st.concat(st));
		System.out.println(st.intern());
		System.out.println(st.replaceFirst("We", "they"));
		System.out.println(st.equalsIgnoreCase(null));
		System.out.println(st.lastIndexOf(0, 20));
		System.out.println(st.contentEquals(null));
		System.out.println(st.replaceFirst(st, "students"));
		System.out.println(st.substring(0));
		System.out.println(st.split(null, 0));
		System.out.println(st.format(null, args));
		System.out.println(st.copyValueOf(null));
		System.out.println(st.trim());
		System.out.println(st.chars());
		System.out.println(st.valueOf(0));
		System.out.println(st.regionMatches(true, 0, null, 0, 0));
		System.out.println(st.hashCode());
		System.out.println(st.subSequence(0, 6));
		System.out.println(st.concat(st));
		System.out.println(st.lastIndexOf(0, 10));
	
		
		
	
	
	
	}

}
