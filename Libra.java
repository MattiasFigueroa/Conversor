
public class Libra extends Moneda{
	
	private static double valorLibra = 168;
	
	public Libra() {
		
	}
	
	
	@Override
	protected double getCantidadConvertir() {
		// TODO Auto-generated method stub
		return super.getCantidadConvertir();
	}
	
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(1))/valorLibra;
		return convertido;


	}
}
