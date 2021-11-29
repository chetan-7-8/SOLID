package SingletonDesign;

class SingleObject{
    private static SingleObject instance;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance==null){
            return new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}


public class Main {

    public static void main(String args[]) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        //Get the only object available


        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
