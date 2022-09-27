/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floreve;

import java.util.Date;

/**
 *
 * @author kaique
 */
public class fornecimentoProduto {
    int id, idFornecedor, idProduto;
    String data;

    public void setId(int id) {
        this.id = id;
    }

    
    public void setData(String data) {
        this.data = data;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getData() {
        return data;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getId() {
        return id;
    }
    
    
}
