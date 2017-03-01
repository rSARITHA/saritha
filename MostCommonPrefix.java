public class MostCommonPrefix {
	public void longestCommonPrefix(String[] strs) {
	    if(strs==null || strs.length==0){
	        System.out.println("");
	    }
	 
	    if(strs.length==1) 
	    	System.out.println(strs[0]);
	 
	    int minLen = strs.length+1;
	 
	    for(String str: strs){
	        if(minLen > str.length()){
	            minLen = str.length();
	        }
	    }
	 
	    for(int i=0; i<minLen; i++){
	        for(int j=0; j<strs.length-1; j++){
	            String s1 = strs[j];
	            String s2 = strs[j+1];
	            if(s1.charAt(i)!=s2.charAt(i)){
	             	System.out.println(s1.substring(0, i));
	            }
	        }
	    }
	 
	    System.out.println(strs[0].substring(0,minLen));

}

	public static void main(String[] args) {
		String str[]={"saaaarai","saaaaritha","saaaandy"};
		MostCommonPrefix m=new MostCommonPrefix();
		m.longestCommonPrefix(str);
		
	}
}
