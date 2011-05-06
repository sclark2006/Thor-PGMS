/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import play.data.validation.Required;
import play.db.jpa.Model;

/**
 *
 * @author Frederick
 * @version 0.1 May 5, 2011
 */

@Entity
@Table(name="Fuel")
public class Fuel extends Model {
    @Required
    @Column(unique=true)
    public String name;
    
    @Required
    public String measureUnit;
    
    @Override
    public String toString() {
        return this.name;
    }
    

    @OneToMany(mappedBy="fuelType", cascade= CascadeType.PERSIST)
    public List<FuelSupply> fuelSuplies;
}
