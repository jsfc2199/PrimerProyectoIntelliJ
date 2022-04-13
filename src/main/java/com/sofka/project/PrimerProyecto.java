package com.sofka.project;

import java.util.Scanner;

public class PrimerProyecto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un nombre de usuario");
        String nomUsuario = entrada.nextLine();

        System.out.println("Ingresa un numero de celular");
        String celular = entrada.nextLine();

        System.out.println("Ingresa tu edad");
        String edad= entrada.nextLine();

        System.out.println("Bienvenido señor " + nomUsuario + ", es un placer para nosotros contar con una persona de " + edad + " años." +
                "\nPróximamente nos comunicaremos con usted al numero " + celular + ".\nFeliz día");
    }
}
