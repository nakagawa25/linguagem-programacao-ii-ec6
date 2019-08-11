
public abstract class Humano {
	
	private String Nome;
	
	public void SetNome(String nome) {
		Nome = nome;
	}
	
	public String GetNome() {
		return Nome;
	}
	
	
	private String Sentimento;
	
	public void SetSentimento(String sentimento) {
		Sentimento = sentimento;
	}
	
	public String GetSentimento() {
		return Sentimento;
	}
	
	
	public abstract String falarSaudacao(Humano pessoa);
	
	public abstract String falarSentimento(Humano pessoa);
	
	public abstract String falarApresentacao(Humano pessoa);
}
