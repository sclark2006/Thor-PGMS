package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void generators() {
        List generators = Generator.find("order by id").fetch();
        render(generators);
    }
    
    public static void generator(Long id) {
        Generator generator = Generator.findById(id);
        render(generator);
    }

}