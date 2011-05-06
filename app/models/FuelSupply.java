/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import play.data.validation.*;
import play.db.jpa.Model;

/**
 *
 * @author Frederick
 * @version  0.1 May 4th, 2011
 */

@Entity
@Table(name="Fuel_Supply")
public class FuelSupply extends Model {
    
    @Required
    @Column(unique=true)
    public String name;
    
    @Required
    public double capacity;

    @Required
    public double currentLevel;
            
    
    @ManyToOne(optional=false)
    @JoinColumn(name="fuelType")        
    public Fuel fuelType;
    
    @MaxSize(500)
    public String comment;
    
    
    @Override
    public String toString() {
        return this.name;
    }
		
}
