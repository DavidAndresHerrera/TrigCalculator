package edu.escuelaing.arep;



import org.json.JSONObject;

import static spark.Spark.*;

/**
 * Hello world!
 */
public class CalculadoraTrigo
{
    public static void main(String[] args) {

        port(getPort());
        get("/Calcular",(req,res)->{
            String operacion = req.queryParams("operacion");
            String dato = req.queryParams("dato");
            return respuesta(operacion,dato);

        });
    }

    private static Object respuesta(String operacion, String dato) {
        JSONObject jsObject = new JSONObject();
        double  total = Operator.calcular(operacion,dato);
        jsObject.put("Operacion",operacion);
        jsObject.put("Dato",dato);
        jsObject.put("Resultado",total);
        return jsObject;
    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36001;
    }
}
