package view;

import java.util.Scanner;

import model.Comunicado;
import model.Equipo;

public class viewComunicados {
   private static Controlador controlador = new Controlador();

    public static int menuEquipos() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------Comunicaciones----------------");
            System.out.println("1. Generar comunicado de prensa ");
            System.out.println("2. Editar comunicados ");
            System.out.println("3. Eliminar comunicado ");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    generarComunicado(scanner);
                    break;
                case 2:
                    editarComunicaciones (scanner);
                    break;
                case 3:
                    eliminarComunicado(scanner);
                    break;
                case 4:
                    return 0;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void generarComunicado(Scanner scanner) {
        Comunicado comunicado = new Equipo();

        System.out.println("Ingrese nombre del equipo para hacer el comunicado:");
        comunicado.setNombre(scanner.nextLine());

        System.out.println("Ingrese el encabezado del comunicado:");
        comunicado.setCiudad(scanner.nextLine());

        System.out.println("Ingrese la descripción:");
        comunicado.setEstadio(scanner.nextLine());

        System.out.println("Ingrese el medio de noticas:");
        comunicado.setEntrenador(scanner.nextLine());

        controlador.addEquipo(equipo);
        System.out.println("Equipo creado exitosamente.");
    }

    private static void editarComunicaciones(Scanner scanner) {
        // falta funcion para imprimir la lista de equipo 
        Comunicado comunicado = new Comunicado();
        
        System.out.println("Ingrese el ID del equipo a editar:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        Equipo equipo = controlador.getEquipo(idEquipo);
        if (equipo == null) {
            System.out.println("Equipo no encontrado.");
            return;
        }

        System.out.println("Ingrese el nuevo nombre del equipo (actual: " + equipo.getNombre() + "):");
        equipo.setNombre(scanner.nextLine());

        System.out.println("Ingrese la nueva ciudad (actual: " + equipo.getCiudad() + "):");
        equipo.setCiudad(scanner.nextLine());

        System.out.println("Ingrese el nuevo estadio (actual: " + equipo.getEstadio() + "):");
        equipo.setEstadio(scanner.nextLine());

        System.out.println("Ingrese el nuevo nombre del entrenador (actual: " + equipo.getEntrenador() + "):");
        equipo.setEntrenador(scanner.nextLine());

        System.out.println("Ingrese los nuevos nombres de los jugadores del equipo (actual: " + equipo.getJugadores() + "):");
        equipo.setJugadores(scanner.nextLine());

        controlador.updateEquipo(equipo);
        System.out.println("Equipo actualizado exitosamente.");
    }

    private static void eliminarComunicado(Scanner scanner) {
        System.out.println("Ingrese el ID del equipo a eliminar:");
        int idEquipo = scanner.nextInt();
        scanner.nextLine();

        Equipo equipo = controlador.getEquipo(idEquipo);
        if (equipo == null) {
            System.out.println("Equipo no encontrado.");
            return;
        }

        controlador.deleteEquipo(idEquipo);
        System.out.println("Equipo eliminado exitosamente.");
    }
}
