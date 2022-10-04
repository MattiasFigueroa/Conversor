
public class Yen extends Moneda {
	
	private static double valorYen = 1;
	
	public Yen() {
		
	}
	
	@Override
	protected double getCantidadConvertir() {
		// TODO Auto-generated method stub
		return super.getCantidadConvertir();
	}
	
	
	
	@Override
	public double convertirMonedaa() {
		
		double convertido= (cantidadConvertir*(1))/valorYen;
		return convertido;
	}
}
