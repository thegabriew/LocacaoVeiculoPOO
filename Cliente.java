
public class Cliente {
	String nome;
	String cpf;
	String endereco;
	int telefone;
  Endereco end = new Endereco ();

  public void cadastrarCliente(String n, String cpf, String end, int tel){
    this.nome = n;
    this.cpf = cpf;
    this.endereco = end;
    this.telefone = tel;
}

  public void exibirCLiente(){
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Telefone: " + this.telefone); 
    end.exibirEnd();
    
  }
}
