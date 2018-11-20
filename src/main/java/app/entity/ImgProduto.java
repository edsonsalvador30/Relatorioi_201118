package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela IMGPRODUTO
 * @generated
 */
@Entity
@Table(name = "\"IMGPRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ImgProduto")
public class ImgProduto implements Serializable {

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
  @Column(name = "DescricaoImg", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricaoImg;

  /**
  * @generated
  */
  @Column(name = "ProdImagem", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] prodImagem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Produto produto;

  /**
   * Construtor
   * @generated
   */
  public ImgProduto(){
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
  public ImgProduto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricaoImg
   * return descricaoImg
   * @generated
   */
  
  public java.lang.String getDescricaoImg(){
    return this.descricaoImg;
  }

  /**
   * Define descricaoImg
   * @param descricaoImg descricaoImg
   * @generated
   */
  public ImgProduto setDescricaoImg(java.lang.String descricaoImg){
    this.descricaoImg = descricaoImg;
    return this;
  }

  /**
   * Obtém prodImagem
   * return prodImagem
   * @generated
   */
  
  public byte[] getProdImagem(){
    return this.prodImagem;
  }

  /**
   * Define prodImagem
   * @param prodImagem prodImagem
   * @generated
   */
  public ImgProduto setProdImagem(byte[] prodImagem){
    this.prodImagem = prodImagem;
    return this;
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  
  public Produto getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public ImgProduto setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ImgProduto object = (ImgProduto)obj;
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
