/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import play.data.validation.*;
import play.db.jpa.Model;

/**
 *
 * @author Frederick
 */
@Entity
@Table(name="Fuel_Consumption_Specs")
public class FuelConsumptionSpec  extends Model {
        
    //private string _IdGenerador;		
    //private string _IdTipoEnergia;
    @Required
    @ManyToOne    
    public Generator generator;
    
    @ManyToOne(optional=false)
    @JoinColumn(name="fuelType")        
    public Fuel fuelType;
    
    
    
    public double consumptionAt25pcOfLoad;
    public double consumptionAt50pcOfLoad;
    public double consumptionAt75pcOfLoad;
        
    @Required
    public double consumptionAt100pcOfLoad;
    
    
    @Override
    public String toString() {
        String result = fuelType.measureUnit + " of " + fuelType.name +
                ": @1/4 " + consumptionAt25pcOfLoad +
                ", @1/2 " + consumptionAt50pcOfLoad + 
                ", @3/4 " + consumptionAt75pcOfLoad + 
                ", @full load " + consumptionAt100pcOfLoad;
        
        return result;
    }
    
        
}
