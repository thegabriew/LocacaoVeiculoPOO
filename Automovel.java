
public class Automovel {

	String placa;
	String cor;
	int ano; 
	String fuel; 
	int portas;
	double km; 
	String renavam;
	String chassi;
	double valorLoc;

	
	Modelo modelo = new Modelo();
	Marca marca = new Marca();
	
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
	
}
