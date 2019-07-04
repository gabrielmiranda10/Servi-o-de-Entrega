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
public class Clientes {
    private String Nome;
    private String Apelido;
    private String Telef;
    private String BI;
    private String Email;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getTelef() {
        return Telef;
    }

    public void setTelef(String Telef) {
        this.Telef = Telef;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
public String Guardar(){
        try {
            FileWriter fw = new FileWriter("Clientes.txt", true);
            PrintWriter pw =new PrintWriter(fw);
            pw.println("Nome:"+ this.Nome);
            pw.println("Aplido:"+ this.Apelido);
            pw.println("Telefone:"+ this.Telef);
            pw.println("BI:"+ this.BI);
            pw.println("E_mail:"+ this.Email);
            pw.println();
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "Cliente Cadastrado com sucesso";
}

}
