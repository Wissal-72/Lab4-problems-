package problem6;

public class Square extends Forme{
    public Square(double edge){super(edge);}

    @Override
    public double getSurface(){
        return Math.pow(this.getEdge(),2);
    }
}
