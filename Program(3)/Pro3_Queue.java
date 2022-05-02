public class Pro3_Queue {
    public static void main(String[] args){
        Queue q = new Queue();
        for(int i = 1; i <= 20; i++){
            q.enqueue(i);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Test Queue =>");
        while (q.getSize() > 0) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println("\n--------------------------------------------------------");
    }
}
