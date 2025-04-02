package com.Model;

import java.sql.SQLException;

public interface ILoginModel {
    
    boolean checkLogin(String name, String password);
    
    
    void listarUsuarios();
    
   
    void close() throws SQLException;
}
