
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
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(valorWon))/1;
		return convertido;
	}
}
