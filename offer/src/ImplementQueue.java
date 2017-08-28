import java.util.Stack;

/**
 * Created by didi on 17/8/27.
 * 剑指offer 用两个栈实现队列
 *
 */
public class ImplementQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //stack1用来存放进栈的元素
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        if(!stack1.isEmpty() && stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        int popNode = stack2.pop();
        if(stack1.isEmpty() && !stack2.isEmpty()){
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        return popNode;
    }
}
