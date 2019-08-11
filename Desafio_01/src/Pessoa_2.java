
public class Pessoa_2 extends Humano{

	public Pessoa_2(String nome, String sentimento) {
		SetNome(nome);
		SetSentimento(sentimento);
	}
	
	@Override
	public String falarSaudacao(Humano pessoa) {
		return "Olá, tudo bem? Sou o " + GetNome() + ".";
	}

	@Override
	public String falarSentimento(Humano pessoa) {
		return GetSentimento() + " e você " + pessoa.GetNome() + ", como está?";
	}

	@Override
	public String falarApresentacao(Humano pessoa) {
		return "O prazer é todo meu " + pessoa.GetNome() + " !";
	}

}
