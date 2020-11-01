package replit;

public class Polindrome {

	
		public static boolean isPolindrome(String str) {
			if(str==null)
				return false;
			StringBuilder sb = new StringBuilder(str);
			
			return sb.reverse().toString().equals(str);
		}
		
	}

