package math;

public class OperacionesVectores extends Operaciones{
	private Vector resultado;
    public Vector suma(Vector a, Vector b) {
        Integer resultadoX = a.getX() + b.getX();
        Integer resultadoY = a.getY() + b.getY();
        resultado = new Vector(resultadoX, resultadoY);
        return resultado;
    }
    public Vector resta(Vector a, Vector b) {
        Integer resultadoX = a.getX() - b.getX();
        Integer resultadoY = a.getY() - b.getY();
        resultado = new Vector(resultadoX, resultadoY);
        return resultado;
    }
    public Vector division(Vector a, Vector b) {
        if(b.getX() == 0||b.getY() == 0) {
        	System.out.println("No es posible la division entre 0.");
        	resultado = new Vector(0, 0);
        	return resultado;
        } else {
        	Integer resultadoX = a.getX() / b.getX();
        	Integer resultadoY = a.getY() / b.getY();
        	resultado = new Vector(resultadoX, resultadoY);
            return resultado;
        }
    }
    public Vector multiplicacion(Vector a, Vector b) {
        Integer resultadoX = a.getX() * b.getX();
        Integer resultadoY = a.getY() * b.getY();
        resultado = new Vector(resultadoX, resultadoY);
        return resultado;
    }
    public void print (Vector result) {
        System.out.println("Result  x="  + result.getX() + " y = " + result.getY());
    }   

}