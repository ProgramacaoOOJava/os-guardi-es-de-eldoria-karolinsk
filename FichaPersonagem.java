public class FichaPersonagem {
  String nome;
  String classe;
  int nivel;
  int pontosDeVida;
  double poderBase;

  public FichaPersonagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
    this.nome = nome;
    this.classe = classe;
    this.nivel = nivel;
    this.pontosDeVida = pontosDeVida;
    this.poderBase = poderBase;
  }

  public void exibirStatus() {
    System.out.println("--- Status do Personagem ---" + "\n" + "Nome: " + nome + "\n" + "Classe: " + classe + "\n"
        + "Nível: " + nivel + "\n" +
        "Pontos de Vida: " + pontosDeVida + "\n" + "Poder Base: " + poderBase);

  }
}
