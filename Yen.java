
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
	public double convertirPesosAOtraMoneda() {
		double convertido= (getCantidadConvertir()*(1))/valorYen;
		return convertido;
		
	}
	@Override
	public double convertirOtraMonedaAPesos() {
		
		double convertido= (getCantidadConvertir())*(valorYen)/(1);
		
		return convertido;
	}
}
