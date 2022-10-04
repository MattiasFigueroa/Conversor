
public class Yen extends Moneda {
	
	private static double valorYen = 1;
	
	public Yen() {
		
	}
	
	
	@Override
	protected void getCantidadConvertir(double cantidadConvertir) {
		
		super.getCantidadConvertir(cantidadConvertir);
	}
	
	
	@Override
	public double convertirMonedaa() {
		
		double convertido= (cantidadConvertir*(1))/valorYen;
		return convertido;
	}
}
