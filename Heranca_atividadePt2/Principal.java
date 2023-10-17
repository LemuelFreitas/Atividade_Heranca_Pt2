package Heranca_atividadePt2;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto(1,"exemplo_de_Produto",999.99);
		System.out.println("\nProduto: ");
		System.out.println("id: " + produto.getId());
		System.out.println("nome: " + produto.getNome());
		System.out.println("preco: " + produto.getPreco());
		
		Sorvete sorvete = new Sorvete(1,"exemplo_de_Sorvete",999.99,0);
		System.out.println("\nSorvete: ");
		System.out.println("id: " + sorvete.getId());
		System.out.println("nome: " + sorvete.getNome());
		System.out.println("preco: " + sorvete.getPreco());
		System.out.println("Temperatura: " + sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa(1,"exemplo_de_Camisa",999.99,"branco","algodão","36");
		System.out.println("\nCamisa: ");
		System.out.println("id: " + camisa.getId());
		System.out.println("nome: " + camisa.getNome());
		System.out.println("preco: " + camisa.getPreco());
		System.out.println("cor: " + camisa.getCor());
		System.out.println("tecido: " + camisa.getTecido());
		System.out.println("tamanho: " + camisa.getTamanho());
		
		
	}

}
