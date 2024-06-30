package view;

public class viewEntrenador {
    public static int menuEquipos() {
        System.out.println("---------------- Equipos ----------------------");
        System.out.println("1. Registrar Equipos");
        System.out.println("2. Editar Equipos");
        System.out.println("3. Eliminar Equipos");
        System.out.println("4. Salir");

        int opcion = variables.verificarOpcion("Opción: ", 1, 4);
        return opcion;
    }
}
