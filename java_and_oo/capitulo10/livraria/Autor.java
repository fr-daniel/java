package livraria;

public class Autor {
    String nome;
    String email;
    String cpf;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Autor) {
            Autor outro = (Autor) obj;
            return this.nome.equals(outro.getNome());
        }
        return false;
    }

    @Override
    public void toString() {
        return "Mostrando detalhes do autor" + "\nNome: " + nome + "\nE-mail: " + email + "\nCPF: " + cpf;
    }
}