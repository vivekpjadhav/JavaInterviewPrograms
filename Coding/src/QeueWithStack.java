import java.util.ArrayDeque;
import java.util.Deque;

public class QeueWithStack {
    private final int MAX_Size = 2;
    private Deque<Integer> stackOne;
    private Deque<Integer> stackTwo;

    public QeueWithStack() {
        this.stackOne = new ArrayDeque<>(MAX_Size);
        this.stackTwo = new ArrayDeque<>(MAX_Size);
    }

    public static void main(String[] args) {
        QeueWithStack stack = new QeueWithStack();
        stack.enqueue(1);
        stack.enqueue(13);
        stack.enqueue(21);
        stack.enqueue(12);
        stack.enqueue(12);

        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());

    }

    public void enqueue(int value) {

        if (stackOne.size() != MAX_Size) {
            stackOne.push(value);
        } else if (stackOne.size() == MAX_Size && stackTwo.size() != MAX_Size) {
            while (stackTwo.size() != MAX_Size) {
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(value);

        } else {
            System.out.println("queue if full ");
            return;
        }


    }

    public int dequeue() {

        if (!stackTwo.isEmpty()) {
            return stackTwo.pop();
        } else if (stackTwo.isEmpty() && !stackOne.isEmpty()) {
            while (stackOne.size() != 0) {
                stackTwo.push(stackOne.pop());
            }


            return stackTwo.pop();
        } else {
            return 0;
        }

    }

}
