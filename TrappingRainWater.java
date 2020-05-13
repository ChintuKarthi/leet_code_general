// https://leetcode.com/problems/trapping-rain-water/
public int trap(int[] height) {
    int current = 0;
    while(current < height.length && height[current] == 0){
        ++current;
    }
    int volume = 0;
    Stack<Integer> st = new Stack<Integer>();
    while(current < height.length){
        while(!st.empty() && height[current] >= height[st.peek()]){
            int b = st.pop();
            if(st.empty()){
                break;
            }
            volume += ((current - st.peek() -1) * (Math.min(height[current], height[st.peek()]) -height[b]));
        }
        st.push(current);
        ++current;
    }
    return volume;
}
