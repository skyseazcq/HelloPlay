package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;

/**
 * Created by chaoqunzhu on 7/18/15.
 */
@Entity
public class Service extends Model {

    private static Model.Finder<String, Service> find =
            new Model.Finder<String, Service>(Service.class);
    @Id
    public String code;

    @Constraints.Required
    public String description;

    @Constraints.Required
    public Integer amount;

    // Retrieve all Service records
    public static List<Service> findAll() {
        return Service.find.orderBy("code").findList();
    }

    public static Service retrieve(String code) {
        return find.ref(code);
    }

    public static boolean exists(String code) {
        return (find.where().eq("code", code).findRowCount() == 1) ? true: false;
    }
}
