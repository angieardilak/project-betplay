package view;

public class viewAdministrador {
    package com.betplay;

    public class Submenus {
        public static int menuEquipos() {
            System.out.println("---------------- Equipos ----------------------");
            System.out.println("1. Registrar Equipos");
            System.out.println("2. Editar Equipos");
            System.out.println("3. Eliminar Equipos");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    
        public static int menuJugadores() {
            System.out.println("---------------- Jugadores ----------------------");
            System.out.println("1. Registrar Jugadores");
            System.out.println("2. Editar Jugadores");
            System.out.println("3. Eliminar Jugadores");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    
        public static int menuPartidos() {
            System.out.println("---------------- Partidos ----------------------");
            System.out.println("1. Programar partidos");
            System.out.println("2. Registrar resultados partidos");
            System.out.println("3. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 3);
            return opcion;
        }
    
        public static int menuLesionesRendimiento() {
            System.out.println("---------------- Lesiones & Rendimiento ----------------------");
    
            System.out.println("1. Registar lesiones");
            System.out.println("2. Seguimiento de rendimiento");
            System.out.println("3. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 3);
            return opcion;
        }
    
        public static int menuLesiones() {
            System.out.println("----------------Lesiones----------------");
            System.out.println("1. Crear lesiones");
            System.out.println("2. Editar lesiones");
            System.out.println("3. Eliminar lesiones");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    
        public static int menuEntrenamientos() {
            System.out.println("----------------Entrenamientos----------------");
            System.out.println("1. Registar sesiones de entrenamiento");
            System.out.println("2. Gestión de nombramientos para partidos");
            System.out.println("3. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 3);
            return opcion;
        }
    
        public static int menuTransferencias() {
            System.out.println("----------------Transferencias----------------");
            System.out.println("1. Transferencias de jugadores");
            System.out.println("2. Listar transferencias");
            System.out.println("3. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 3);
            return opcion;
        }
    
        public static int menuAficionados() {
            System.out.println("----------------Aficionados----------------");
            System.out.println("1. Venta de entradas");
            System.out.println("2. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 2);
            return opcion;
        }
    
        public static int menuPatrocinios() {
            System.out.println("----------------Patrocinios----------------");
            System.out.println("1. Registrar Patrocinios");
            System.out.println("2. Editar Patrocinios");
            System.out.println("3. Eliminar Patrocinios");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    
        public static int menuComunicaciones() {
            System.out.println("----------------Comunicaciones----------------");
            System.out.println("1. Generar comunicado de prensa ");
            System.out.println("2. Editar comunicados ");
            System.out.println("3. Eliminar comunicado ");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    
        public static int menuEstadisticas() {
            System.out.println("----------------Estadisticas----------------");
            System.out.println("1. Rendimiento Equipos");
            System.out.println("2. Rendimiento Jugadores ");
            System.out.println("4. Salir");
    
            int opcion = variables.verificarOpcion("Opción: ", 1, 4);
            return opcion;
        }
    }
    
}
