import Edificio.*;
import Empresa.Empresa;
import Vehiculo.*;
import Productos.*;

public class Start {

	public static void main(String[] args) {
		
		//creamos e instanciamos el objeto empresa
		Empresa empre= new Empresa();
		
		
		//definimos objeto tipo vehiculo e instanciamos los objetos
		
		VehiculoElectrico vElec1 = new VehiculoElectrico();
		vElec1.setEstaArrancado(true);
		vElec1.setVelocidadActual(50.0f);
		empre.setVel1(vElec1);//establecemos los valores del objeto instanciado con el plano del objeto creado en el cosntructor de empresa
		
		VehiculoElectrico vElec2 = new VehiculoElectrico();
		vElec2.setEstaArrancado(true);
		vElec2.setVelocidadActual(50.0f);
		empre.setVel2(vElec2);
		
		VehiculoGasolina vGas = new VehiculoGasolina();
		vGas.setVelocidadActual(80.0f);
		vGas.frenar(20.0f);//le pasamos el valor a la función
		empre.setVg(vGas);
		
		VehiculoGasoil vDiesel = new VehiculoGasoil();
		vDiesel.setVelocidadActual(80.0f);
		vDiesel.frenar(20.0f);
		vDiesel.setColor("amarillo");
		empre.setVd(vDiesel);
		
		
		
		//definimos objeto tipo edificio e instanciamos
		
		Almacen almacen1 = new Almacen();
		almacen1.setAnchura(100.0f);
		almacen1.setProfundidad(25.0f);
		almacen1.setPrecio(360000.0f);
		
		Fabrica fabrica1 = new Fabrica();
		fabrica1.setAnchura(50.0f);
		fabrica1.setProfundidad(50.0f);
		fabrica1.setPrecio(480000.0f);
		float coste=fabrica1.costePintura("Verde", 30);
		System.out.println("\n"+"El coste de pintar la fábrica es de : "+"\n"+coste+" €");
		
		Oficina oficina1 = new Oficina();
		oficina1.setAnchura(15.0f);
		oficina1.setProfundidad(20.0f);
		oficina1.setPrecio(56000.0f);
		
		System.out.println("\n"+"\n"+"\n");
		
		//estado inicial de los productos
		System.out.println("---ESTADO INICIAL PRODUCTOS---"+"\n"+empre.estadoProductos());
		
		
		//creamos los productos (puertas)
		Producto p1 = new Producto();
		p1.setId(1);//le damos su id único y llamamos a función crearProducto() que hemos definodo en la clase empresa
		p1.setTipo("Puerta");
		p1.setEdificioActual(fabrica1);
		if(empre.crearProducto(p1)) 
		{
			System.out.println("-->Nuevo producto creado p");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto p");
		}

	
		
/******************* Esto es la prueba en la que tratamos de vender un producto dos veces, lo dejo comentado ya que no forma parte de lo que pides  ******
		
		//Vender producto que acabo de crear
		if(empre.venderProducto(p1)) 
		{
			System.out.println("1-->Producto vendido correctamente");
		}
		else
		{
			System.out.println("1-->Imposibe vender el producto");
		}
		System.out.println(empre.estadoProductos());//estado tras vender el nuevo prod
		
		//Vender producto de nuevo que acabo de vender
		if(empre.venderProducto(p1)) 
		{
			System.out.println("2-->Producto vendido correctamente");
		}
		else
		{
			System.out.println("2-->Imposibe vender el producto");
		}
		System.out.println(empre.estadoProductos());//estado tras tratar de vender un producto ya vendido (debe dar error)
		
************************** fin de la prueba*******/
		
		
		
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setTipo("Puerta");
		p2.setEdificioActual(fabrica1);
		if(empre.crearProducto(p2)) 
		{
			System.out.println("-->Nuevo producto creado p");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto p");
		}

		
		
		
		//sillas
		Producto s1 = new Producto();
		s1.setId(3);
		s1.setTipo("Silla");
		s1.setEdificioActual(fabrica1);
		if(empre.crearProducto(s1)) 
		{
			System.out.println("-->Nuevo producto creado s");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto s");
		}

		
		
		Producto s2 = new Producto();
		s2.setId(4);
		s2.setTipo("Silla");
		s2.setEdificioActual(fabrica1);
		if(empre.crearProducto(s2)) 
		{
			System.out.println("-->Nuevo producto creado s");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto s");
		}
		
		
		
		//ventanas
		Producto v1 = new Producto();
		v1.setId(5);
		v1.setTipo("Ventana");
		v1.setEdificioActual(fabrica1);
		if(empre.crearProducto(v1)) 
		{
			System.out.println("-->Nuevo producto creado v");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto v");
		}

		
		
		Producto s3 = new Producto();
		s3.setId(6);
		s3.setTipo("Ventana");
		s3.setEdificioActual(fabrica1);
		if(empre.crearProducto(s3)) 
		{
			System.out.println("-->Nuevo producto creado v");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto v");
		}
		
		
		System.out.println("\n"+"\n"+"---PRODUCTOS CREADOS---"+"\n"+empre.estadoProductos());
		
		
		
		//VENDEMOS PRODUCTOS
		
		if(empre.venderProducto(p1)) // puerta id 1
		{
			System.out.println("1-->Producto vendido correctamente");
		}
		else
		{
			System.out.println("1-->Imposibe vender el producto");
		}
		
		if(empre.venderProducto(s1)) // silla id 3
		{
			System.out.println("1-->Producto vendido correctamente");
		}
		else
		{
			System.out.println("1-->Imposibe vender el producto");
		}
		
		
		System.out.println("\n"+"\n"+"---PRODUCTOS VENDIDOS---"+"\n"+empre.estadoProductos());//estado tras vender los dos prod
		
		
		//INTENTAMOS CREAR DOS NUEVOS PRODUCTOS
		
		Producto pnueva1 = new Producto();
		pnueva1.setId(2);
		pnueva1.setTipo("Puerta");
		pnueva1.setEdificioActual(fabrica1);
		if(empre.crearProducto(pnueva1)) 
		{
			System.out.println("-->Nuevo producto creado p");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto p");
		}
		
		Producto pnueva2 = new Producto();
		pnueva2.setId(10);
		pnueva2.setTipo("Puerta");
		pnueva2.setEdificioActual(fabrica1);
		if(empre.crearProducto(pnueva2)) 
		{
			System.out.println("-->Nuevo producto creado p");
		}
		else
		{
			System.out.println("-->Imposibe crear nuevo producto p");
		}
		
		
		System.out.println("\n"+"\n"+"---PRODUCTOS FINALES---"+"\n"+empre.estadoProductos());//estado tras intentar crear las nuevas puertas

		
		
		
		
		
		
		
		
		
		
		
		/************************************mi codigo***************************/
/*
		
		//definimos objeto tipo producto ó tipo puerta/silla/ventana e instanciamos
		
		Producto p1 = new Producto();
		p1.setId(1);//le damos su id único y lamamos a función crearObjeto() que hemos definodo en la clase empresa
		p1.setTipo("Puerta");
		empre.setPuerta1(p1);//Machacamos Puerta1 de la clase empresa con los valores que hemos modificadp para p1
		if(empre.crearProducto(p1)) 
		{
			System.out.println("Nuevo producto creado p");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto p");
		}
		
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setTipo("Puerta");
		empre.setPuerta2(p2);
		if(empre.crearProducto(p2)) 
		{
			System.out.println("Nuevo producto creado p");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto p");
		}
		
		Producto s1 = new Producto();
		s1.setId(3);
		s1.setTipo("Silla");
		empre.setSilla1(s1);
		if(empre.crearProducto(s1)) 
		{
			System.out.println("Nuevo producto creado s");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto s");
		}
		
		Producto s2 = new Producto();
		s2.setId(4);
		s2.setTipo("Silla");
		empre.setSilla2(s2);
		if(empre.crearProducto(s2)) 
		{
			System.out.println("Nuevo producto creado s");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto s");
		}
		
		Producto v1 = new Producto();
		v1.setId(5);
		v1.setTipo("Ventana");
		empre.setVentana1(v1);
		if(empre.crearProducto(v1)) 
		{
			System.out.println("Nuevo producto creado v");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto v");
		}
		
		Producto v2 = new Producto();
		v2.setId(6);
		v2.setTipo("Ventana");
		empre.setVentana1(v2);
		if(empre.crearProducto(v2)) 
		{
			System.out.println("Nuevo producto creado v");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto v");
		}
		
		//System.out.println("Es posible vender la puerta con id 1? "+empre.venderProducto(p1));
		//System.out.println("Es posible vender la puerta con id 1? "+empre.venderProducto(p1));
				
		//System.out.println("Es posible vender la silla con id 3? "+empre.venderProducto(s1));
*/
		
	/*	Producto puertaNueva1 = new Producto();
		puertaNueva1.setId(2);
		puertaNueva1.setTipo("Puerta");
		empre.setPuerta1(puertaNueva1);
		if(empre.crearProducto(puertaNueva1)) 
		{
			System.out.println("Nuevo producto nueva puerta 1");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto nueva puerta 1");
		}
		
		Producto puertaNueva2 = new Producto();
		puertaNueva2.setId(10);
		puertaNueva2.setTipo("Puerta");
		empre.setPuerta2(puertaNueva2);
		if(empre.crearProducto(puertaNueva2)) 
		{
			System.out.println("Nuevo producto creado nueva puerta 2");
		}
		else
		{
			System.out.println("Imposibe crear nuevo producto nueva puerta 2");
		}
				
*/
		System.out.println("\n"+"---VALORES DE LOS OBJETOS---"+"\n");
		System.out.println(empre.print());

		/************************************mi codigo***************************/
		
	}

}
