package math;

public class Operaciones {
    public Integer suma(Integer a, Integer b) {
        return a + b;
    }
    public Integer resta(Integer a, Integer b) {
        return a - b;
    }
    public Integer division (Integer a, Integer b) {
        if (b == 0) {
            System.out.println("No es posible la division entre 0.");
            return 0;
        } else {
        return a / b;
        }
    }
    public Integer multiplicacion (Integer a, Integer b) {
        return a * b;
    }
    public void print(Integer result) {
        System.out.println("Result = " + result);
    }
}