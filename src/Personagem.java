public class Personagem {
    String nome;
    int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String nome() {
        return nome;
    }

    public int vida() {
        return vida;
    }

    public String atacado(Personagem personagem, int moduloDoAtaque) {
        this.vida = (personagem.vida() - moduloDoAtaque);
        System.out.println(personagem.nome() + " perde " + moduloDoAtaque + " pontos de vida!");
        System.out.println(nome + " agora possui " + (vida) + " pontos de vida.");
        if (personagem.vida() == 0) {
            System.out.println(personagem.nome() + " é derrotado.");
        }
        return null; 
    }
}
