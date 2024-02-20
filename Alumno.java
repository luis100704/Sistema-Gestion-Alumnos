/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion;

public class Alumno {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private double nota1;
    private double nota2;
    private double nota3;
    private double asistencia;
    private double finales;
    private double notaTotal;
    private String calificacionFinal;

    public Alumno(String nombre, String apellido, String telefono, String correoElectronico,
                  double nota1, double nota2, double nota3, double asistencia, double finales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.asistencia = asistencia;
        this.finales = finales;
        calcularNotaTotal();
        calcularCalificacionFinal();
    }

    private void calcularNotaTotal() {
        this.notaTotal = (nota1 * 0.2) + (nota2 * 0.2) + (nota3 * 0.2) + (asistencia * 0.1) + (finales * 0.3);
    }

    void calcularCalificacionFinal() {
        if (notaTotal >= 5 && notaTotal < 8) {
            calificacionFinal = "Aprobado";
        } else if (notaTotal >= 8 && notaTotal < 10) {
            calificacionFinal = "Notable";
        } else if (notaTotal == 10) {
            calificacionFinal = "Sobresaliente";
        } else {
            calificacionFinal = "No Aprobado";
        }
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public String getCalificacionFinal() {
        return calificacionFinal;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public double getFinales() {
        return finales;
    }
}