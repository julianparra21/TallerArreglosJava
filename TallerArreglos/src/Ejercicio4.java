import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio4 {
 public static void main(String[] args) {
	int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de caracteres que desea insertar"));
	for (int i = 0; i < n; i++) {
		int ingreso=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
	System.out.print(ingreso+"||");	
	}
	
}
}
