package cr.ac.ulead;

public class Queue {
    int[] data = new int[100];
    int head = 0;
    int tail = 0;

    public void enqueue(int newValue){
        this.data[this.tail] = newValue;
        this.tail++;
    }

    public int dequeue() {
        return this.data[head++];
    }


}
