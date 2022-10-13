
import javax.swing.JOptionPane;
public class main {
	
	
	public static void main(String[] args) {
			
			String[] tipoConversion= {
					"Conversion de Moneda",
			};
			
			//Creacion de array para guardar los tipos de cambio que puede seleccionar el usuario
			String[] opciones= {
					"De Pesos a Dolares",
					"De Pesos a Euros",
					"De Pesos a Libras Esterlinas",
					"De Pesos a Yenes",
					"De Pesos a Wones",
					"De Dolares a Pesos",
					"De Euros a Pesos",
					"De Libras Esterlinas a Pesos",
					"De Yenes a Pesos",
					"De Wones a Pesos",
			};
		
			
		int respuesta=0;
			
		while(respuesta==0) { 	//SE EJECUTA MIENTRAS RESPUESTA SEA 0
			//Despliega MENU PRINCIPAL
			//(String)JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje, Icono, Arreglo de opciones, Seleccion por defecto );
			String tipoConversion2=(String)JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion:","MENU",JOptionPane.DEFAULT_OPTION,null,tipoConversion,tipoConversion[0]);
			
				if(tipoConversion2=="Conversion de Moneda") {
					
					//recibe la cantidad de pesos a convertir
					double plata=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir: "));
					
					
						//Despliega menu de conversion de monedas
						//(String)JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje, Icono, Arreglo de opciones, Seleccion por defecto );
						String tipoMoneda=(String)JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero:","MONEDAS",JOptionPane.DEFAULT_OPTION,null,opciones,opciones[0]);
				
					
			
			
							//Segun el tipo de moneda que selecciono el usuario, se proseguira de acuerdo al caso
							switch (tipoMoneda) {
								case "De Pesos a Dolares":
						
						
								Moneda cambioDolar=new Dolar(); 		//declaro variable de la Clase Moneda y creo nueva instancia Dolar
								
								cambioDolar.setCantidadConvertir(plata); 		//invoco metodo de la clase cambioDolar y le envio el parametro plata
								
								double convertiPesos=cambioDolar.convertirPesosAOtraMoneda();		//Invoco metodo del objeto para convertir plata
								
								JOptionPane.showMessageDialog(null,"Tienes "+convertiPesos+" dolares");   //Muestra la cantidad convertida que tiene el usuario
								
								break;
								
							case "De Dolares a Pesos":
								
								
								Moneda cambioPeso=new Dolar(); 				//declaro variable de la Clase Moneda y creo nueva instancia Dolar
								
								cambioPeso.setCantidadConvertir(plata);		 		//invoco metodo de la clase cambioDolar y le envio el parametro plata
								
								double convertiDolares=cambioPeso.convertirOtraMonedaAPesos();				//Invoco metodo del objeto para convertir plata
								
								JOptionPane.showMessageDialog(null,"Tienes "+convertiDolares+" pesos"); 		//Muestra la cantidad convertida que tiene el usuario
								
								break;     
							
							case "De Pesos a Euros":
								
								Moneda cambioEuro=new Euro();
								
								cambioEuro.setCantidadConvertir(plata);
								
								double convertiPesos2=cambioEuro.convertirPesosAOtraMoneda();
								JOptionPane.showMessageDialog(null,"Tienes "+convertiPesos2+" Euros");
								break;	
							case "De Euros a Pesos":
								
								Moneda cambioPeso2=new Euro();
								
								cambioPeso2.setCantidadConvertir(plata);
								
								double convertiEuros=cambioPeso2.convertirOtraMonedaAPesos();
								JOptionPane.showMessageDialog(null,"Tienes "+convertiEuros+" Pesos");
								break;	
							
							case "De Pesos a Libras Esterlinas":
								
								Moneda cambioPesos3=new Libra();
								
								cambioPesos3.setCantidadConvertir(plata);
								
								double convertiPesos3=cambioPesos3.convertirPesosAOtraMoneda();
								JOptionPane.showMessageDialog(null,"Tienes "+convertiPesos3+" Libras Esterlinas");
								break;
							case "De Libras Esterlinas a Pesos":
								
								Moneda cambioLibra=new Libra();
								
								cambioLibra.setCantidadConvertir(plata);
								
								double convertiLibras=cambioLibra.convertirOtraMonedaAPesos();
								JOptionPane.showMessageDialog(null,"Tienes "+convertiLibras+" Pesos");
								break;
							
							case "De Pesos a Yenes":
								
								Moneda cambioPesos4=new Yen();
								
								cambioPesos4.setCantidadConvertir(plata);
								
								double pesosAYenes=cambioPesos4.convertirPesosAOtraMoneda();
								
								JOptionPane.showMessageDialog(null,"Tienes "+pesosAYenes+" Yenes");
								break;
							case "De Yenes a Pesos":
								
								Moneda cambioYenes=new Yen();
								
								cambioYenes.setCantidadConvertir(plata);
								
								double yenesAPesos=cambioYenes.convertirOtraMonedaAPesos();
								
								JOptionPane.showMessageDialog(null,"Tienes "+yenesAPesos+" Pesos");
								break;
							
							case "De Pesos a Wones":
								
								Moneda cambioPesos5=new Won();
								
								cambioPesos5.setCantidadConvertir(plata);
								
								double pesosAWones=cambioPesos5.convertirPesosAOtraMoneda();
								JOptionPane.showMessageDialog(null,"Tienes "+pesosAWones+" Wones");
								break;
							case "De Wones a Pesos":
								
								Moneda cambioWones=new Won();
								
								cambioWones.setCantidadConvertir(plata);
								
								double wonesAPesos=cambioWones.convertirOtraMonedaAPesos();
								JOptionPane.showMessageDialog(null,"Tienes "+wonesAPesos+" Pesos");
								break;
								
							default:
								break;
						}
			
			
				respuesta=JOptionPane.showConfirmDialog(null,"¿Desea continuar?"); //Despliega menu de confirmacion si respuesta = 0 continua(ARRIBA) while
				
				
				if(respuesta==1) {   //termina el programa
					JOptionPane.showMessageDialog(null,"Programa Terminado");
				}else if(respuesta==2){ //termina el programa
					JOptionPane.showMessageDialog(null,"Programa Terminado");
				}
				
				
				
			}
		}
				
		
			
	
			
			
				
				
				
			

			
			
					
				
			
	}
	
	
		
	
	
	
	
}