package de.bitgrip.mapstruct.example.mapper;

import de.bitgrip.mapstruct.example.model.dest.CarDTO;
import de.bitgrip.mapstruct.example.model.source.Car;

/**
 * <p>TODO Document!</p>
 * <p>
 * (w) marcelmuller<br/>
 * (c) bitgrip GmbH, 2018
 * </p>
 */
public  class CarMapperDecorator extends CarMapper{

  private final CarMapper delegate;

  public CarMapperDecorator(CarMapper delegate) {
    this.delegate = delegate;
  }

  /* Does nothing */
  public  CarDTO mapCar(Car car){
    return delegate.mapCar(car);
  }
}
