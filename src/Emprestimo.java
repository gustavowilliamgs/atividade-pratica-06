import java.util.ArrayList;
import java.util.Calendar;

// Definição da classe Emprestimo
public class Emprestimo {
    private int idEmprestimo;
    private Aluno aluno;
    private ArrayList<Livro> livros;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucaoPrevista;
    private boolean devolvido;

    // Construtor da classe Emprestimo, utilizado para inicializar os atributos da classe
    public Emprestimo(int idEmprestimo, Aluno aluno, ArrayList<Livro> livros, Calendar dataEmprestimo,
            Calendar dataDevolucaoPrevista, boolean devolvido) {
        this.idEmprestimo = idEmprestimo;
        this.aluno = aluno;
        this.livros = livros;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.devolvido = devolvido;
    }

    // Método para imprimir os empréstimos de todos os alunos
    public static void imprimeEmprestimosRegistroAcademico(ArrayList<Emprestimo> listaEmprestimos) {
        for (Emprestimo emprestimo : listaEmprestimos) {
            System.out.print("\n");
            System.out.println("Registro Acadêmico: " + emprestimo.aluno.getRegistroAcademico());
            System.out.println("Nome: " + emprestimo.aluno.getNome());
            System.out.println("Data Prevista para Devolução: " + emprestimo.dataDevolucaoPrevista.getTime());
            System.out.println("Já foi devolvido?: " + emprestimo.isDevolvido());
            System.out.println("Livros incluídos no empréstimo: ");

            for (Livro nomeLivro : emprestimo.getLivros()) {
                System.out.println(nomeLivro.getTitulo());
            }
            System.out.print("\n");
        }
    }

    // Método para imprimir os detalhes do empréstimo de um único aluno
    public static void imprimeEmprestimosRegistroAcademico(Emprestimo emprestimo) {
        System.out.print("\n");
        System.out.println("Registro Acadêmico: " + emprestimo.aluno.getRegistroAcademico());
        System.out.println("Nome: " + emprestimo.aluno.getNome());
        System.out.println("Data Prevista para Devolução: " + emprestimo.dataDevolucaoPrevista.getTime());
        System.out.println("Já foi devolvido?: " + emprestimo.isDevolvido());
        System.out.println("Livros incluídos no empréstimo: ");

        for (Livro nomeLivro : emprestimo.getLivros()) {
            System.out.println(nomeLivro.getTitulo());
        }
        System.out.print("\n");
    }

    // Método para verificar empréstimos em atraso
    public static void emprestimosAtrasados(Emprestimo emprestimo, Calendar dataEmprestimo) {
        // Verifica se a data de devolução prevista é anterior à data atual e se o livro não foi devolvido
        if (emprestimo.dataDevolucaoPrevista.before(dataEmprestimo) && !emprestimo.devolvido) {
            System.out.print("\n");
            System.out.println("Emprestimos em atraso");
            System.out.print("\n");
            System.out.println("Registro Acadêmico: " + emprestimo.aluno.getRegistroAcademico());
            System.out.println("Nome: " + emprestimo.aluno.getNome());
            System.out.println("Data Prevista para Devolução: " + emprestimo.dataDevolucaoPrevista.getTime());
            System.out.println("Livros incluídos no empréstimo: ");

            for (Livro nomeLivro : emprestimo.getLivros()) {
                System.out.println(nomeLivro.getTitulo());
            }
            System.out.print("\n");
        } else {
            System.out.println("Não há livros com datas de devolução atrasadas");
        }
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Calendar getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
}
