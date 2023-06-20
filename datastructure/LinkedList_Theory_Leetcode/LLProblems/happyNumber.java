package LinkedList_Theory_Leetcode.LLProblems;

//https://leetcode.com/problems/happy-number/description/
//https://leetcode.com/problems/happy-number/solutions/3569817/java-solution-explained-easy-beat-9772-in-space-and-8992-in-time-complexity/

public class happyNumber {

    ListNode head;
    ListNode tail;

    private class ListNode {
        int val;
        ListNode next;
        public ListNode(int value){
            this.val = value;
        }
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) return true;

        return false;
    }

    private int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num = num/10;
        }
        return ans;
    }
}
