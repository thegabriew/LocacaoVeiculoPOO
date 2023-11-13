
public class Endereco {
  String rua;
  int numero;
  String bairro;
  String cidade;

  public void cadastrarEnd(String r, int n, String bai, String cid) {

    this.rua = r;
    this.numero = n;
    this.bairro = bai;
    this.cidade = cid;

  }

  public void exibirEnd(){

    System.out.println("Cidade: " + this.cidade);
    System.out.println("Rua: " +this.rua);
    System.out.println("Número: "+this.numero);
    System.out.println("Bairro: "+this.bairro);
    
  }
}
