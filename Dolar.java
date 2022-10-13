
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
	public double convertirPesosAOtraMoneda() {
		
		double convertido= (getCantidadConvertir())*(1)/(valorDolar);
		
		return convertido;
	}
	@Override
	public double convertirOtraMonedaAPesos() {
		
		double convertido= (getCantidadConvertir())*(valorDolar)/(1);
		
		return convertido;
	}
}
