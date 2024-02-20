/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion;
import java.util.ArrayList;

public class GestorAlumnos {
    private ArrayList<Alumno> listaAlumnos;

    public GestorAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public Alumno obtenerAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            return listaAlumnos.get(indice);
        }
        return null;
    }

    public void actualizarAlumno(int indice, Alumno alumno) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.set(indice, alumno);
        }
    }

    public void eliminarAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.remove(indice);
        }
    }

    public void calcularCalificacionesCualitativas() {
        for (Alumno alumno : listaAlumnos) {
            alumno.calcularCalificacionFinal();
        }
    }
}