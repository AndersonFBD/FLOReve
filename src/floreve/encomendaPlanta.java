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
public class encomendaPlanta {
    int id, idCliente, idPlanta;
    String data;

    public void setData(String data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public String getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdPlanta() {
        return idPlanta;
    }
    
    
}
