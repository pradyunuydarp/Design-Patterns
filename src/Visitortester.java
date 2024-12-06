public class Visitortester {
    public static void main(String [] args){
        Areavisitor a = new Areavisitor();
        Circle c = new Circle();c.r = (Double)3.0;
        Square s = new Square();s.l = (Double)3.0;
        System.out.println(c.accept(a));
        System.out.println(s.accept(a));
    }
}
