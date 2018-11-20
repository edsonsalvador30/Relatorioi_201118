package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDO
 * @generated
 */
@Entity
@Table(name = "\"PEDIDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pedido")
public class Pedido implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DataEntrega", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataEntrega;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cliente cliente;

  /**
   * Construtor
   * @generated
   */
  public Pedido(){
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
  public Pedido setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Pedido setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém dataEntrega
   * return dataEntrega
   * @generated
   */
  
  public java.util.Date getDataEntrega(){
    return this.dataEntrega;
  }

  /**
   * Define dataEntrega
   * @param dataEntrega dataEntrega
   * @generated
   */
  public Pedido setDataEntrega(java.util.Date dataEntrega){
    this.dataEntrega = dataEntrega;
    return this;
  }

  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  
  public Cliente getCliente(){
    return this.cliente;
  }

  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public Pedido setCliente(Cliente cliente){
    this.cliente = cliente;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pedido object = (Pedido)obj;
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
