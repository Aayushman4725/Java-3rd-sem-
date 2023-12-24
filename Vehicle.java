class Engine
{
    private Boolean petrol;
    private int size;

    public Engine(Boolean petrol,int size)
    {
        this.petrol = petrol;
        this.size = size;
    }

    public String toString()
    {
        String d=(this.petrol?"Engine uses petrol":"Engine uses Diesel")+ "\n Size: " + this.size+"cc";
        return d;
    }
}

class Car
{
    private String brand;
    private int price;
    private Engine str;

    public Car(String brand,int price,Engine str)
    {
        this.brand = brand;
        this.price = price;
        this.str = str;
    }

    public String toString()
    {
        String c="\nBrand"+this.brand+"\nPrice: "+this.price+"\nEngine: "+this.str;
        return c;
    }
    
}

class Vehicle
{
    public static void main(String[] args) 
    {
        Engine e=new Engine(true,500);
        Car c=new Car("Tesla",2000000,e);
        System.out.println(c);
    }
}