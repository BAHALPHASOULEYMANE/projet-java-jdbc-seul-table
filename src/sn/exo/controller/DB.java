package sn.exo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    //Pour la connextion
    private Connection cnx ;
    //Pour les requettes preparees
    private PreparedStatement ptsm ;
    //Pour les requettes de consultation SELECT
    private ResultSet rs ;
    //Pour les requettes de mises a jour (INSERT , INTO , UPDATE , DELETE )
    private int ok ;

    //Methodes d'ouverture de la connection
    public Connection getConnextion()
    {
        //Parametres de connexion
        String url = "jdbc:mysql://localhost:3306/testeurjdbc" ;
        String user = "root" ;
        String password = "" ;
        try {
            //Chargement du pilote
            Class.forName("com.mysql.jdbc.Driver") ;
            //Ouverture de la connextion
            cnx = DriverManager.getConnection(url , user , password ) ;
            System.out.println("La connextion est reussite !");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  cnx ;
    }
    //
    public void initPrepar(String sql){
        try {
            //Appel de la Connection
            getConnextion();
            ptsm = cnx.prepareStatement(sql) ;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet executeSelect(){
        rs = null ;
        try {
            rs = ptsm.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs ;
    }

    public int executeMaj(){
        try {
            ok = ptsm.executeUpdate() ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  ok ;
    }

    public void closeConnection(){
        try {
            if (cnx != null)
                cnx.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public PreparedStatement getPtsm() {
        return ptsm;
    }
}
