package conversormoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosColombianosADolares(double valor) {
		double monedaDolar = valor / 4427.40;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dólares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valor) {
		double monedaEuro = valor / 4452.24;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosColombianosALibras(double valor) {
		double monedaLibra = valor / 5149.40;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
	}
	
	public void ConvertirPesosColombianosAYen(double valor) {
		double monedaYen = valor / 31.91;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirPesosColombianosAWon(double valor) {
		double monedaWon = valor / 3.30;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won Coreanos");
	}
	
	public void ConvertirDolarAPesosColombianos(double valor) {
		double monedaPesosColombianos = valor * 4427.40;
		monedaPesosColombianos = (double) Math.round(monedaPesosColombianos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosColombianos + " Pesos Colombianos");
	}
	
	public void ConvertirEurosAPesosColombianos(double valor) {
		double monedaPesosColombianos = valor * 4452.24;
		monedaPesosColombianos = (double) Math.round(monedaPesosColombianos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosColombianos + " Pesos Colombianos");
	}
	
	public void ConvertirLibrasAPesosColombianos(double valor) {
		double monedaPesosColombianos = valor * 5149.40;
		monedaPesosColombianos = (double) Math.round(monedaPesosColombianos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosColombianos + " Pesos Colombianos");
	}
	
	public void ConvertirYenAPesosColombianos(double valor) {
		double monedaPesosColombianos = valor * 31.91;
		monedaPesosColombianos = (double) Math.round(monedaPesosColombianos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosColombianos + " Pesos Colombianos");
	}
	
	public void ConvertirWonAPesosColombianos(double valor) {
		double monedaPesosColombianos = valor * 3.30;
		monedaPesosColombianos = (double) Math.round(monedaPesosColombianos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosColombianos + " Pesos Colombianos");
	}

}

/*
"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", 
"De Pesos Colombianos a Libras", "De Pesos Colombianos a Yen", "De Pesos Colombianos a Won Coreano", "De Dólar a Pesos Colombianos", 
"De Euro a Pesos Colombianos", "De Libras a Pesos Colombianos", "De Yen a Pesos Colombianos", "De Won Coreano a Pesos Colombianos"}, 
*/