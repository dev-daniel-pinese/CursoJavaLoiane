package aulas.aula39;

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
    //o nomeVisibilidade é uma variavel do tipo string
    protected String nomeVisibilidade;
    //um construto padra que recebe o nomeVisibilidade que recebe sdfsdfsdf
    public Pessoa() {
        nomeVisibilidade = "sdfsdfsfsdf";
    }

    //ele estara se referindo ao atributo fora do metodo
    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getNomeVisibilidade() {
        return nomeVisibilidade;
    }

    public void setNomeVisibilidade(String nomeVisibilidade) {
        this.nomeVisibilidade = nomeVisibilidade;
    }
}
