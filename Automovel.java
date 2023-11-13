
public class Automovel {

	String placa;
	String cor;
	int ano; 
	String fuel; 
	int portas;
	double km; 
	String renavam;
	String chassi;
	double valoroc;
  Modelo mod = new Modelo();
  Marca mar = new Marca();
	

	public void cadastrar(String p, String c, int a, String comb, int portas,
			double kilom, Modelo modelo, Marca marca, String cs, double loc){
			
			this.placa = p;
			this.ano = a;
			this.cor = c;
			this.fuel = comb;
			this.km = kilom;
			this.marca = marca;
			this.modelo = modelo;
			this.chassi = cs;
			this.valorLoc = loc;
	}

  public void exibirCarro() {
    System.out.println("Sobre o carro:" );
    marc.exibirMarca();
    mod.exibirModelo();    
    System.out.println("\nPlaca: "+this.placa);
    System.out.println("Cor: "+this.cor);
    System.out.println("Ano: "+this.ano);
    System.out.println("Tipo de combustivel: "+this.fuel);
    System.out.println("Portas: "+this.portas);
    System.out.println("Quilômetros: "+this.km);
    System.out.println("Renavam: "+this.renavam);
    System.out.println("Chassi: "+this.chassi);
    System.out.println("Valor de Locação: "+this.valoroc);
  }
	
}
