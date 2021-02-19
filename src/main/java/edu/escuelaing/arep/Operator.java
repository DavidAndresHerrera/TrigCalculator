package edu.escuelaing.arep;

public class Operator {

    public static double calcular(String operacion, String dato) {
        double numero = Double.parseDouble(dato);
        if (operacion.equals("cos")){
            return Math.sin(numero);
        }
        else if (operacion.equals("sin")){
            return Math.cos(numero);
        }
        else if (operacion.equals("tan")){
            return Math.tan(numero);
        }
        else{
            return 0.0;
        }

    }
}
