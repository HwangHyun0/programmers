class Solution {
    public String solution(String polynomial) {
        String answer = "";      
        String[] words = polynomial.split(" ");
        String wd = "";
        String or = "";
        int a = 0;
        int b = 0;
        
        for(String word : words){
            wd = word.substring(word.length() - 1);
            
            if(wd.equals("x")){
               or = word.length() > 1 ? word.substring(0, word.length() - 1) : "1";
               a = a +  Integer.parseInt(or);
            }else if(!word.equals("+")){
                b = b + Integer.parseInt(word);
            }                       
        }
        
        if(a != 0){   
         answer = a == 1 ? "x" : a + "x";  
        }
        if(a != 0 && b != 0){
            answer = answer + " + ";    
        }
        if( b != 0){
            answer = answer + b;    
        }
        
        
        return answer;
    }
}