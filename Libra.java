
public class Libra extends Moneda{
	
	private static double valorLibra = 168;
	
	public Libra() {
		
	}
	
	
	@Override
	protected void getCantidadConvertir(double cantidadConvertir) {
		
		super.getCantidadConvertir(cantidadConvertir);
	}
	
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(1))/valorLibra;
		return convertido;


	}
}
