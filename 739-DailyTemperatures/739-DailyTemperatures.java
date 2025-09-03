// Last updated: 03/09/2025, 10:07:33
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack=new Stack<>();
       int[] result=new int[temperatures.length];
       for(int i=0;i<temperatures.length;i++){
        while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
            int ind=stack.pop();
            result[ind]=i-ind;
        }
        stack.push(i);
       }
       return result;
    }
}
