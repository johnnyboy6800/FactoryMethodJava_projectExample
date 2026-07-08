package factory_method;

public class Main {
	public static void main(String[]args) {
		FactoryInterface cf = new PessoaFisicaFactory();
		Pessoa pessoa = cf.criar_pessoa("Andressa", 25, "mulher", "754.654.456-66");
		System.out.println(pessoa.getNome() + " " + pessoa.getIdade() + " " + pessoa.getGenero());
	}
}
