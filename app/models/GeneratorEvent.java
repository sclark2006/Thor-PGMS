/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import play.data.validation.*;
import play.db.jpa.Model;

/**
 *
 * @author Frederick
 * @version 0.1 May 4th 2011
 */

@Entity 
@Table(name="Generator_Events")
public class GeneratorEvent extends Model {
    @ManyToOne
    private Generator generator;
    
    public long hourmeterValue;
    public String generatorState;
    
    @MaxSize(500)
    public String comment;
    
    @Required
    public Date registeredAt;
    
    @Required
    @ManyToOne
    public User registeredBy;

    public Date ocurredAt;
    
}
