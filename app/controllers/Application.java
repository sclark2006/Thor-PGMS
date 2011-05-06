package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List generators = Generator.find("order by id").fetch();
        render(generators);
    }
    
    public static void createGenerator(String name) {
        //Generator gen = new Generator(name).save();
        //renderJSON(gen);
    }

}