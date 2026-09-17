public class Nodo {

    // Pizza almacenada en este nodo
    Pizza pizza;

    // Referencia al siguiente nodo
    Nodo siguiente;

    // Constructor del nodo
    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguiente = null;
    }
}
