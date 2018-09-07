/*package hotel;

public class Hotel{
    private double roomSize;
    private double floorPrice;
    
public Hotel(double First,double Second,double Third){
    First = 100; 
    Second = 50;
    Third = 40;
}
public double 
}*/
package hotel;

public class Hotel
{
  //protected double length;
  protected double floorPrice;
  protected double roomSize;
  public CARPET(){
      
  }
  public CA(double floorPrice,double roomSize){
      this.floorPrice = floorPrice;
      this.roomSize = roomSize;
  }
  /*protected void setPrice(int typePrice){
      this.price =(this.length*this.width*typePrice);      
  }*/
}
class First extends Hotel{
     public static int count;
      public First(double floorSize,double size){
          super(floorPrice,size);
          super.setPrice(300);
          this.count = this.count + 1;  
       }
  }
      class Second extends Hotel{
      public static int count;
      public Second(double floorSize,double size)
      {
        super(floorPrice,size);
        super.setPrice(200);
        this.count  = this.count + 1;
  }
}
     class Third extends Hotel{
         public static int count;
         public Third(double floorSize,double size){
             super(floorPrice,size);
             super.setPrice(100);
             this.count = this.count + 1;
         }
}
//UNFINISHED.....