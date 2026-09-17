public class GestionPedidos {

    // Pila principal: almacena los pedidos activos
    private Pila pilaPrincipal;

    // Pila secundaria: almacena los pedidos deshechos
    private Pila pilaSecundaria;

    // Constructor
    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }


    // Registra una pizza en la pila principal
public void registrarPizza(Pizza pizza) {
    pilaPrincipal.push(pizza);

    // Al registrar una nueva pizza, se limpia la pila de Redo
    while (!pilaSecundaria.isEmpty()) {
        pilaSecundaria.pop();
    }
}

// Deshace el último pedido realizado
public Pizza deshacer() {
    if (pilaPrincipal.isEmpty()) {
        return null;
    }

    Pizza pizza = pilaPrincipal.pop();
    pilaSecundaria.push(pizza);

    return pizza;
}


// Rehace el último pedido deshecho
public Pizza rehacer() {
    if (pilaSecundaria.isEmpty()) {
        return null;
    }

    Pizza pizza = pilaSecundaria.pop();
    pilaPrincipal.push(pizza);

    return pizza;
}


// Muestra el pedido que está actualmente en el tope
    public Pizza mostrarPedidoActual() {
        return pilaPrincipal.peek();
    }
}