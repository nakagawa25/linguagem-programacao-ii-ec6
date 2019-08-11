
public class Pessoa_2 extends Humano{

	public Pessoa_2(String nome, String sentimento) {
		SetNome(nome);
		SetSentimento(sentimento);
	}
	
	@Override
	public String falarSaudacao(Humano pessoa) {
		return "Ol�, tudo bem? Sou o " + GetNome() + ".";
	}

	@Override
	public String falarSentimento(Humano pessoa) {
		return GetSentimento() + " e voc� " + pessoa.GetNome() + ", como est�?";
	}

	@Override
	public String falarApresentacao(Humano pessoa) {
		return "O prazer � todo meu " + pessoa.GetNome() + " !";
	}

}
