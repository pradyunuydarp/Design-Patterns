
abstract class Expression{
    abstract int evaluate();
}


class Num extends Expression{
    private int val;
    Num(int v){this.val = v;}
    @Override
    public int evaluate(){
        return this.val;
    }
}

abstract class Operator extends Expression {
    protected Expression left, right;
    Operator(Expression l, Expression r){
        this.left=l;
        this.right=r;
    }
    public int evaluate(){return 0;}
}

class Add extends Operator{
    Add(Expression l,Expression r){super(l,r);}
    @Override
    public int evaluate(){
        int l = this.left.evaluate();
        int r = this.right.evaluate();
        return r+l;
    }
}

class Mul extends Operator{
    Mul(Expression l,Expression r){super(l,r);}
    @Override
    public int evaluate(){
        int l = this.left.evaluate();
        int r = this.right.evaluate();
        return r*l;
    }
}


public class Composite {

    public static void main(String[]args){
        Expression e1 = new Num(1);
        Expression e2 = new Num(2);
        Expression e3 = new Num(3);
        Expression a = new Mul(e2,e3);
        Expression m = new Add(e1,a);
        System.out.println(m.evaluate());
    }

    
}
