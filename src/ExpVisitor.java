
import java.util.Stack;

public abstract class ExpVisitor<T> {
    public final Stack<T> stk = new Stack<>();
    public void visit(Num ex) throws Exception{
        // if(ex instanceof Num){
        //     visitNum((Num)ex);
        // }
        // else if(ex instanceof Add){
        //     visitAdd((Add)ex);
        // }
        // else if(ex instanceof Mul){
        //     visitMul((Mul)ex);
        // }
        // else {
		// 	throw new Exception("Visitor::visit -- Shape class unidentified.");
		// }
        // return 0.0;
    }
    public void visit(Add ex) throws Exception{}
    public void visit(Mul ex) throws Exception{}
    // abstract public void visitNum(Num n);
	// abstract public void visitAdd(Add a) throws Exception;
    // abstract public void visitMul(Mul m) throws Exception;
	// abstract public void visitCompositeShape(CompositeShape cs) throws Exception;
    
}
class EvaluateVisitor extends ExpVisitor<Integer>{

    @Override
    public void visit(Num ex) throws Exception {
        stk.add(ex.evaluate());
        System.out.println(stk.peek());
    }
    public void visit(Add ex) throws Exception {
        // stk.add(ex.evaluate());
        Integer s = 0;
        while(!stk.empty()){
            s+=stk.pop();
        }
        stk.push(s);System.out.println(stk.peek());
    }
    public void visit(Mul ex) throws Exception {
        // stk.add(ex.evaluate());
        Integer s = 1;
        while(!stk.empty()){
            s*=stk.pop();
        }
        stk.push(s);System.out.println(stk.peek());
    }
    
}

