package math;

public class OperacionVectorEscalar extends Operaciones {
	private Vector resultado;
	public Vector suma(Vector a,Integer r) {
		Integer resultadoX = a.getX() + r;
		Integer resultadoY = a.getY() + r;
		resultado = new Vector(resultadoX, resultadoY);
		return resultado;
	}
	public Vector resta(Vector a, Integer r) {
		Integer resultadoX = a.getX() - r;
		Integer resultadoY = a.getY() - r;
		resultado = new Vector(resultadoX, resultadoY);
		return resultado;
	}
	public Vector division(Vector a, Integer r) {
		Integer resultadoX = a.getX() / r;
		Integer resultadoY = a.getY() / r;
		resultado = new Vector(resultadoX, resultadoY);
		return resultado;
	}
	public Vector multiplicacion(Vector a, Integer r) {
		Integer resultadoX = a.getX() * r;
		Integer resultadoY = a.getY() * r;
		resultado = new Vector(resultadoX, resultadoY);
		return resultado;
	}
}
