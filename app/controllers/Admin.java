/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

/**
 *
 * @author Frederick
 */
//@With(Secure.class)
public class Admin extends Controller {
    @Before
    static void setConnectedUser() {
        /*if(Security.isConnected()) {
            User user = User.find("byEmail", Security.connected()).first();
            renderArgs.put("user", user.fullname);
        }*/
    }
 
    public static void index() {
        //Generators.list();
        //render();
    }    
}
