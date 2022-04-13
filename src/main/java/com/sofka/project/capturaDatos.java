package com.sofka.project;

import java.util.Scanner;

public class capturaDatos {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String texto = captura.nextLine();
        System.out.println("El texto ingresado es = " + texto);
    }
}
