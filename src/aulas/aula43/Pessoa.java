package aulas.aula43;

public final class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    private String telefoneCelular;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        super();
        //ele estara se referindo ao atributo fora do metodo
        this.nome = nome;
        //ele estara se referindo ao atributo fora do metodo
        this.endereco = endereco;
        //ele estara se referindo ao atributo fora do metodo
        this.telefone = telefone;
    }

    //getNome vai puxar o nome
    public String getNome() {
        return nome;
    }
    //setNome vai dar um valor ao nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //getendereco vai puxar o endereco
    public String getEndereco() {
        return endereco;
    }
    //setendereco vai dar um valor ao endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //getTelefone vai puxar o telefone
    public String getTelefone() {
        return telefone;
    }
    //setTelefone vai dar um valor ao telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //getCpf vai puxar o cpf
    public String getCpf() {
        return cpf;
    }
    //setCpf vai dar um valor ao cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //getTelefoneCelular vai puxar o telefoneCelular
    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    //setTelefoneCelular  vai dar um valor ao telefoneCelular
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    //public abstract String obterEtiquetaEndereco();

    //public abstract void imprimirEtiquetaEndereco();
}
