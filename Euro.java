
public class Euro extends Moneda {
	private static double valorEuro = 144;
	
	public Euro() {
		
	}
	
	@Override
	protected double getCantidadConvertir() {
		
		return super.getCantidadConvertir();
	}
	
	@Override
	public double convertirPesosAOtraMoneda() {
		double convertido= (getCantidadConvertir()*(1))/valorEuro;
		return convertido;
		
	}
	@Override
	public double convertirOtraMonedaAPesos() {
		
		double convertido= (getCantidadConvertir())*(valorEuro)/(1);
		
		return convertido;
	}
	
	
}
	

