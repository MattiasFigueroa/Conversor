
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
			
			
			//to do menu para que el usuario seleccione el tipo de conversion
			String[] opciones= {
					"De Pesos a Dolares",
					"De Pesos a Euros",
					"De Pesos a Libras Esterlinas",
					"De Pesos a Yenes",
					"De Pesos a Wones",
			};
		
			//Despliega menu de opciones con tipos de moneda
			//(String)JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje, Icono, Arreglo de opciones, Seleccion por defecto );
			String tipoMoneda=(String)JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero:","MONEDAS",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
			
			//System.out.println(opciones[4]);
			//System.out.println(tipoMoneda);
		
			
			//recibe la cantidad de pesos a convertir
			double plata;
			plata=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir: "));
			
			//to do validacion del input (que solo admita numeros)
			
			
			Moneda dolar=new Yen ();
			
			
			
			dolar.setCantidadConvertir(plata);
			JOptionPane.showMessageDialog(null, "el numero ingresado es: "+plata);
			
			double converti=dolar.convertirMonedaa();
			JOptionPane.showMessageDialog(null,"Lo que te corresponde en dolares es: "+converti);
			
	}
	
	
		
	
	
	
	
}