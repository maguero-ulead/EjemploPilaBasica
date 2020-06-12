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
    }
}
