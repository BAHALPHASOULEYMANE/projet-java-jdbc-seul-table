package presentation;

import sn.exo.controller.DB;
import sn.exo.controller.IUser;
import sn.exo.controller.UserImpl;
import sn.exo.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        //Test Pour la connection a la BD
        DB db = new DB() ;
        db.getConnextion(); */
        IUser iUser = new UserImpl();

        /*Ajout User a la BD
        User user = new User() ;
        user.setNom("Bah");
        user.setPrenom("Souleyamne");
        user.setEmail("asbahisdk@groupeestm.com");
        user.setPassword("passer@123");
        if (iUser.add(user) == 1){
            System.out.println("User add success");
        }else {
            System.out.println("User failed add");
        }*/
        /*Listes des Users
        List<User> listeusers = iUser.liste() ;
          System.out.println("Listes des Users");
        for (User user: listeusers) {
            System.out.println("Nom:" + user.getPrenom() + " " + " Prenom:" + user.getNom() + " " + " Email:" + user.getEmail());
        }*/
        /*Mise a jour d'un user
        User user = new User();
        user.setId(1);
        user.setNom("Diallo Cherif");
        user.setPrenom("Mariame");
        user.setEmail("mcdgn224@big.com");
        user.setPassword("laisse@GN224");
        if (iUser.update(user) == 1) {
            System.out.println("User update success");
        } else {
            System.out.println("User failed update");
        }*/

        /*Get user /by Id
        User user = iUser.get(1);
        System.out.println("L'utilisateur dont l'id est :" + user.getId() + " Nom:" + user.getPrenom() + " " + " Prenom:" + user.getNom() + " " + " Email:" + user.getEmail());
        */
        //Delete user
        if (iUser.delete(3) == 1) {
            System.out.println("User delete success");
        } else {
            System.out.println("User failed delete");
        }
    }
}