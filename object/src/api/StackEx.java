package api;

import java.util.LinkedList;
import java.util.Queue;

public class StackEx {
    public static void main(String[] args) {
        // Stack 과 Queue
        Stack<Sring> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // stack => push(삽입) / pop(삭제)
        stack.push("0");
        stack.push("1"); // stack.push(item:"1");
        stack.push("2"); // why? string 이 나올까? item 이 나와야 하는데...

        // queue => offer(삽입) / poll(삭제)
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("== stack ==");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println();
        System.out.println("== queue ==");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
