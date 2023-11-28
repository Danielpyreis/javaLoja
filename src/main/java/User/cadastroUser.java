/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.time.LocalDate;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel
 */
public class cadastroUser {

    private String endereco;
    private LocalDate dataNascimento;
    private String nome;
    private Long telefone;
    private Long CPF;
    private String senha;
    private int compras;
    private String produto;
    private String email;

    public cadastroUser(String nome, String telefone, String CPF, String senha, String compras, String produto, String email, String endereco, String dataNascimento) {

        this.nome = nome;
        this.telefone = Long.valueOf(telefone);
        this.CPF = Long.valueOf(CPF);
        this.senha = senha;
        this.compras = Integer.parseInt(compras);
        this.produto = produto;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }

   
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
     * @return the telefone
     */
    public Long getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the CPF
     */
    public Long getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the compras
     */
    public int getCompras() {
        return compras;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(int compras) {
        this.compras = compras;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validarEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    private boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]";
        return Pattern.matches(regex, email);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
