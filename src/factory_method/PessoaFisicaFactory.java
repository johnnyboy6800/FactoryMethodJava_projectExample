package factory_method;

public class PessoaFisicaFactory implements FactoryInterface {

	@Override
	public Pessoa criar_pessoa(String nome, int idade, String genero, String cpf) {
		// TODO Auto-generated method stub
		PessoaFisica p = new PessoaFisica();
		p.setNome(nome);
		p.setIdade(idade);
		p.setGenero(genero);
		p.setCpf(cpf);
		
		return p;
	}

}
