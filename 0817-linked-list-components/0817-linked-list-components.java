class Solution {
public int numComponents(ListNode head, int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<nums.length; i++){
        set.add(nums[i]);
    }
    
    int size = 0;
    while(head != null){
        if(set.contains(head.val)){
            size++;
            while(head.next != null && set.contains(head.next.val)){
                head = head.next;
            }
        }
        head = head.next;
    }
    
    return size;
}
}