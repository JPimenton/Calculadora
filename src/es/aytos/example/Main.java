package es.aytos.example;
import es.aytos.main.client.CalculadoraStub;
import es.aytos.main.client.CalculadoraStub.*;


public class Main {

 public static void main(String[] args) throws Exception {
 CalculadoraStub stub = new CalculadoraStub();
 
 Sumar operacionsuma = new Sumar();
 SumarResponse response1 = null;
 // Establecemos los parámetros de la operación
 operacionsuma.setArgs0(100);
 operacionsuma.setArgs1(200);
 // Invocamos el WS
 response1 = stub.sumar(operacionsuma);
 // Mostramos el resultado
 System.out.println(response1.get_return());
 
 Restar operacionresta = new Restar();
 RestarResponse response2 = null;
 // Establecemos los parámetros de la operación
 operacionresta.setArgs0(200);
 operacionresta.setArgs1(100);
 // Invocamos el WS
 response2 = stub.restar(operacionresta);
 // Mostramos el resultado
 System.out.println(response2.get_return());

 Multiplicar operacionmulti = new Multiplicar();
 MultiplicarResponse response3 = null;
 // Establecemos los parámetros de la operación
 operacionmulti.setArgs0(100);
 operacionmulti.setArgs1(2);
 // Invocamos el WS
 response3 = stub.multiplicar(operacionmulti);
 // Mostramos el resultado
 System.out.println(response3.get_return());
 
 Dividir operaciondiv = new Dividir();
 DividirResponse response4 = null;
 // Establecemos los parámetros de la operación
 operaciondiv.setArgs0(200);
 operaciondiv.setArgs1(200);
 // Invocamos el WS
 response4 = stub.dividir(operaciondiv);
 // Mostramos el resultado
 System.out.println(response4.get_return());
 }
}