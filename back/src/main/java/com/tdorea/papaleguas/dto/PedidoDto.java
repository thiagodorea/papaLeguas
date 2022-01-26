/* Classe DTO */
package com.tdorea.papaleguas.dto;

import com.tdorea.papaleguas.domain.Pedido;

import java.io.Serializable;
import java.util.Date;

public class PedidoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date postagem;
    private Date transporte;
    private Date entrega;
    private String observacao;

    public PedidoDto() {
    }

    public PedidoDto(Long id, Date postagem, Date transporte, Date entrega, String observacao) {
        this.id = id;
        this.postagem = postagem;
        this.transporte = transporte;
        this.entrega = entrega;
        this.observacao = observacao;
    }

    public PedidoDto(Pedido pedidoDto) {
        id = pedidoDto.getId();
        postagem = pedidoDto.getPostagem();
        transporte = pedidoDto.getTransporte();
        entrega = pedidoDto.getEntrega();
        observacao = pedidoDto.getObservacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPostagem() {
        return postagem;
    }

    public void setPostagem(Date postagem) {
        this.postagem = postagem;
    }

    public Date getTransporte() {
        return transporte;
    }

    public void setTransporte(Date transporte) {
        this.transporte = transporte;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "PedidoDto{" +
                "id=" + id +
                ", postagem=" + postagem +
                ", transporte=" + transporte +
                ", entrega=" + entrega +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
