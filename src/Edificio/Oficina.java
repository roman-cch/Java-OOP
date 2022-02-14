package Edificio;

public class Oficina extends Edificio {
	
	 public String print()
	 {
	     return "Los valores por defecto del oficina son: "+" \n "+ this.anchura+"m ancho"+" \n "+ this.altura+"m alto"+" \n "+ this.profundidad+"m profundo"+" \n "+ this.material+" \n "+ this.precio+"€"+" \n "+ this.color+" \n "+this.funcionalidadEdificio()+" \n "+" \n ";
	 }
	 
	 public Oficina() {
		 this.tipo="Oficina";
	 }

	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la oficina se etiqueta el producto. ";
	}

}
