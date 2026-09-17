import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestionPedidos gestion = new GestionPedidos();

         System.out.println("PIZZA-TRACK");


        int opcion;

        do {
            System.out.println("\n===== PIZZA-TRACK =====");
            System.out.println("1. Registrar Pedido");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();


switch (opcion) {
                case 1:
                    System.out.print("Nombre de la pizza: ");
                    String nombre = scanner.nextLine();

                    String[] ingredientes = new String[3];

                    System.out.print("Ingrediente 1: ");
                    ingredientes[0] = scanner.nextLine();

                    System.out.print("Ingrediente 2: ");
                    ingredientes[1] = scanner.nextLine();

                    System.out.print("Ingrediente 3: ");
                    ingredientes[2] = scanner.nextLine();

                    Pizza pizza = new Pizza(nombre, ingredientes);
                    gestion.registrarPizza(pizza);

                    System.out.println("Pedido registrado correctamente.");
                    break;


                    case 2:
                    Pizza deshecha = gestion.deshacer();

                    if (deshecha != null) {
                        System.out.println("Pedido deshecho:");
                        System.out.println(deshecha);
                    } else {
                        System.out.println("No hay pedidos para deshacer.");
                    }
                    break;



                    case 3:
                    Pizza rehecha = gestion.rehacer();

                    if (rehecha != null) {
                        System.out.println("Pedido rehecho:");
                        System.out.println(rehecha);
                    } else {
                        System.out.println("No hay pedidos para rehacer.");
                    }
                    break;



                    case 4:
                    Pizza actual = gestion.mostrarPedidoActual();

                    if (actual != null) {
                        System.out.println("Pedido actual:");
                        System.out.println(actual);
                    } else {
                        System.out.println("No hay pedidos registrados.");
                    }
                    break;


                    case 0:
                    System.out.println("Saliendo de Pizza-Track...");
                    break;
            }
        

            



        } while (opcion != 0);

        scanner.close();


       

    }
}