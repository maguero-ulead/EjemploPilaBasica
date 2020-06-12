package cr.ac.ulead;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack miPila = new Stack(5);
        miPila.push(5);
        miPila.push(10);
        miPila.push(32);
        System.out.println(miPila.pop());
        System.out.println(miPila.pop());
        System.out.println(miPila.pop());

        Queue miCola = new Queue();
        miCola.enqueue(5);
        miCola.enqueue(1);
        miCola.enqueue(23);
        miCola.enqueue(15);
        System.out.println(miCola.dequeue());
        System.out.println(miCola.dequeue());
        System.out.println(miCola.dequeue());
        System.out.println(miCola.dequeue());

    }
}
