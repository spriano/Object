package metodi.equals;

public class Main {

	public static void main(String[] args) {
		Persona p=new Persona("Paolo Rossi");
		Persona p1=new Persona("Paolo Rossi");
		System.out.println(p.equals(p1));
	}

}
