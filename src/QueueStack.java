import java.util.Stack;

public class QueueStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.add("Darshan");
        stack.push("Shiva");
        stack.push("Ramesh");
        stack.add("Raj");
        System.out.println(stack);
        stack.get(1);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("Raj"));
        System.out.println(stack.contains("raj"));
        System.out.println(stack.size());
        System.out.println(stack.remove(1));
        System.out.println(stack);

    }
}
