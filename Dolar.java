
public class Dolar extends Moneda {
	private static double valorDolar = 284;

	
	public Dolar() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void getCantidadConvertir(double cantidadConvertir) {
		// TODO Auto-generated method stub
		super.getCantidadConvertir(cantidadConvertir);
		
	}
	
	
	
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(1))/valorDolar;
		return convertido;
	}
}
