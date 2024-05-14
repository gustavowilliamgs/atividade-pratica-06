// Classe para representar os alunos
public class Aluno {
    private String registroAcademico;
    private String cpf;
    private String nome;
    private String telefone;

    public Aluno(String registroAcademico, String cpf, String nome, String telefone) {
        this.registroAcademico = registroAcademico;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
