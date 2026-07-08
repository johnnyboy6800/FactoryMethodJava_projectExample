package factory_method;

public class PessoaJuridicaFactory implements FactoryInterface {

	@Override
	public Pessoa criar_pessoa(String nome, int idade, String genero, String cnpj) {
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome(nome);
		pj.setIdade(idade);
		pj.setGenero(genero);
		pj.setCnpj(cnpj);
		
		
		return pj;
	}

}
