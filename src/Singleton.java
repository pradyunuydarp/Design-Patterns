// Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

// Ensure that a class has just a single instance. Why would anyone want to control how many instances a class has? The most common reason for this is to control access to some shared resource—for example, a database or a file.
// The global access to an object
// Clients may not even realize that they’re working with the same object all the time.

// Provide a global access point to that instance. Remember those global variables that you (all right, me) used to store some essential objects? While they’re very handy, they’re also very unsafe since any code can potentially overwrite the contents of those variables and crash the app.

// Just like a global variable, the Singleton pattern lets you access some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.


//  Solution
// All implementations of the Singleton have these two steps in common:

// Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
// Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.
// If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that method is called, the same object is always returned.
public class Singleton {
        private Integer i;
        private static Singleton instance;
        private Singleton(){
            this.i = 0;
        }
        public static Singleton get_instance(){
            if(Singleton.instance==null){
                Singleton.instance = new Singleton();
            }
            return Singleton.instance;
        }
}
