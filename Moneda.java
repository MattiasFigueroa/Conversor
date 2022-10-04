
public abstract class Moneda {   	//creo clase abstracta
	protected double cantidadConvertir; //cantidad ingresada por el usuario
	
	protected Moneda(){ //creo constructor por defecto
		
	}
	
	protected void setCantidadConvertir(double cantidadConvertir) {
		this.cantidadConvertir=cantidadConvertir;
	}
	
	protected double getCantidadConvertir() { //metodo get
		//asigna la moneda ingresada como atributo
			return this.cantidadConvertir;
		
	}
	
	
	public abstract double convertirMonedaa(); //creo metodo abstracto
											 //solo sera implementado por sus hijas
		

	

}
