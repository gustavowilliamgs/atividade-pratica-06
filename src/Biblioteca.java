import java.util.ArrayList;
import java.util.Calendar;

public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno(
            "20212006560",
            "159.42.079-84", "Gustavo",
            "(31) 9 9733-4195"
        );

        Aluno aluno2 = new Aluno(
            "20212006560",
            "959.942.079-84", "Ibirité",
            "(31) 9 9999-9999"
        );

        Livro livro1 = new Livro(
            0,
            "Como Progarmar em Java",
            "João Rodrigues da Cruz",
            "CefetEdições",
            null
        );

        Livro livro2 = new Livro(
            1,
            "Como Progarmar em Python",
            "Fabricio Antônio",
            "CefetEdições",
            null
        );

        ArrayList<Livro> listaLivros1 = new ArrayList<Livro>();
        listaLivros1.add(livro1);
        listaLivros1.add(livro2);

        Calendar dataEmprestimo = Calendar.getInstance();
        Calendar dataDevolucao = Calendar.getInstance();

        dataDevolucao.add(Calendar.DAY_OF_MONTH, 7);

        Emprestimo emp1 = new Emprestimo(0, aluno1, listaLivros1, dataEmprestimo, dataDevolucao, false);
        Emprestimo emp2 = new Emprestimo(0, aluno2, listaLivros1, dataEmprestimo, dataDevolucao, true);
        
        ArrayList<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>();
        listaEmprestimos.add(emp1);
        listaEmprestimos.add(emp2);

        Emprestimo.imprimeEmprestimosRegistroAcademico(listaEmprestimos);
        Emprestimo.imprimeEmprestimosRegistroAcademico(emp1);
        Emprestimo.emprestimosAtrasados(emp1, dataEmprestimo);

        // Teste para emprestimos em atraso
        Calendar dataTeste = Calendar.getInstance();
        dataTeste.add(Calendar.DAY_OF_MONTH, 9);
        Emprestimo.emprestimosAtrasados(emp1, dataTeste);
    }
}
