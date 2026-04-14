package br.com.jrd.builder;

import br.com.jrd.component.CarType;
import br.com.jrd.component.Engine;
import br.com.jrd.component.Transmission;

public interface IBuilder {
   public void setCarType(CarType carType);
   public void setSeats(int seats);
   public void setTransmission(Transmission transmission);
   public void setEngine(Engine engine);
   
}
