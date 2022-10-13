
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
	public double convertirPesosAOtraMoneda() {
		double convertido= (getCantidadConvertir()*(1))/valorLibra;
		return convertido;
		
	}
	@Override
	public double convertirOtraMonedaAPesos() {
		
		double convertido2= (getCantidadConvertir())*(valorLibra)/(1);
		
		return convertido2;
	}
}
