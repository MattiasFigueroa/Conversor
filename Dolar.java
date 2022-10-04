
public class Dolar extends Moneda {
	private static double valorDolar = 284;

	
	public Dolar() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected double getCantidadConvertir() {
		// TODO Auto-generated method stub
		return super.getCantidadConvertir();
	}
	
	
	
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(1))/valorDolar;
		return convertido;
	}
}
