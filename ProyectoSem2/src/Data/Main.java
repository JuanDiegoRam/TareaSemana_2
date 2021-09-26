package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        TareaSemana2();
    }
    public static void TareaSemana2() {
        int anios = 0;
        double cantidadhoras = 0;
        double precio = 0;
        double preciofinal = 0;
        double salariobruto = 0;
        double deducciondinero = 0;
        double salarioneto = 0;
        double bonodinero = 0;

        anios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de años laborados: "));
        cantidadhoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas laboradas: "));
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio por hora: "));

        salariobruto = cantidadhoras * precio;

        if (anios >= 10) {
            bonodinero = salariobruto * 0.2;
            salariobruto += bonodinero;
        }

        if (salariobruto >= 2000) {
            deducciondinero = salariobruto * 0.15;
            salarioneto = salariobruto - deducciondinero;
        } else if (salariobruto > 1000 && 2000 > salariobruto) {
            deducciondinero = salariobruto * 0.1;
            salarioneto = salariobruto - deducciondinero;
        }else{
            salarioneto = salariobruto - deducciondinero;
        }


        JOptionPane.showMessageDialog(null, "Salario neto es: \n"+
                "$"+salarioneto);
        }

    }

