   /* Classe  de entidade pedido */
   package com.tdorea.papaleguas.domain;

   import javax.persistence.*;
   import java.io.Serializable;
   import java.util.Date;

   @Entity
   @Table(name = "pedido")
   public class Pedido implements Serializable {

       private static final long serialVersionUID = 1L;
       /* Mapeamento de classe */
       @Id
       @Column(name = "id_pedido")
       private Long id;

       @Column(name = "data_postagem")
       private Date postagem;

       @Column(name = "data_transporte")
       private Date transporte;

       @Column(name = "data_entrega")
       private Date entrega;

       @Column(name = "observacao")
       private String observacao;

       @ManyToOne
       @JoinColumn(name = "id_cliente")
       private Cliente cliente;

       public Pedido() {
       }

       public Pedido(Long id, Date postagem, Date transporte, Date entrega, String observacao, Cliente cliente) {
           this.id = id;
           this.postagem = postagem;
           this.transporte = transporte;
           this.entrega = entrega;
           this.observacao = observacao;
           this.cliente = cliente;
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

       public Cliente getCliente() {
           return cliente;
       }

       public void setCliente(Cliente cliente) {
           this.cliente = cliente;
       }

       @Override
       public String toString() {
           return "Pedido{" +
                   "id=" + id +
                   ", postagem=" + postagem +
                   ", transporte=" + transporte +
                   ", entrega=" + entrega +
                   ", observacao='" + observacao + '\'' +
                   ", cliente=" + cliente +
                   '}';
       }
   }

