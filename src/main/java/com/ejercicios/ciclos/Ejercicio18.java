package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
        int codigo, litros, facturasMas600 = 0;
        float totalFacturacion = 0;
        int litrosArticulo1 = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer
                    .parseInt(JOptionPane.showInputDialog("Factura " + i + " - Código del artículo (1, 2 o 3): "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Cantidad en litros: "));

            float precioLitros;
            switch (codigo) {
                case 1:
                    precioLitros = 0.60f;
                    break;
                case 2:
                    precioLitros = 3.00f;
                    break;
                case 3:
                    precioLitros = 1.25f;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código no válido");
                    continue;
            }

            float totalFactura = litros * precioLitros;
            totalFacturacion += totalFactura;

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (totalFactura > 600) {
                facturasMas600++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Facturación total: $" + totalFacturacion + "\n" +
                        "Litros vendidos del artículo 1: " + litrosArticulo1 + "\n" +
                        "Facturas de más de $600: " + facturasMas600);
    }
}