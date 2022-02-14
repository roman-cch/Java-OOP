package Vehiculo;

public class VehiculoGasolina extends Vehiculo{
	

		protected float contaminacion;
		protected float deposito;
		
		public VehiculoGasolina () {
			
			this.contaminacion= 50.0f;
			this.deposito= 3500f;
		}

		public float getContaminacion() {
			return contaminacion;
		}

		public void setContaminacion(float contaminacion) {
			this.contaminacion = contaminacion;
		}

		public float getDeposito() {
			return deposito;
		}

		public void setDeposito(float deposito) {
			this.deposito = deposito;
		}
		
		 public String print()
		 {
		     return "Los valores por defecto del vehículo de gasolina son: "+" \n "+ this.contaminacion+" emisiones"+" \n "+ this.deposito+"cc"+" \n "+ this.marca+" \n "+this.color+" \n "+this.velocidadActual+"km/h"+" \n "+this.peso+"kg"+" \n "+this.longitud+"m"+" \n "+this.precio+"€"+" \n "+"Está arrancado?:  "+this.estaArrancado+" \n "+" \n ";
		 }

}
