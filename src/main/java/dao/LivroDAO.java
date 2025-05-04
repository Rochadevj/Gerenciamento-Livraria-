package dao;

import java.sql.*;
import java.util.*;
import model.Conexao;
import model.Livro;

public class LivroDAO {

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, estoque, preco) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getEstoque());
            stmt.setDouble(4, livro.getPreco());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> listar() {
        List<Livro> lista = new ArrayList<>();
        String sql = "SELECT * FROM livros";

        try (Connection conn = Conexao.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setEstoque(rs.getInt("estoque"));
                livro.setPreco(rs.getDouble("preco"));

                lista.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


}

