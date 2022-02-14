package Edificio;

public class Almacen extends Edificio{
	 public String print()
	 {
	     return "Los valores por defecto del almacén son: "+" \n "+ this.anchura+"m ancho"+" \n "+ this.altura+"m alto"+" \n "+ this.profundidad+"m profundo"+" \n "+ this.material+" \n "+ this.precio+"€"+" \n "+ this.color+" \n "+this.funcionalidadEdificio()+" \n "+" \n ";
	 }
	 
	 public Almacen() {
		 this.tipo="Almacen";
	 }

	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En el almacén se guarda el producto para posteriormente venderlo. ";
	}


}
