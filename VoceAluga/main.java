import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Cliente clienteTeste = new Cliente(1542840872, 997126585, 1, "eu", null, 123456789, 987654321);
		clienteTeste.PrintaDados();
		clienteTeste.AlugaCarro("placa do carro");
		clienteTeste.PrintaDados();
		
		
		ArrayList<Object> novosDados = new ArrayList<Object>();
		
		// 0 = String nome, 1 = int cpf, 2 = int contato, 3 = int endereco, 4 = Date dataDeNascimento
		// 5 = int cartao, 6 = int habilitacao, 7 = string carroAlugado
		novosDados.add("outra pessoa");
		novosDados.add(12365478);
		novosDados.add(22223333);
		novosDados.add(3);
		novosDados.add(null);
		novosDados.add(12344321);
		novosDados.add(123456);
		novosDados.add("outro carro");
		
		clienteTeste.AtualizaDados(novosDados);
		clienteTeste.PrintaDados();
		
	}
		
}
