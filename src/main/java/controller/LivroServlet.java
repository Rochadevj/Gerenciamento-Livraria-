package controller;

import dao.LivroDAO;
import model.Livro;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LivroServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        int estoque = Integer.parseInt(request.getParameter("estoque"));
        double preco = Double.parseDouble(request.getParameter("preco"));

        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setEstoque(estoque);
        livro.setPreco(preco);

        LivroDAO dao = new LivroDAO();
        dao.inserir(livro);

        response.sendRedirect("livro_sucesso.html");
    }
}
