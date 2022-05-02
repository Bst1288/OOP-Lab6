public class Queue {
    private int[] elements;
    private int size;
    public static final int defaultCapacity = 8;

    Queue(){
        elements = new int[defaultCapacity];
    }

    //add v
    void enqueue(int v){
        if(size >= elements.length){
            int[] t = new int[elements.length*2];
            System.arraycopy(elements, 0, t, 0, elements.length);
            elements = t;
        }
        elements[size++] = v;
    }

    //remove and return the elements
    int dequeue(){
        int v = elements[0];
        int[] t = new int[elements.length];
        System.arraycopy(elements, 1, t, 0, size);
        elements = t;
		size--;
		return v;
    }

    int getSize(){
        return size;
    }

    //if queue empty
    boolean empty(){
        return size == 0;
    }
}
