import java.util.ArrayList;

/**
 * Created by didi on 17/8/27.
 *
 * 剑指offer 从头到尾打印链表
 */
public class PrintList {


     public static class ListNode {
             int val;
             ListNode next = null;
             ListNode(int val) {
                this.val = val;
            }
        }



    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode == null){
            return ret;
        }
        if(listNode.next == null){
            ret.add(listNode.val);
            return ret;
        }
        //逆转链表
        ListNode head = listNode.next;
        ListNode pNode = listNode;
        ListNode nNode = head;
        while(head != null){
            nNode = head.next;
            head.next = pNode;
            pNode = head;
            head = nNode;
        }
        //打印链表
        head = pNode;
        while(head != listNode){
            ret.add(head.val);
            head = head.next;
        }
        ret.add(listNode.val);
        return ret;
    }

    public static void main(String[] args){
        PrintList pl = new PrintList();
        ListNode listNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        listNode.next = secondNode;
        secondNode.next = thirdNode;
        ArrayList<Integer> ret = pl.printListFromTailToHead(listNode);
        for(int i : ret){
            System.out.println(i);
        }
    }
}
