package metodi.haschCode;

public class Main {

	public static void main(String[] args) {
		Persona p=new Persona("Paolo Rossi");
		Persona p1=new Persona("Paolo Rossi");
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}

}
