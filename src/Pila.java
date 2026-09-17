public class Pila {

    // Nodo que estará en la parte superior de la pila
    private Nodo tope;

    // Constructor de la pila
    public Pila() {
        tope = null;
    }

    // Inserta una pizza en el tope de la pila
public void push(Pizza pizza) {
    Nodo nuevoNodo = new Nodo(pizza);
    nuevoNodo.siguiente = tope;
    tope = nuevoNodo;
}

// Retira y devuelve la pizza que está en el tope
public Pizza pop() {
    if (tope == null) {
        return null;
    }

    Pizza pizza = tope.pizza;
    tope = tope.siguiente;

    return pizza;
}


// Devuelve la pizza que está en el tope sin eliminarla
public Pizza peek() {
    if (tope == null) {
        return null;
    }

    return tope.pizza;
}


// Verifica si la pila está vacía
public boolean isEmpty() {
    return tope == null;
}
}
