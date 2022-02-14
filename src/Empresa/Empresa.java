package Empresa;

import Edificio.*;
import Productos.*;
import Vehiculo.*;

public class Empresa {
	
	protected Vehiculo vel1;
	protected Vehiculo vel2;
	protected Vehiculo vg;
	protected Vehiculo vd;
	protected Edificio Oficina;
	protected Edificio Fabrica;
	protected Edificio Almacen;
	protected Producto puerta1;
	protected Producto puerta2;
	protected Producto silla1;
	protected Producto silla2;
	protected Producto ventana1;
	protected Producto ventana2;
	
	public Empresa ()
	{
		this.vel1= new VehiculoElectrico();
		this.vel2= new VehiculoElectrico();
		this.vg= new VehiculoGasoil();
		this.vd= new VehiculoGasolina();
		this.Fabrica= new Fabrica();
		this.Oficina= new Oficina();
		this.Almacen= new Almacen();
		this.puerta1= null;
		this.puerta2= null;
		this.silla1= null;
		this.silla2= null;
		this.ventana1= null;
		this.ventana2= null;
		
	}
	
	public Vehiculo getVel1() {
		return vel1;
	}






	public void setVel1(Vehiculo vel1) {
		this.vel1 = vel1;
	}






	public Vehiculo getVel2() {
		return vel2;
	}






	public void setVel2(Vehiculo vel2) {
		this.vel2 = vel2;
	}






	public Vehiculo getVg() {
		return vg;
	}






	public void setVg(Vehiculo vg) {
		this.vg = vg;
	}






	public Vehiculo getVd() {
		return vd;
	}






	public void setVd(Vehiculo vd) {
		this.vd = vd;
	}






	public Edificio getOficina() {
		return Oficina;
	}






	public void setOficina(Edificio oficina) {
		Oficina = oficina;
	}






	public Edificio getFabrica() {
		return Fabrica;
	}






	public void setFabrica(Edificio fabrica) {
		Fabrica = fabrica;
	}






	public Edificio getAlmacen() {
		return Almacen;
	}






	public void setAlmacen(Edificio almacen) {
		Almacen = almacen;
	}






	public Producto getPuerta1() {
		return puerta1;
	}






	public void setPuerta1(Producto puerta1) {
		this.puerta1 = puerta1;
	}






	public Producto getPuerta2() {
		return puerta2;
	}






	public void setPuerta2(Producto puerta2) {
		this.puerta2 = puerta2;
	}






	public Producto getSilla1() {
		return silla1;
	}






	public void setSilla1(Producto silla1) {
		this.silla1 = silla1;
	}






	public Producto getSilla2() {
		return silla2;
	}






	public void setSilla2(Producto silla2) {
		this.silla2 = silla2;
	}






	public Producto getVentana1() {
		return ventana1;
	}






	public void setVentana1(Producto ventana1) {
		this.ventana1 = ventana1;
	}






	public Producto getVentana2() {
		return ventana2;
	}






	public void setVentana2(Producto ventana2) {
		this.ventana2 = ventana2;
	}



    public String estadoProductos()
    {
    	String cadena="***************\n";
    	//estado puertas
    	if (puerta1!=null)
    	{
    		cadena+="p1:"+puerta1.getId()+"\n";
    	}
    	else
    	{
    		cadena+="p1:null\n";
    	}
    	if (puerta2!=null)
    	{
    		cadena+="p2:"+puerta2.getId()+"\n";
    	}
    	else
    	{
    		cadena+="p2:null\n";
    	}
    	
    	//estado sillas
    	if (silla1!=null)
    	{
    		cadena+="s1:"+silla1.getId()+"\n";
    	}
    	else
    	{
    		cadena+="s1:null\n";
    	}
    	if (silla2!=null)
    	{
    		cadena+="s2:"+silla2.getId()+"\n";
    	}
    	else
    	{
    		cadena+="s2:null\n";
    	}
    	
    	//estado ventanas
    	if (ventana1!=null)
    	{
    		cadena+="v1:"+ventana1.getId()+"\n";
    	}
    	else
    	{
    		cadena+="v1:null\n";
    	}
    	if (ventana2!=null)
    	{
    		cadena+="v2:"+ventana2.getId()+"\n";
    	}
    	else
    	{
    		cadena+="v2:null\n";
    	}
    	
    	cadena+="***************\n";
    	return cadena;
    }




	public boolean crearProducto (Producto prod) 
	{	//comprobamos si cabe entre todos los productos
		if(this.puerta1==null || this.puerta2==null || this.silla1==null || this.silla2==null || this.ventana1==null || this.ventana2==null) 
		{
			//si cabe, comprobamos de qué tipo es y si cabe en su categoría
			if(prod.getTipo().equals("Puerta")) 
			{
			
					//-----Codigo modificado 	
					if (puerta1!=null && puerta1.getId()==prod.getId())
					{
						//El producto ya existe no se puede incluir.
						return false;
						
					}
					else if (puerta2!=null && puerta2.getId()==prod.getId())
					{
						//El producto ya existe no se puede incluir.
						return false;
						
					}
					else if (puerta1==null) 
					{
						this.puerta1=  prod;
						return true;
					}
					else if(puerta2==null) 
					{
						this.puerta2=  prod;
							return true;
					}
					else //no hay hueco para otra silla porque existen ya dos id de sillas
					{
						 return false;
					
					}
			}	
			else if(prod.getTipo().equals("Silla"))
			{
				//-----Codigo modificado 	
				if (silla1!=null && silla1.getId()==prod.getId())
				{
					//El producto ya existe no se puede incluir.
					return false;
					
				}
				else if (silla2!=null && silla2.getId()==prod.getId())
				{
					//El producto ya existe no se puede incluir.
					return false;
					
				}
				else if (silla1==null) 
				{
					this.silla1=  prod;
					return true;
				}
				else if(silla2==null) 
				{
					this.silla2=  prod;
						return true;
				}
				else //no hay hueco para otra silla porque existen ya dos id de sillas
				{
					 return false;
				
				}
			}
			else if(prod.getTipo().equals("Ventana"))
			{
				//-----Codigo modificado 	
				if (ventana1!=null && ventana1.getId()==prod.getId())
				{
					//El producto ya existe no se puede incluir.
					return false;
					
				}
				else if (ventana2!=null && ventana2.getId()==prod.getId())
				{
					//El producto ya existe no se puede incluir.
					return false;
					
				}
				else if (ventana1==null) 
				{
					this.ventana1=  prod;
					return true;
				}
				else if(ventana2==null) 
				{
					this.ventana2=  prod;
						return true;
				}
				else //no hay hueco para otra silla porque existen ya dos id de sillas
				{
					 return false;
				
				}
			}
		}
		
		return false;
	}	
	
	
	public boolean venderProducto (Producto prod) 
	{
		if(prod.getTipo().equals("Puerta")) 
		{
				if(((puerta1!=null) && prod.getId()!=puerta1.getId()) && (puerta2!=null) && (prod.getId()!=puerta2.getId()) ) 
				{
					System.out.println("err1 no hay hueco");//ocurrirá si no hay huecos
					return false;
				}
				else 
				{
					
					if(puerta1!=null && prod.getId()==puerta1.getId() && puerta1.getEdificioActual().getTipo().equals("Fabrica")) 
					{
						System.out.println("Se puede vender");
						puerta1=null;
						return true;
					}
					else if(puerta2!=null && prod.getId()==puerta2.getId() && puerta2.getEdificioActual().getTipo().equals("Fabrica")) 
					{						
						puerta1=null;
						return true;
					}
				else 
				{
					System.out.println("Producto no encontrado");//Error no existe la puerta con el id en la empresa
					return false;
				}
			}
		}
		
		if(prod.getTipo().equals("Silla")) 
		{
			if(((silla1!=null) && prod.getId()!=silla1.getId()) && (silla2!=null) && (prod.getId()!=silla2.getId()) ) 
			{
				System.out.println("err1 no hay hueco");//ocurrirá si no hay huecos
				return false;
			}
			else 
			{

				if(silla1!=null && prod.getId()==silla1.getId() && silla1.getEdificioActual().getTipo().equals("Fabrica")) 
				{
					System.out.println("Se puede vender");
					silla1=null;
					return true;
				}
				else if(silla2!=null && prod.getId()==silla2.getId() && silla2.getEdificioActual().getTipo().equals("Fabrica")) 
				{					
					silla1=null;
					return true;
				}
				else 
				{
					System.out.println("Producto no encontrado");//Error no existe la silla con el id en la empresa
					return false;
				}
			}
			
		}
		if(prod.getTipo().equals("Ventana")) 
		{
			if(((ventana1!=null) && prod.getId()!=ventana1.getId()) && (ventana2!=null) && (prod.getId()!=ventana2.getId()) ) 
			{
				System.out.println("err1 no hay hueco");//ocurrirá si no hay huecos
				return false;
			}
			else 
			{
				
				if(ventana1!=null && prod.getId()==ventana1.getId() && ventana1.getEdificioActual().getTipo().equals("Fabrica")) 
				{
					System.out.println("Se puede vender");
					ventana1=null;
					return true;
				}
				else if(ventana2!=null && prod.getId()==ventana2.getId() && ventana2.getEdificioActual().getTipo().equals("Fabrica")) 
				{
					ventana1=null;
					return true;
				}
				else 
				{
					System.out.println("Producto no encontrado");//Error no existe la ventana con el id en la empresa
					return false;
				}
			}
			
		}
		
		
		return false;
	}
					
				
				
				
				
				
				
				
				
				
		/************************************mi codigo***************************/		
				
				
				
				
				/*
				//si el id del nuevo producto es diferente de los productos creados y si alguno de esos productos tiene valor null, se creara Prod, si no, devlverá  false
				if((prod.getId()!=puerta1.getId()) && (prod.getId()!=puerta2.getId()) ) 
				{
					if (puerta1==null) 
					{
						this.puerta1= (Puertas) prod;
						return true;
					}
					else if(puerta2==null) 
					{
						this.puerta2= (Puertas) prod;
						return true;
					}
					else //no hay hueco para otra puerta porque existen ya dos id de puerta
					{
						return false;
					}
				}
				else 
				{
					return false;//el id no es distinto de los ya existentes
				}
			}
			else if(prod.getTipo().equals("Silla"))
			{
				if((prod.getId()!=silla1.getId()) && (prod.getId()!=silla2.getId()) ) 
				{
					if (silla1==null) 
					{
						this.silla1= (Sillas) prod;
						return true;
					}
					else if(silla2==null) 
					{
						this.silla2= (Sillas) prod;
						return true;
					}
					else //no hay hueco para otra silla porque existen ya dos id de sillas
					{
						return false;
					}
				}
				else 
				{
					return false;//el id no es distinto de los ya existentes
				}
			}
			else if(prod.getTipo().equals("Ventana"))
			{
				if((prod.getId()!=ventana1.getId()) && (prod.getId()!=ventana2.getId()) ) 
				{
					if (ventana1==null) 
					{
						this.ventana1= (Sillas) prod;
						return true;
					}
					else if(ventana2==null) 
					{
						this.ventana2= (Sillas) prod;
						return true;
					}
					else //no hay hueco para otra silla porque existen ya dos id de sillas
					{
						return false;
					}
				}
				else 
				{
					return false;//el id no es distinto de los ya existentes
				}
			}

		}
		return false;		  		
	}
	
	public boolean venderProducto (Producto prod)
	{
		if(prod.getTipo().equals("Puerta")) 
		{
			if(((puerta1!=null) && prod.getId()!=puerta1.getId()) && (puerta2!=null) && (prod.getId()!=puerta2.getId()) ) 
			{//si el id del producto a vender no coincide quiere decir que no existe en el stock por lo tanto no se puede vender
				return false;
			}
			else 
			{//se puede vender el producto porque existe
				if(prod.getId()==puerta1.getId() && puerta1.getEdificioActual().getTipo().equals("Almacen")) 
				{
					puerta1=null;//el producto se vende y deja la variable vacante
					return true;
				}
				else 
				{
					puerta2=null;
					return true;
				}

			}
		}
		
		if(prod.getTipo().equals("Silla")) 
		{
			if(((silla1!=null) && prod.getId()!=silla1.getId()) && (silla2!=null) && (prod.getId()!=silla2.getId()) ) 
			{
				return false;
			}
			else 
			{
				if(prod.getId()==silla1.getId() && silla1.getEdificioActual().getTipo().equals("Almacen")) 
				{
					puerta1=null;
					return true;
				}
				else 
				{
					silla2=null;
					return true;
				}
			}
		}
		
		if(prod.getTipo().equals("Ventana")) 
		{
			if(((ventana1!=null) && prod.getId()!=ventana1.getId()) && (ventana2!=null) &&  (prod.getId()!=ventana2.getId()) ) 
			{
				return false;
			}
			else 
			{
				if(prod.getId()==ventana1.getId() && ventana2.getEdificioActual().getTipo().equals("Almacen")) 
				{
					ventana1=null;
					return true;
				}
				else 
				{
					ventana2=null;
					return true;
				}

			}
		}
		
		 return true;
	}
	*/
	
	
	
	
	/************************************mi codigo***************************/	
	
	
	
	
	
	
	
	
	
	public boolean cambiarUbicacioProducto (Producto prod, Edificio edif)
	{//buscamos si la id coincide con algún producto y si es así, establecemos el nuevo edificio al que lo cambiamos
		if((prod.getId()==puerta1.getId()) )
		{
			puerta1.setEdificioActual(edif);
			return false;
		}
		if((prod.getId()==puerta2.getId()) )
		{
			puerta2.setEdificioActual(edif);
			return false;
		}
		if((prod.getId()==silla1.getId()) )
		{
			silla1.setEdificioActual(edif);
			return false;
		}
		if((prod.getId()==silla2.getId()) )
		{
			silla2.setEdificioActual(edif);
			return false;
		}
		if((prod.getId()==ventana1.getId()) )
		{
			ventana1.setEdificioActual(edif);
			return false;
		}
		if((prod.getId()==ventana2.getId()) )
		{
			ventana2.setEdificioActual(edif);
			return false;
		}


		return true;
	}
	

	//metodo print
	public String print() {
		
		String cadena="";
		if (vel1!=null)
		{
			cadena+=vel1.print();
		}
		if (vel2!=null)
		{
			cadena+=vel2.print();
		}
		if (vg!=null)
		{
			cadena+=vg.print();
		}
		if (vd!=null)
		{
			cadena+=vd.print();
		}
		if (Oficina!=null)
		{
			cadena+=Oficina.print();
		}
		if (Fabrica!=null)
		{
			cadena+=Fabrica.print();
		}
		if (Almacen!=null)
		{
			cadena+=Almacen.print();
		}
		if (puerta1!=null)
		{
			cadena+=puerta1.print();
		}
		if (puerta2!=null)
		{
			cadena+=puerta2.print();
		}
		if (silla1!=null)
		{
			cadena+=silla1.print();
		}
		if (silla2!=null)
		{
			cadena+=silla2.print();
		}
		if (ventana1!=null)
		{
			cadena+=ventana1.print();
		}
		if (ventana2!=null)
		{
			cadena+=ventana2.print();
		}
		//....
		//return vel1.print() + " \n" + vel2.print() + "\n" + vg.print() + " \n" + vd.print() + " \n" + Oficina.print() + " \n" + Fabrica.print() + " \n" + Almacen.print() + " \n" + puerta1.print() + " \n" + puerta2.print() + " \n" + silla1.print() + " \n" + silla2.print() + " \n" + ventana1.print() + " \n" + ventana2.print();
		return cadena;
	}

}
