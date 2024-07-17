package string;

 
	class Solution:
	    def isPalindrome(self, s: str) -> bool:
	         
	        int i = 0;
	        int j = str.length();
	        boolean flg = true;
	        while(i<j){
	            if(str.charAt(i)==str.charAt(j)){
	                 return false;
	            }
	               i++;
	                j--;
	            }
	            return true;
	        }
	        
	        Solution s = new Solution();
	         System.out.println(p.isPalindrom("racecar"));


