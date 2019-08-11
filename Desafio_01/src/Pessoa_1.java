

public class Pessoa_1 extends Humano {

	public Pessoa_1(String nome, String sentimento) {
		SetNome(nome);
		SetSentimento(sentimento);
	}
	

	@Override
	public String falarSaudacao(Humano pessoa) {
		return "Coé, eu sou o " + GetNome() + ", quem é você?";
	}

	@Override
	public String falarSentimento(Humano pessoa) {
		return GetSentimento() + " e ae " + pessoa.GetNome() + " ?";
	}

	@Override
	public String falarApresentacao(Humano pessoa) {
		return "Eu estou bem " + pessoa.GetNome() + ", prazer em te conhecer.";
	}

}
