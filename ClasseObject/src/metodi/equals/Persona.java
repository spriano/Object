package metodi.equals;

public class Persona {
	String nome;
	public Persona(String nome) {
		this.nome =nome;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "nome=" + nome ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Persona)) {
			return false;
		}
		Persona other=(Persona)obj;
		return this.nome.equals(other.nome);
	}
	
	
}
