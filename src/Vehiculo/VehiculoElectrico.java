package Vehiculo;

public class VehiculoElectrico extends Vehiculo {
	

	protected float potencia;
	protected float velMaxima;	
	
	public VehiculoElectrico() {
		
		this.potencia= 300.0f;
		this.velMaxima= 250.0f;
		
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(float velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	 public String print()
	 {
	     return "Los valores por defecto del vehículo eléctrico son: "+" \n "+this.potencia+"cv"+" \n "+this.velMaxima+"km/h"+" \n "+ this.marca+" \n "+this.color+" \n "+this.velocidadActual+"km/h"+" \n "+this.peso+"kg"+" \n "+this.longitud+"m"+" \n "+this.precio+"€"+" \n "+"Está arrancado?:  "+this.estaArrancado+" \n "+" \n ";
	 }

}
