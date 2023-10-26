import java.time.LocalDateTime;

public class Locacao {
	Automovel c;
	LocalDateTime dataLoc;
	LocalDateTime dataDev;
	double valor;
	Cliente cliente;
	
	public void imprimirLocacao(){
		System.out.println("*** LOCACÇÃO ***");
		System.out.println("Modelo: " + this.c.modelo);
		System.out.println("Placa: " + this.c.placa);
		System.out.println("Cor: " + this.c.cor);
		System.out.println("Ano: " + this.c.ano);
		System.out.println("Cliente: " + this.cliente.nome);
		System.out.println("Data de Locação: " + this.dataLoc.toString());
		System.out.println("Data de Devoluçõ: " + this.dataDev.toString());
		System.out.println("Valor a ser pago: " + this.valor);
	}
}
