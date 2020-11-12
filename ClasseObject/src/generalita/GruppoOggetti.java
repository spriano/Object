package generalita;

public class GruppoOggetti{

	public static void main(String[] args) {
		Object[] gruppo=new Object[3];
		gruppo[0]=new Persona("Paolo Rossi");
		gruppo[1]="hello World";
		gruppo[2]=45;
		
		for (Object obj: gruppo) {
			 System.out.println (obj);

		}
	}

}
