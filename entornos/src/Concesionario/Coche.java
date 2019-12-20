package Concesionario;

/*
 * clase que represente un Coche
 * <p><a href = "https://github.com/KevinCabeza/JavaDoc.git> Ver proyecto en github" </a></p>
 * @author kevin
 * @version 1.0
 * @since 0.3
 * @license GPL v3
 * @see Dueño
 * 
 * 
 */

public class Coche {

	public String marca;
	public String modelo;
	public String color;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
