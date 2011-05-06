/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

/**
 *
 * @author Frederick
 */


import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
//import play.db.jpa.GenericModel;

import play.data.validation.*;
/**
 *
 * @author Frederick
 * @version 0.1 24 Abril 2011.
 */
@Entity
public class Generator extends Model {
        
    
        @Column(unique=true)
        @Required @MinSize(4)
        public String name;
        
        public String model;
        public String maker;
        public String engineType;
        
        @Required
        public double powerOutputKW;
    
        @Required
        @MaxSize(10)
        public long hourmetterInitialValue; 
        
        
        //MaintenancePlan manteinancePlan;
        
        @MaxSize(1000)
        public String comment;

        @OneToMany(mappedBy="generator", cascade= CascadeType.ALL)
        public List<GeneratorEvent> events;
        
        @ManyToMany(cascade= CascadeType.PERSIST)
        public Set<Fuel> fuelTypes;
        
        @ManyToMany(cascade= CascadeType.PERSIST)
        public Set<FuelSupply> fuelSupplies;
        
        @OneToMany(mappedBy="generator", cascade= CascadeType.ALL)
        public List<FuelConsumptionSpec> consumptionSpecs;
        
        //public List<PerformedManteinance> performedManteinances;
       
  /*      
           public EventoDeGenerador GetUltimoEvento()
        {
            try
            {
                DateTime fecMax = this.Eventos.Max(fr => fr.FechaRegistro);
                return this.Eventos.Single(w => w.FechaRegistro.Equals(fecMax));
            }
            catch (Exception e)
            {
                return null;
            }
        }

        public bool TieneEventos()
        {
            return Eventos.Count > 0;
        }
*/     
   
        
        /*private ISet<TipoEnergia> tiposEnergia = new HashedSet<TipoEnergia>();
        private IList<EventoGenerador> eventosGenerador = new List<EventoGenerador>();
        private ISet<EspecificacionDeMantenimiento> especsMantenimiento = new HashedSet<EspecificacionDeMantenimiento>();
        private ISet<MantenimientoProgramado> mantenimientosProgramados = new HashedSet<MantenimientoProgramado>();
        private IList<MantenimientoRealizado> mantenimientosRealizados = new List<MantenimientoRealizado>();
        private ISet<DepositoEnergia> depositosEnergia = new HashedSet<DepositoEnergia>();
         *
         */

    
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
