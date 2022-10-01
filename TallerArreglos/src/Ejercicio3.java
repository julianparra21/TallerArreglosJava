import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamaño;
		double promedio=0;
		tamaño=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de campos que desea almacenar"));
			double arreglo[]=new double[tamaño];
			
			for (int i = 0; i < tamaño; i++) {
				
				arreglo[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la  nota"));
			
				 promedio+= arreglo[i]/tamaño;
				
			}
			System.out.println("el promedio es: "+promedio);
	}

}
