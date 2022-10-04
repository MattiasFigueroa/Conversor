
public class Euro extends Moneda {
	private static double valorEuro = 144;
	
	public Euro() {
		
	}
	
	@Override
	protected double getCantidadConvertir() {
		
		return super.getCantidadConvertir();
	}
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(1))/valorEuro;
		return convertido;
	}
	
	
}
	

