import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double notas[]= new Double[3];
		
		notas[0]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la primera nota"));
		notas[1]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la segunda nota"));
		notas[2]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la tercera nota"));
		Double calculo= (notas[0]+notas[1]+notas[2])/3;
		
		System.out.println("El promedio de las notas ingresadas es: "+calculo);
	}

}
