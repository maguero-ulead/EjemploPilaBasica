package cr.ac.ulead;

public class Stack {

    int[] data;
    int top = 0;

    public Stack (int tamanno) {
         data = new int[tamanno];

    }

    public boolean isEmpty() {
        if (this.top == 0){
            return true;
        }
        return false;
    }

    public void push(int newValue) {
        data[top] = newValue;
        top++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Esta vacia! no joda");
        } else {
            top = top-1;
            return data[top];
        }
    }

}
