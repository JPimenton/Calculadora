package es.aytos.main.server;


public class CalculadoraSkeleton {

	
	public es.aytos.main.SumarResponse sumar(es.aytos.main.Sumar sumar) {
		es.aytos.main.SumarResponse response = new es.aytos.main.SumarResponse();
		response.set_return(sumar.getArgs0() + sumar.getArgs1());
		return response;

	}
	
	
}
