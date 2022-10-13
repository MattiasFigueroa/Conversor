
public class Won extends Moneda {
	
	private static double valorWon = 0.1;
	
	public Won() {
		
	}
	
	
	@Override
	protected double getCantidadConvertir() {
		// TODO Auto-generated method stub
		return super.getCantidadConvertir();
	}
	
	
	@Override
	public double convertirPesosAOtraMoneda() {
		double convertido= (getCantidadConvertir()*(1))/valorWon;
		return convertido;
		
	}
	@Override
	public double convertirOtraMonedaAPesos() {
		
		double convertido= (getCantidadConvertir())*(valorWon)/(1);
		
		return convertido;
	}
}
