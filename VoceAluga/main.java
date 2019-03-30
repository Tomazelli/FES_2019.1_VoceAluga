import java.util.ArrayList;

public class main {
	
	//metodo basico de teste para busca de cartoes
	public static Cartao BuscaCartao(ArrayList<Cartao> cartoes, long cartao){
		for (int i = 0; i<cartoes.size(); i++) {
			//System.out.println(cartoes.get(i).getNumero());
			//System.out.println(clienteTeste.ConsultaDados().get(5));
			//System.out.println((int)clienteTeste.ConsultaDados().get(5));
			if (cartoes.get(i).getNumero() == cartao ) {
				return cartoes.get(i);
			}
		}
		
		return new Cartao(0,0,"inexistente");
	}

	public static void main(String[] args) {
		
		//criando cliente teste
		
		Cliente clienteTeste = new Cliente("eu", 1542840872, 997126585, 1, null, 123456789, 987654321);
		clienteTeste.PrintaDados();
		
		//testando aluguel de carro
		clienteTeste.AlugaCarro("placa do carro");
		clienteTeste.PrintaDados();
		
		//criando cartoes
		Cartao cartaoTeste = new Cartao(123456789, 4564, "fulano de tal");
		Cartao cartaoTeste2 = new Cartao(12344321, 4564, "ciclano de tal");
		
		//criando lista com cartoes criados
		ArrayList<Cartao> cartoes = new ArrayList<Cartao>();
		cartoes.add(cartaoTeste);
		cartoes.add(cartaoTeste2);

		//verificando dados do cartao
		BuscaCartao(cartoes,(long) clienteTeste.ConsultaDados().get(5)).PrintaCartao();	

		
		//atualizando dados pessoais
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
		
		
		//atualizando e verificando mudancas
		clienteTeste.AtualizaDados(novosDados);
		clienteTeste.PrintaDados();
		
		//buscando novo cartao
		BuscaCartao(cartoes,(int) clienteTeste.ConsultaDados().get(5)).PrintaCartao();	
		
		
		//buscando cartao inexistente
		BuscaCartao(cartoes,123456).PrintaCartao();	
				
		
	}
		
}
