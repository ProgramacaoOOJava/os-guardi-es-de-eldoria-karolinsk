public class Main {
  public static void main(String[] args) {
    FichaPersonagem heroi1 = new FichaPersonagem("Arthus", "Guerreiro", 1, 100, 10.5);
    FichaPersonagem heroi2 = new FichaPersonagem("Arthemis", "Arqueira", 12, 150, 12.5);

    heroi1.exibirStatus();
    heroi2.exibirStatus();
  }
}