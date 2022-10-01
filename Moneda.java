
public abstract class Moneda {   	//creo clase abstracta
	protected double cantidadConvertir; //cantidad ingresada por el usuario
	
	protected Moneda(){ //creo constructor por defecto
		
	}
	
	protected void getCantidadConvertir(double cantidadConvertir) { //metodo get
		//asigna la moneda ingresada como atributo
		this.cantidadConvertir=cantidadConvertir;	
	}
	
	
	public abstract double convertirMoneda(); //creo metodo abstracto
											 //solo sera implementado por sus hijas
		

	

}
