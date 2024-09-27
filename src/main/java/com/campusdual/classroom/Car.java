package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0 ;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;


    public Car(String brand,String model,String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){

    }

    public void start(){
        if (isTachometerEqualToZero()){
            this.tachometer = 1000;
            System.out.println("Vehiculo encendido");
        }else{
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }

    public void stop(){
        if(this.tachometer == 1000 & this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        }else {
            System.out.println("Non se poder apagar o vehiculo, primero ten que estar detido");
        }
    }

    public void accelerate(){
        int speed = 5;
        if(this.speedometer + speed <= MAX_SPEED){
            this.speedometer += speed;
            System.out.println("Se ha acelerado el vehiculo " + speed + " KM/H");
            checkSpeed();
        }else{
            System.out.println("No se puede acelerar por encima de la velocidad máxima(" + MAX_SPEED + " KMH/H)" );
        }
    }

    public void brake(){
       int speed = 5;
        if(this.speedometer - speed >= 0){
            this.speedometer -= speed;
            System.out.println("Se ha frenado el vehiculo " + speed + " KM/H");
            checkSpeed();
        }else{
            System.out.println("No se puede frenar tanto, primero te paras y luego pones marcha atras");
        }
    }

    public void turnAngleOfWheels(int angle){
        if(this.wheelsAngle + angle <= 45 && this.wheelsAngle + angle >= -45){
            this.wheelsAngle += angle;
            System.out.println("Se ha girado el vehiculo de forma correcta");
            showAngleOfWheels();
        }else if(this.wheelsAngle + angle >= 45){
            this.wheelsAngle = 45;
            showAngleOfWheels();
        }else if(this.wheelsAngle + angle <= -45) {
            this.wheelsAngle = -45;
            showAngleOfWheels();
        }else{
            System.out.println("No se ha girado de forma correcta el volante, aprende a conducir");
        }

    }
    public boolean isReverse(){
        return this.reverse;
    }
    public void setReverse(boolean reverse){
        if(!isReverse() & isTachometerGreaterThanZero() && this.speedometer == 0){
            this.reverse = reverse;
            this.gear = "R";
        }else if (isReverse()){
            System.out.println("Ya esta la marcha atras puesta");
        }else{
            System.out.println("No puedes cambiar de marcha hasta que pares el vehiculo");
        }
    }





    public void showAngleOfWheels(){
        System.out.println("Las ruedas tienen un angulo de " + this.wheelsAngle + " grados");
    }

    public void checkSpeed(){
        System.out.println("La velocidad actual del vehiculo es de " + this.speedometer + " KM/H");
    }

    public boolean isTachometerEqualToZero(){
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }






}
