/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import User.cadastroUser;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class controlaUser {

    private ArrayList<cadastroUser> users = new ArrayList<>();

    public boolean salvar(cadastroUser v) {
        if (v != null) {
            users.add(v);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<cadastroUser> retornar() {
        return users;
    }

    public boolean verificarLogin(String email, String senha) {
        for (cadastroUser usuario : users) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return true; 
            }
        }
        return false;
    }

}
