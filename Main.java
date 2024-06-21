public class Main {
	public static void main(String[] args) {
		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		NavegadorInternet navegadorInternet = new NavegadorInternet();

		reprodutorMusical.selecionarMusica("I don't know why");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();

		aparelhoTelefonico.ligar("9999999999");
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();

		navegadorInternet.exibirPagina("https://www.example.com/");
		navegadorInternet.atualizarPagina();
		navegadorInternet.adicionarNovaAba();
	}
}
