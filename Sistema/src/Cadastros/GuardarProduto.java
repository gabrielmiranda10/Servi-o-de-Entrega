/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class GuardarProduto {
    private String Nome;
    private String Descricao;
    private String Residencia;
    private String Proprietario;
    private String Valor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
    }

    

   
    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }
    
    /**
     *
     * @return
     */
    public String guardar(){
        try {
            FileWriter f = new FileWriter("GuardarProduto.txt", true);
            PrintWriter p = new PrintWriter(f);
            p.println("Nome Prod:" + this.Nome);
            p.println("Proprietario do Produto" + this.Proprietario);
            p.println("descricao" +this.Descricao);
            p.println("Residencia"+ this.Residencia); 
            p.println();
            p.flush();
            p.close();
            f.close();
        
        } catch (IOException ex) {
            Logger.getLogger(GuardarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }    
            return "Cadastro de Produto guardado";

    }
}
