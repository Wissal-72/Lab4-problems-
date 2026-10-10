package problem6;

public class Circle extends Forme {

    public Circle(double edge){super(edge);}

    @Override
    public double getSurface(){
        return Math.pow(this.getEdge(),2)*3.14;
    }

}
