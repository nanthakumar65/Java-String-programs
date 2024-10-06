package stringPrograms;

public class StringPro {

	public static void main(String[] args) {
		
		//1
		/*
		 * String value ="welcome to my program"; int count =0; for(int
		 * i=0;i<value.length();i++) { if(value.charAt(i) !=' ') { count++; } }
		 * System.out.println(count);
		 */
		
		//2
		/*
		 * String value ="welcome to my program"; int vovCount =0; int consCount =0;
		 * for(int i=0;i<value.length();i++) {
		 * 
		 * if(value.charAt(i) == 'a' ||value.charAt(i) == 'e' ||value.charAt(i) == 'i'
		 * ||value.charAt(i) == 'o' ||value.charAt(i) == 'u' ) { vovCount++;
		 * 
		 * } else { consCount++; } }
		 * 
		 * System.out.println("vowels count in a string -----> "+ vovCount);
		 * System.out.println("consonants count in a string -----> "+consCount);
		 */
		
		//3
		/*
		 * String str1 ="brag"; String str2 ="garb";
		 * 
		 * if(str1.length() == str2.length()) {
		 * 
		 * for(int i=0;i<str1.length();i++) {
		 * 
		 * if(str1.charAt(i) == str2.charAt(str2.length()-i-1)){
		 * 
		 * }else { System.out.println("this is not anagram"); } } }else {
		 * System.out.println("this is not anagram"); }
		 */
		
		//4
		/*
		 * String value ="aaaaabbbbccccdddd";
		 * 
		 * for(int i=1;i<value.length();i++) {
		 * 
		 * char s = value.charAt(i-1); if(s == value.charAt(i)) { System.out.print(s);
		 * }else { System.out.println(); }
		 * 
		 * }
		 */
		
		//5
		//Reverse string without reverse function()
		
		/**String value ="abcdefghijk";
		String result="";
		for(int i=value.length()-1;i>=0;i--) {
			char charResult = value.charAt(i);
			result =result+ charResult;
			
		}
		System.out.println(result);**/
		
		//Reverse string with reverse function()
		/**String value ="abcdefghijk";
		StringBuilder strBuilder = new StringBuilder(value);
		String reverse = strBuilder.reverse().toString();
		System.out.println(reverse);**/
		
		//7
		/**String s = "the sky is blue";
		String[] m = s.trim().split("\\s+");
		StringBuilder strBuilder = new StringBuilder();
		for (int i = m.length - 1; i >= 0; i--) {
			strBuilder.append(m[i]);
			if(i !=0) {
				strBuilder.append(" ");
			}
		}
		System.out.println(strBuilder.toString());**/
		
		//8
		/**String  s = "Hello hhWorld";
		int count=0;
		String m = s.trim();
		for(int i=m.length()-1;i>=0;i--) {
			
			if(m.charAt(i) ==' ') {
				
				break;
			}
			else {
				count++;
			}
		}
		System.out.println(count);**/
		
		//9
		//Input: s = ["h","e","l","l","o"]
		//Output: ["o","l","l","e","h"]
		/**char[] s= {'h','e','l','l','o'};
		int n = s.length;
        for(int i=0; i<n/2; i++)
        {
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }**/
		
		
		//10
		/**String date= "2080-02-29";
		
		String[] s = date.split("-");
		int year = Integer.parseInt(s[0]);
		int month = Integer.parseInt(s[1]);
		int day = Integer.parseInt(s[2]);
		String yearBinary = Integer.toBinaryString(year);
		String monthBinary = Integer.toBinaryString(month);
		String dayBinary = Integer.toBinaryString(day);
		yearBinary+"-"+monthBinary+"-"+dayBinary;**/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
