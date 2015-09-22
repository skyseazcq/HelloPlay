package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hello World. Good Job."));
    }

    public Result index2() {
        return ok(index.render("Welcome Napa."));
    }

}
