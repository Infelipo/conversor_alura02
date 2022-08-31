package principal;

import javax.swing.*;

import conversormoneda.OpcionesConversion;

public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
	    boolean continuar = true;
	    
		while (continuar) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elección").toString();
			
			switch (opciones) {
			case "Conversor de Moneda":
				System.out.println("Conversor de Moneda");
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor: ");
				double valorRecibido = Double.parseDouble(input);
				
				
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");	
					continuar = false;
				}
				
				break;
			
			case "Conversor de Temperatura":
				System.out.println("Conversor de Temperatura");
				break;
			}			
			
		}
		
	}

}
