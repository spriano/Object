package generalita;

public class Main {

	public static void main(String[] args) {
		Object o =new Persona("Paolo Rossi"); // upcast al riferimento Object
		Persona p1=(Persona)o; // per usare il metodo getNome()di Persona 
		                       //bisogna fare il downcast
		System.out.println(p1.getNome());
	}

}
