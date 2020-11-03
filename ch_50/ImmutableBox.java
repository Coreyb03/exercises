public class ImmutableBox {
    private double width;
    private double height;
    private double length;

    public ImmutableBox(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public ImmutableBox(ImmutableBox oldBox){
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume(){
        return width * height * length;
    }
    public double area(){
        return 2*(width * length + height * length + height * width);
    }
    public double length(){
        return length;
    } 
    public double height(){
        return height;
    }
    public double width(){
        return width;
    }
    public double topArea(){
        return width * length;
    }
    public double sideArea(){
        return width * height;
    }
    public double faceArea(){
        return height * length;
    }




}