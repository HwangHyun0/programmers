
class Solution {
    public int solution(String A, String B) {
        //참고 풀이  
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }
}