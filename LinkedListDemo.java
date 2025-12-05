import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> queue=new LinkedList<>();
        queue.add(23);
        queue.add(15);
        queue.add(17);

        System.out.println("Queue"+queue);
        System.out.println("Dequeue : "+queue.poll());
        System.out.println("Poll First : "+queue.pollFirst());
        System.out.println("Poll Last: "+queue.pollLast());



    }
}
