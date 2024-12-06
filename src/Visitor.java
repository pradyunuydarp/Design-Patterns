interface Visitor {
    Double visit(Circle c);
    Double visit(Square s);
}
class Areavisitor implements Visitor{

    @Override
    public Double visit(Circle c) {
        return (((Double)3.47)*c.r*c.r);
    }

    @Override
    public Double visit(Square s) {
        return (s.l*s.l);
    }

}
interface Shape{
    public Double accept(Visitor v);
}

class Circle implements Shape{
    public Double r;

    @Override
    public Double accept(Visitor v) {
       return  v.visit(this);
    }
    
}

class Square implements Shape{
    public Double l;
    @Override
    public Double accept(Visitor v) {
        return v.visit(this);
    }
    
}

