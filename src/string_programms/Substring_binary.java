package string_programms;

public class Substring_binary {
	public static void main(String[] args) {
		String s="11001100111";
		System.out.println(subString(s));
	}
	public static int subString(String s) {
	    int left = 0, count = 0, ans = 0, start = 0, end = 0;
	    for (int right = 0; right < s.length(); right++) {
	        if (s.charAt(right) == '0') count++;

	        while (count > 1) {
	            if (s.charAt(left) == '0') count--;
	            left++;
	        }

	        if (right - left + 1 > ans) {
	            ans = right - left + 1;
	            start = left;
	            end = right;
	        }
	    }

	    for (int i = start; i <= end; i++) {
	        System.out.print(s.charAt(i));
	    }
	    System.out.println();

	    return ans;
	}


}
