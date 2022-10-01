import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		int tamaño= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
		int arreglo1[]=new int[tamaño];
		int arreglo2[]=new int[tamaño];
		int arreglo3[]=new int[tamaño];
		
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores, \n en la posicion "+(i+1)));
			arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores, \n en la posicion "+(i+1)));
			arreglo3[i]=arreglo1[i]*arreglo2[i];
			System.out.println("El resultaod de la suma de los dos primeros arreglos es: "+arreglo3[i]);
		}

	}

}
