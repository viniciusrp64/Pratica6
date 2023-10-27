package Ex3;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Cria 10 objetos da classe Artigo
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            artigos.add(new Artigo("Artigo " + i, "Resumo do artigo " + i, "Autor do artigo " + i));
        }

        // Cria um objeto da classe Edicao e adiciona todos os artigos
        Edicao edicao = new Edicao(1, 1, "27/10/2023", 1000);
        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        // Cria um objeto da classe RevistaCientifica e adiciona a edição
        RevistaCientifica revista = new RevistaCientifica("Revista Científica", 1234567890L, "Mensal", edicao);
    }
}
