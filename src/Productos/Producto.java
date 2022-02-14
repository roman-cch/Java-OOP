package Productos;


import Edificio.*;


public class Producto {

	protected int id;
	protected String tipo;
	protected float anchura;
	protected float profundidad;
	protected float altura;
	protected String color;
	protected Edificio edificioActual;
	
	public Producto()
	{
		this.id= 0;
		this.tipo= "";
		this.anchura=1.0f;
		this.profundidad=1.0f;
		this.altura=1.0f;
		this.color="blanco";
		this.edificioActual= new Fabrica ();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Edificio getEdificioActual() {
		return edificioActual;
	}

	public void setEdificioActual(Edificio edificioActual) {
		this.edificioActual = edificioActual;
	}
	
	public String print() {
		
		return "Los valores por defecto de los productos son: "+" \n "+"Num serie: "+ this.id+" \n "+this.tipo+" \n "+this.anchura+"cm ancho"+" \n "+this.profundidad+"cm profundo"+" \n "+this.altura+"cm altura"+" \n "+this.color+" \n "+this.edificioActual.getTipo()+" \n "+" \n ";		
		
	}
}

