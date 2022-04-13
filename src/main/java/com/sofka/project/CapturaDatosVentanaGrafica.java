package com.sofka.project;

import javax.swing.*;

public class CapturaDatosVentanaGrafica {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog("Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "el dato ingresado es " + dato);
    }
}
