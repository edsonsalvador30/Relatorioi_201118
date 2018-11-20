package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produto")
public class Produto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "DescricaoProduto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricaoProduto;

  /**
  * @generated
  */
  @Column(name = "Quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer quantidade;

  /**
  * @generated
  */
  @Column(name = "Valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Column(name = "Disponivel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean disponivel;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "Garantia", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date garantia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Produto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricaoProduto
   * return descricaoProduto
   * @generated
   */
  
  public java.lang.String getDescricaoProduto(){
    return this.descricaoProduto;
  }

  /**
   * Define descricaoProduto
   * @param descricaoProduto descricaoProduto
   * @generated
   */
  public Produto setDescricaoProduto(java.lang.String descricaoProduto){
    this.descricaoProduto = descricaoProduto;
    return this;
  }

  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  
  public java.lang.Integer getQuantidade(){
    return this.quantidade;
  }

  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public Produto setQuantidade(java.lang.Integer quantidade){
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Produto setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém disponivel
   * return disponivel
   * @generated
   */
  
  public java.lang.Boolean getDisponivel(){
    return this.disponivel;
  }

  /**
   * Define disponivel
   * @param disponivel disponivel
   * @generated
   */
  public Produto setDisponivel(java.lang.Boolean disponivel){
    this.disponivel = disponivel;
    return this;
  }

  /**
   * Obtém garantia
   * return garantia
   * @generated
   */
  
  public java.util.Date getGarantia(){
    return this.garantia;
  }

  /**
   * Define garantia
   * @param garantia garantia
   * @generated
   */
  public Produto setGarantia(java.util.Date garantia){
    this.garantia = garantia;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public Produto setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
