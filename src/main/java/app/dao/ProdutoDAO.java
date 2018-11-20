package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ProdutoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProdutoDAO extends JpaRepository<Produto, java.lang.String> {

  /**
   * Obtém a instância de Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produto entity WHERE entity.id = :id")
  public Produto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ImgProduto entity WHERE entity.produto.id = :id")
  public Page<ImgProduto> findImgProduto(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Produto entity WHERE entity.descricaoProduto like concat('%',coalesce(:search,''),'%')")
  public Page<Produto> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Produto entity WHERE (:descricaoProduto is null OR entity.descricaoProduto like concat('%',:descricaoProduto,'%')) AND (:quantidade is null OR entity.quantidade = :quantidade) AND (:valor is null OR entity.valor = :valor) AND (:disponivel is null OR entity.disponivel = :disponivel) AND (:garantia is null OR entity.garantia = :garantia)")
  public Page<Produto> specificSearch(@Param(value="descricaoProduto") java.lang.String descricaoProduto, @Param(value="quantidade") java.lang.Integer quantidade, @Param(value="valor") java.lang.Double valor, @Param(value="disponivel") java.lang.Boolean disponivel, @Param(value="garantia") java.util.Date garantia, Pageable pageable);
  
  /**
   * Foreign Key pedido
   * @generated
   */
  @Query("SELECT entity FROM Produto entity WHERE entity.pedido.id = :id")
  public Page<Produto> findProdutosByPedido(@Param(value="id") java.lang.String id, Pageable pageable);

}
