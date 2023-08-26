package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;


public class Modificacion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	System.out.println("Hola, mundo! ");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
	System.out.println("\n" + "País con más medallistas" + "\n");
	Map<String, Integer> paises = calc.paisConMasMedallistas();
	for (String nombre : paises.keySet())
		{
		System.out.println("El país con mas medallas es " +nombre + " el cual ha tiene " + paises.get(nombre) + " medallistas");
		}

	}
}


