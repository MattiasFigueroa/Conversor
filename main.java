
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
			
			
			//Creacion de array para guardar los tipos de cambio que puede seleccionar el usuario
			String[] opciones= {
					"De Pesos a Dolares",
					"De Pesos a Euros",
					"De Pesos a Libras Esterlinas",
					"De Pesos a Yenes",
					"De Pesos a Wones",
			};
		
			//Despliega menu de opciones con tipos de Cambios
			//(String)JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje, Icono, Arreglo de opciones, Seleccion por defecto );
			String tipoMoneda=(String)JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero:","MONEDAS",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
			
			
			//recibe la cantidad de pesos a convertir
			double plata;
			plata=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir: "));
			
			//to do validacion del input (que solo admita numeros)
			
			
			//Segun el tipo de moneda que selecciono el usuario, se proseguira de acuerdo al caso
			switch (tipoMoneda) {
				case "De Pesos a Dolares":
					
					Moneda cambioDolar=new Dolar();
					
					cambioDolar.setCantidadConvertir(plata);
					//JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
					
					double converti=cambioDolar.convertirMonedaa();
					JOptionPane.showMessageDialog(null,"Lo que te corresponde en dolares es: "+converti);
					
					break;
				
				case "De Pesos a Euros":
					
					Moneda cambioEuro=new Euro();
					
					cambioEuro.setCantidadConvertir(plata);
					//JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
					
					double converti2=cambioEuro.convertirMonedaa();
					JOptionPane.showMessageDialog(null,"Lo que te corresponde en Euros es: "+converti2);
					break;	
				
				case "De Pesos a Libras Esterlinas":
					
					Moneda cambioLibra=new Libra();
					
					cambioLibra.setCantidadConvertir(plata);
					//JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
					
					double converti3=cambioLibra.convertirMonedaa();
					JOptionPane.showMessageDialog(null,"Lo que te corresponde en Libras Esterlinas es: "+converti3);
					break;
				
				case "De Pesos a Yenes":
					
					Moneda cambioYen=new Yen();
					
					cambioYen.setCantidadConvertir(plata);
					//JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
					
					double converti4=cambioYen.convertirMonedaa();
					JOptionPane.showMessageDialog(null,"Lo que te corresponde en Yenes es: "+converti4);
					break;
				
				case "De Pesos a Wones":
					
					Moneda cambioWon=new Won();
					
					cambioWon.setCantidadConvertir(plata);
					//JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
					
					double converti5=cambioWon.convertirMonedaa();
					JOptionPane.showMessageDialog(null,"Lo que te corresponde en Wones es: "+converti5);
					break;
					
				default:
					break;
			}
			

			
			
					
				
			
	}
	
	
		
	
	
	
	
}