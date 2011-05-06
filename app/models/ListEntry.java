package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import play.db.jpa.GenericModel;
import play.db.jpa.Model;

/**
 *
 * @author Frederick
 */
@Entity
@Table(name = "LIST_OF_VALUES")
public class ListEntry extends GenericModel {

    @Id
    public String keyName;
    public String description;
    public String tag;

    public ListEntry() {
    }

    public ListEntry(String keyName, String description, String tag) {
        this.keyName = keyName;
        this.description = description;
        this.tag = tag;
    }
    
    

}
