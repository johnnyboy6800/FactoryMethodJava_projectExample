package factory_method;

public interface FactoryInterface  {
	
	Pessoa criar_pessoa(String nome, int idade, String genero, String documento);
	
}