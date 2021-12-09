package FactoryPattern;
import  java.util.*;
import java.io.*;

abstract class Vehicle{
    public abstract int  getEngine();
    public  String toString(){
      return  "Engine: "+ this.getEngine();
    }
}
class  Car extends Vehicle{
    int engine;
    Car(int engine){
        this.engine = engine;
    }
    @Override
    public  int getEngine(){
        return  this.engine;
    }
}
class  Bike extends Vehicle{
    int engine;
    Bike(int engine){
        this.engine = engine;
    }
    @Override
    public  int getEngine(){
        return  this.engine;
    }
}
class  vehicalFactory
{
    public  static  Vehicle getInstance(String type, int engine){
        if(type=="car"){
            return  new Car(engine);
        }
        if(type=="bike"){
            return  new Bike(engine);
        }
        return  null;
    }
}
public class MyFactory
{
    public static void main(String args[])
    {
        Vehicle maruti  = vehicalFactory.getInstance("car",1200);
        Vehicle hero =  vehicalFactory.getInstance("bike",120);
        System.out.println(maruti);
        System.out.println(hero);
    }

}
