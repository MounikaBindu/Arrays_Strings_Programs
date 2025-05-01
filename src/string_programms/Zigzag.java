package string_programms;

public class Zigzag {
	public static void main(String[] args) {
		String s="PAYPALISHIRING";
		int num=4;
		System.out.println(zigzagconvert(s,num));
	}
	public static String zigzagconvert(String s,int num){
		if(num==1 || s.length()<=1) return s;
	    StringBuilder[] str=new StringBuilder[num];
	    char ch[]=s.toCharArray();
	   
	    for(int i=0;i<num;i++) {
	    	str[i]=new StringBuilder();
	    } 	
	    	
	    int currentrow=0;
		boolean godown=false;
	    
	    for(char c:ch){
	    	str[currentrow].append(c);
	    	
	    	if(currentrow==0 || currentrow==num-1) {
	    		godown=!godown;
	    	}
	        
	        currentrow+=godown?1:-1;
	        
	        
	    }
	   
	  
	    StringBuilder st=new StringBuilder();
	    for(StringBuilder i:str) {
	    	st.append(i);
	    	
	    }
	    
	    return st.toString();
	    
	}  

}

//output

//PAHNAPLSIIGYIR

