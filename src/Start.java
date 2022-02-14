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
		vGas.frenar(20.0f);//le pasamos el valor a la funci�n
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
		System.out.println("\n"+"El coste de pintar la f�brica es de : "+"\n"+coste+" �");
		
		Oficina oficina1 = new Oficina();
		oficina1.setAnchura(15.0f);
		oficina1.setProfundidad(20.0f);
		oficina1.setPrecio(56000.0f);
		
		System.out.println("\n"+"\n"+"\n");
		
		//estado inicial de los productos
		System.out.println("---ESTADO INICIAL PRODUCTOS---"+"\n"+empre.estadoProductos());
		
		
		//creamos los productos (puertas)
		Producto p1 = new Producto();
		p1.setId(1);//le damos su id �nico y llamamos a funci�n crearProducto() que hemos definodo en la clase empresa
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
		System.out.println("\n"+"---VALORES DE LOS OBJETOS---"+"\n");
		System.out.println(empre.print());

		/************************************mi codigo***************************/
		
	}

}
