package model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int estoque;
    private double preco;

    public Livro() {}

    public Livro(int id, String titulo, String autor, int estoque, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.estoque = estoque;
        this.preco = preco;
    }

  
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}

