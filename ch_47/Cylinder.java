public class Cylinder{
    private double height;
    private double radius;

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public double volume(){
        return (Math.PI*radius*radius*height);      
    }
    
    public double surfaceArea(){
        return (Math.PI*radius*radius*2) + (2*Math.PI*height*radius);
    }

    public void setHeight( double height ){
    if ( height >= 0 )
      this.height = height ;
    }
  
    public void setRadius( double radius ){
    if ( radius >= 0 )
       this.radius = radius ;
    }
    
}