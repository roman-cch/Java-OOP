package Edificio;

public abstract class Edificio {

	protected String tipo;
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String material;
	protected float precio;
	protected String color;
	
	public Edificio()
	{
		this.tipo= "Almace n";
		this.anchura=25.0f;
		this.altura=32.0f;
		this.profundidad=15.0f;
		this.material="ladrillo";
		this.precio=18000.0f;
		this.color="blanco";
		
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

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	//Definición de métodos y funciones
	
	
	//metodo de coste de pintar el edificio
	public float costePintura(String color, float precioMetro)
	{
		float coste=precioMetro*this.anchura*this.altura*this.profundidad;
		if(coste>0) 
		{
		return coste;
		}
		else 
		{
			return -1;
		}
	}
	//metodo de coste de pintura por lado, método sobrecargado
	public float costePintura(String color, float precioMetro, String lado)
	{
		float coste = 0;
		if(lado.equals("ladoanchura")) 
		{
			coste=precioMetro*this.anchura*this.altura;
			if(coste>0) 
			{
			return coste;
			}
			else 
			{
				return -1;
			}
		}
		else if(lado.equals("ladoprofundidad"))
		{
			coste=precioMetro*this.altura*this.profundidad;
			if(coste>0) 
			{
			return coste;
			}
			else 
			{
				return -1;
			}			
		}
		else
		{
			return -1;
		}
		
	}
	
	 public String print()
	 {
	     return "Los valores por defecto del edificio son: "+" \n "+ this.tipo+" \n "+ this.anchura+"m"+" \n "+ this.altura+"m"+" \n "+ this.profundidad+"m"+" \n "+ this.material+" \n "+ this.precio+"€"+" \n "+ this.color+" \n "+" \n ";
	 }

	
	//método abstracto de funcionalidad
	public abstract String funcionalidadEdificio();
	
}
