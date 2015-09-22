package controllers;

import models.Service;
import play.data.Form;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.services.info;
import views.html.services.list;

import java.util.List;


/**
 * Created by chaoqunzhu on 7/18/15.
 */
public class Services extends Controller {

    private static final Form<Service> serviceForm = Form.form(Service.class);

    public Result list() {
        List<Service> allServices = Service.findAll();
        //return ok(Json.toJson(allServices));
        return ok(list.render(allServices));
    }
    public Result addService() {
        return ok(info.render(serviceForm));
    }

    public Result save() {
        // Get a copy of the html form as an object we can use
        Form<Service> outForm = serviceForm.bindFromRequest();

        if (outForm.hasErrors()) {
            flash("errorsFound", "Please fix the errors on the page");
            return badRequest(info.render(outForm));
        }
        // Extract the data entered in the html form and then
        // create a Service object
        Service service = outForm.get();

        // Save or update the data
        if (Service.exists(service.code)) {
            service.update();
        } else {
            service.save();
        }
        // After save go back to the Add Service form
        return redirect(routes.Services.addService());
    }

    public Result info(String code) {
        Service service = Service.retrieve(code);
        if (service == null) {
            return notFound(code + "is not on file.");
        }
        Form<Service> fillForm = serviceForm.fill(service);
        return ok(info.render(fillForm));
    }

    public Result delete(String code) {
        Service service = Service.retrieve(code);
        if (service == null) {
            return notFound(code + "is not on file.");
        }
        service.delete();

        return redirect(routes.Services.list());
    }
}
