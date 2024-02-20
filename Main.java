/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAlumnos gestorAlumnos = new GestorAlumnos();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar lista de alumnos");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarAlumno(scanner, gestorAlumnos);
                    break;
                case 2:
                    mostrarListaAlumnos(gestorAlumnos);
                    break;
                case 3:
                    actualizarAlumno(scanner, gestorAlumnos);
                    break;
                case 4:
                    eliminarAlumno(scanner, gestorAlumnos);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void agregarAlumno(Scanner scanner, GestorAlumnos gestorAlumnos) {
        System.out.println("\nIngrese los datos del nuevo alumno:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Asistencia: ");
        double asistencia = scanner.nextDouble();
        System.out.print("Finales: ");
        double finales = scanner.nextDouble();
        
        gestorAlumnos.agregarAlumno(new Alumno(nombre, apellido, telefono, correoElectronico, nota1, nota2, nota3, asistencia, finales));
    }

    private static void mostrarListaAlumnos(GestorAlumnos gestorAlumnos) {
        System.out.println("\nLista de alumnos:");
        for (Alumno alumno : gestorAlumnos.getListaAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() +
                    ", Apellido: " + alumno.getApellido() +
                    ", Teléfono: " + alumno.getTelefono() +
                    ", Correo electrónico: " + alumno.getCorreoElectronico() +
                    ", Nota 1: " + alumno.getNota1() +
                    ", Nota 2: " + alumno.getNota2() +
                    ", Nota 3: " + alumno.getNota3() +
                    ", Asistencia: " + alumno.getAsistencia() +
                    ", Finales: " + alumno.getFinales() +
                    ", Calificación Total: " + alumno.getNotaTotal() +
                    ", Calificación Final: " + alumno.getCalificacionFinal());
        }
    }

    private static void actualizarAlumno(Scanner scanner, GestorAlumnos gestorAlumnos) {
    System.out.println("\nIngrese el índice del alumno que desea actualizar:");
    int indice;
    while (true) {
        try {
            indice = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido para el índice del alumno:");
        }
    }

    Alumno alumnoExistente = gestorAlumnos.obtenerAlumno(indice);
    if (alumnoExistente != null) {
        System.out.println("Ingrese los nuevos datos del alumno:");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Asistencia: ");
        double asistencia = scanner.nextDouble();
        System.out.print("Finales: ");
        double finales = scanner.nextDouble();
        
        Alumno alumnoActualizado = new Alumno(nombre, apellido, telefono, correoElectronico, nota1, nota2, nota3, asistencia, finales);
        
        gestorAlumnos.actualizarAlumno(indice, alumnoActualizado);
        System.out.println("Alumno actualizado con éxito.");
    } else {
        System.out.println("El alumno con el índice especificado no existe.");
    }
}

    private static void eliminarAlumno(Scanner scanner, GestorAlumnos gestorAlumnos) {
    System.out.println("\nIngrese el índice del alumno que desea eliminar:");
    int indice;
    while (true) {
        try {
            indice = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido para el índice del alumno:");
        }
    }

    Alumno alumnoExistente = gestorAlumnos.obtenerAlumno(indice);
    if (alumnoExistente != null) {
        gestorAlumnos.eliminarAlumno(indice);
        System.out.println("Alumno eliminado con éxito.");
    } else {
        System.out.println("El alumno con el índice especificado no existe.");
    }
   } 
}