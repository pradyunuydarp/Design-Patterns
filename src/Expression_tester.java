public class Expression_tester {
    public static void main(String[] args) throws Exception {
        Num  n1 = new Num(1);
        Num n2 = new Num(3);
        Num n3 = new Num(5);
        EvaluateVisitor e = new EvaluateVisitor();
        n1.accept(e);
        n2.accept(e);
        n3.accept(e);
        Add a1 = new Add(n1, n2);
        Mul a2 = new Mul(n3, n1);
        a1.accept(e);
        n2.accept(e);
        a2.accept(e);
    }
}
