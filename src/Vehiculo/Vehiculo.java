package Vehiculo;

import Interfaces.GestionVehiculo;

public class Vehiculo implements GestionVehiculo{

	//Declaramos los atributos (variables) del objeto
	
	protected String marca;
	protected String color;
	protected float velocidadActual;
	protected float peso;
	protected float longitud; 
	protected float precio;
	protected boolean estaArrancado;
	
	
	//Creamos el constructor y damos los valores por defecto
	public Vehiculo()
	{
		this.marca="Renault";
		this.color="blanco";
		this.velocidadActual=0.0f;
		this.peso=1350.0f;
		this.longitud=5.0f;
		this.precio=5000.0f;
		this.estaArrancado=false;
		
		
	}
	
	//Definición getters y setters para acceder a cada atributo y ver o modificar su valor
	public String getMarca() {
		return marca;
	}


	public void setMarca(String Opel) {
		this.marca = Opel;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getVelocidadActual() {
		return velocidadActual;
	}


	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public boolean getEstaArrancado() {
		return estaArrancado;
	}


	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	//Definición de métodos(funciones/funcionalidades) propios implementados de la interfaz
	
	@Override
	public boolean arrancar() 
	{
		// TODO Auto-generated method stub
		
		if(this.estaArrancado)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public boolean acelerar(float incremento) 
	{
		// TODO Auto-generated method stub
		if(this.estaArrancado)
		{
			this.velocidadActual+= incremento;
			return true;
		}
		else  
		{
			return false;
		}
	}

	@Override
	public boolean frenar(float decremento) 
	{
		// TODO Auto-generated method stub
		if(this.estaArrancado)
		{
			this.velocidadActual-= decremento;
			if(this.velocidadActual<0.0f)//si el decremento resta por debajo de 0 la velActual se quedará en 0
			{
				this.velocidadActual=0.0f;
			}
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public boolean parar() 
	{
		// TODO Auto-generated method stub
		if(this.estaArrancado)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	//metodo print
	 public String print()
	 {
	     return "Los valores por defecto del vehículo son: "+" \n "+ this.marca+" \n "+this.color+" \n "+this.velocidadActual+"km/h"+" \n "+this.peso+"kg"+" \n "+this.longitud+"m"+" \n "+this.precio+"€"+" \n "+this.estaArrancado+" \n ";
	 }

	
	
}
 