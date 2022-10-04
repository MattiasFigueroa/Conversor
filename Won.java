
public class Won extends Moneda {
	
	private static double valorWon = 0.1;
	
	public Won() {
		
	}
	
	
	@Override
	protected void getCantidadConvertir(double cantidadConvertir) {
		
		super.getCantidadConvertir(cantidadConvertir);
	}
	
	
	@Override
	public double convertirMonedaa() {
		double convertido= (cantidadConvertir*(valorWon))/1;
		return convertido;
	}
}
