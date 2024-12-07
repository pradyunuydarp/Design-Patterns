import java.util.ArrayList;
import java.util.Arrays;

public class Strategy {
    // Strategy is a behavioral design pattern that lets you define a family of algorithms/functions, 
    // put each of them into a separate class, and make their objects interchangeable.
    public static ArrayList<Integer> Mymap(first_order_function f,ArrayList<Integer>x ){
        ArrayList<Integer> y2 = new ArrayList<>();
        for(Integer i:x){
            y2.add(f.apply(i));
        }
        return y2;
    }
    public static Integer Mymap(function f,ArrayList<Integer> x){
        // ArrayList<Integer> y = new ArrayList<>();
        if(x.isEmpty())return 0; 
        Integer accum = x.get(0);
        // int ind = 0;
        for(Integer i = 1 ; i<x.size(); i++){
            // if(ind<x.size())
            // System.out.println(i);
            accum  = f.apply(accum,x.get(i));
            // ind++;
        }
        return accum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        // Convert int[] to Integer[]
        Integer[] integerArray = Arrays.stream(a).boxed().toArray(Integer[]::new);

        // Create an ArrayList from Integer[]
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(integerArray));

        // myma Strategy = new mymap();
        Sum sum = new Sum();

        int s = Strategy.Mymap(sum,al);
        Factorial f = new Factorial();
        int fans = Strategy.Mymap(f,f.getarr(10));
        System.out.println(s);
        System.out.println(fans);
    }
}
interface first_order_function {

    int apply(int x);//first order functions
    
    
}
interface function{
    int apply(Integer x, Integer y);//higher order functions
}

class Sqr implements first_order_function{
    public int apply(int x){
        return x*x;
    }
}
class Sum implements function{


    public int apply(Integer x, Integer y) {
        return x+y;
    }
    
}
class Factorial implements function{
    ArrayList<Integer>getarr(Integer n){
        ArrayList<Integer> x= new ArrayList<>();
        for(Integer i = 1; i<=n; i++){
            x.add(i);
        }
        return x;
    }
    @Override
    public int apply(Integer x, Integer y) {
        return x*y;
    }
    
}

