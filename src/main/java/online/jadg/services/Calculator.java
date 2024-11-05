package online.jadg.services;

public class Calculator {
    /**
     * Suma dos números
     * @param a
     * @param b
     * @return
     */
    public double add(double a, double b){
        return a + b;
    }

    /**
     * Resta dos números
     * @param a
     * @param b
     * @return
     */
    public double subtract(double a, double b){
        return a - b;
    }

    /**
     * Multiplica dos números
     * @param a
     * @param b
     * @return
     */
    public double multiply(double a, double b){
        return a * b;
    }

    /**
     * Divide dos números
     * @param a
     * @param b
     * @return
     */
    public double divide(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

}
