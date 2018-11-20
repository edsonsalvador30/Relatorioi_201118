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
@Repository("ClienteDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClienteDAO extends JpaRepository<Cliente, java.lang.String> {

  /**
   * Obtém a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cliente entity WHERE entity.id = :id")
  public Cliente findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cliente utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cliente entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


      
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id AND (:search = :search)")
  public Page<Pedido> findPedidoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id AND (:dataEntrega is null OR entity.dataEntrega = :dataEntrega)")
  public Page<Pedido> findPedidoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="dataEntrega") java.util.Date dataEntrega, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.cliente.id = :id")
  public Page<Pedido> findPedido(@Param(value="id") java.lang.String id, Pageable pageable);

}
