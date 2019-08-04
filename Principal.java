package aula1;

public class Principal {
	
	public static void main (String args[]) {
		
		Lista a = new Lista();
		a.setIdade(19);
		a.setNome("Aline");
		a.setPeso(55);
		a.setSenha(2);
		
		Lista b = new Lista("Ted", 18, 63, 4);
		
		System.out.println("Valor de referencia do objeto a:" +a);
		System.out.println();
		System.out.println("Valor de referencia do objeto b:" +b);
		System.out.println();
		
		a.mostraReferencia();
        System.out.println();
        b.mostraReferencia();
        
        System.out.println();
        System.out.println("Dados do objeto a");
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Peso : " + a.getPeso());
        System.out.println("Senha: " + a.getSenha());

        System.out.println();

        System.out.println();
        System.out.println("Dados do objeto b");
        System.out.println("Idade: " + b.getIdade());
        System.out.println("Nome: " + b.getNome());
        System.out.println("Peso : " + b.getPeso());
        System.out.println("Senha: " + b.getSenha());
	}
}
