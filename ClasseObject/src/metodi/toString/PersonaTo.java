package metodi.toString;

public class PersonaTo {
	String nome;
	public PersonaTo(String nome) {
		this.nome =nome;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "nome=" + nome ;
	}
	
}
