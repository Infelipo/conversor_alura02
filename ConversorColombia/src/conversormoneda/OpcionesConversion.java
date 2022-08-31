package conversormoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero ", 
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", 
				"De Pesos Colombianos a Libras", "De Pesos Colombianos a Yen", "De Pesos Colombianos a Won Coreano", "De Dólar a Pesos Colombianos", 
				"De Euro a Pesos Colombianos", "De Libras a Pesos Colombianos", "De Yen a Pesos Colombianos", "De Won Coreano a Pesos Colombianos"}, 
				"Seleccion")).toString();
		
		switch (opcion) {
		case "De Pesos Colombianos a Dólar":
			monedas.ConvertirPesosColombianosADolares(valor);
			break;
		case "De Pesos Colombianos a Euro":
			monedas.ConvertirPesosColombianosAEuros(valor);
			break;
		case "De Pesos Colombianos a Libras":
			monedas.ConvertirPesosColombianosALibras(valor);
			break;
		case "De Pesos Colombianos a Yen":
			monedas.ConvertirPesosColombianosAYen(valor);
			break;
		case "De Pesos Colombianos a Won Coreano":
			monedas.ConvertirPesosColombianosAWon(valor);
			break;
		case "De Dólar a Pesos Colombianos":
			monedas.ConvertirDolarAPesosColombianos(valor);
			break;
		case "De Euro a Pesos Colombianos":
			monedas.ConvertirEurosAPesosColombianos(valor);
			break;
		case "De Libra a Pesos Colombianos":
			monedas.ConvertirLibrasAPesosColombianos(valor);
			break;
		case "De Yen a Pesos Colombianos":
			monedas.ConvertirYenAPesosColombianos(valor);
			break;
		case "De Won Coreano a Pesos Colombianos":
			monedas.ConvertirWonAPesosColombianos(valor);
			break;		
		}
		
	}

}
