/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederick
 */
import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    @Override
    public void doJob() {
        // Check if the database is empty
        //if(User.count() == 0) {
        //    Fixtures.load("initial-data.yml");
        //}
    }

}