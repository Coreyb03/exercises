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

    public ImmutableBox BiggerBox(ImmutableBox oldBox){
        return new ImmutableBox(1.25 * oldBox.width(),1.25 * oldBox.height(),1.25 * oldBox.length());
    }

    public ImmutableBox SmallerBox(ImmutableBox oldBox){
        return new ImmutableBox(.75 * oldBox.width(),.75 * oldBox.height(),.75 * oldBox.length());
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