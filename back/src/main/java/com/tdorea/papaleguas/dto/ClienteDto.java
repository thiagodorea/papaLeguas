/* Classe DTO */
package com.tdorea.papaleguas.dto;

import com.tdorea.papaleguas.domain.Cliente;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ClienteDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;
    private String bairro;
    private String cep;
    private String estado;
    private String cidade;
    private Integer numero;

    private Set<PedidoDto> pedidos = new HashSet<>();

    public ClienteDto() {
    }

    public ClienteDto(Long id, String nome, String telefone, String cpf, String endereco, String bairro, String cep, String estado, String cidade, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
    }

    public ClienteDto(Cliente clienteDto) {
        id = clienteDto.getId();
        nome = clienteDto.getNome();
        endereco = clienteDto.getEndereco();
        bairro = clienteDto.getBairro();
        cep = clienteDto.getCep();
        estado = clienteDto.getEstado();
        cidade = clienteDto.getCidade();
        numero = clienteDto.getNumero();
        cpf = clienteDto.getCpf();
        telefone = clienteDto.getTelefone();
        pedidos = clienteDto.getPedido().stream().map(e -> new PedidoDto(e)).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Set<PedidoDto> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "ClienteDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                ", pedidos=" + pedidos +
                '}';
    }
}
   
   

    

    
   
