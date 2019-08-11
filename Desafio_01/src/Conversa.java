
public class Conversa {

	
	public static void main(String[] args) {
		
		// Lucas Nakagawa   RA: 081170037
		
		Pessoa_1 p1 = new Pessoa_1("Carlos", "Tô de boa");
		Pessoa_2 p2 = new Pessoa_2("Luiz", "Estou bem");
		
		
		System.out.println(p1.falarSaudacao(p2));
		System.out.println(p2.falarSaudacao(p1));
		
		System.out.println(p1.falarSentimento(p2));
		System.out.println(p2.falarSentimento(p1));
		
		System.out.println(p1.falarApresentacao(p2));
		System.out.println(p2.falarApresentacao(p1));
	}
}
