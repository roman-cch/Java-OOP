package Edificio;

public class Fabrica extends Edificio{
	
		 public String print()
		 {
		     return "Los valores por defecto de la f�brica son: "+" \n "+ this.anchura+"m ancho"+" \n "+ this.altura+"m alto"+" \n "+ this.profundidad+"m profundo"+" \n "+ this.material+" \n "+ this.precio+"�"+" \n "+ this.color+" \n "+this.funcionalidadEdificio()+" \n "+" \n ";
		 }
		 
		 public Fabrica() {
			 this.tipo="Fabrica";
		 }
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la f�brica se crea el producto.";
	}

}
