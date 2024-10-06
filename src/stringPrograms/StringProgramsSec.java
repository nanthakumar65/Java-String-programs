package stringPrograms;

public class StringProgramsSec {

	public static void main(String[] args) {
		
		//1
		//Input: s = "Hello World"
		//Output: 5
		//Explanation: The last word is "World" with length 5.
		
		/**String s = "Hello World";
		int count=0;
		for(int i=s.length()-1;i>0;i--) {
			if(s.charAt(i)==' ') {
				break;
			}else {
				count++;
			}
		}
		System.out.println(count);**/
		
		
		//2
		//Given a string s, return the number of segments in the string.
		//Input: s = "Hello, my name is John"
		//Output: 5
		//Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
		//A segment is defined to be a contiguous sequence of non-space characters.
		
		/**String s = "Hello, my name is John";
		if(s.trim().length() ==0 || s ==null) {
			//return 0;
		}else {
			String[] k = s.trim().split("\\s+");
			//return k.length;
		}**/
		
		//3
		//Input: s = "Hello"
		//Output: "hello"
		//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
		
		/**String s = "#";
		System.out.println(s.toLowerCase());**/
		
		//4.
		//Input: sentence = "I speak Goat Latin"
		//Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
		
		/**String sentence = "I speak Goat Latin";
		String[] k = sentence.split("\\s+");
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < k.length; i++) {

			String m = k[i];
			for (int j = 0; j < m.length(); j++) {
				if (j == 0) {
					if (m.charAt(j) == 'a' || m.charAt(j) == 'e' || m.charAt(j) == 'i' || m.charAt(j) == 'o'
							|| m.charAt(j) == 'u' || m.charAt(j) == 'A' || m.charAt(j) == 'E' || m.charAt(j) == 'I'
							|| m.charAt(j) == 'O' || m.charAt(j) == 'U') {
						strBuild.append(m).append("ma");
					} else {
						
					}
				}
			}
		}
		System.out.println(strBuild.toString());**/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
