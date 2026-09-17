public class Pizza {

    // Nombre de la pizza
    private String nombre;

    // Arreglo fijo de 3 ingredientes
    private String[] ingredientes;

    // Constructor de la clase Pizza
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    // Permite obtener el nombre de la pizza
    public String getNombre() {
        return nombre;
    }

    // Permite obtener los ingredientes
    public String[] getIngredientes() {
        return ingredientes;
    }

    // Muestra la información de la pizza
    @Override
    public String toString() {
        return "Pizza: " + nombre
                + "\nIngrediente 1: " + ingredientes[0]
                + "\nIngrediente 2: " + ingredientes[1]
                + "\nIngrediente 3: " + ingredientes[2];
    }
}