package aulas.aula38;

public class Pessoa {

    //o nome é uma variavel string
    private String nome;
    //o endereco é uma variavel string
    private String endereco;
    //o telefone é uma variavel string
    private String telefone;
    //o curso é uma variavel string
    private String cpf;
    //o telefoneCelular é uma variavel string
    private String telefoneCelular;
    public Pessoa() {}

    //ele estara se referindo ao atributo fora do metodo
    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
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


}
