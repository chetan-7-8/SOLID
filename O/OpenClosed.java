package O;

class NotificationService{
    public  void sendOTP(String medium){
        if(medium=="email"){
            //logic for email
        }
        else if(medium=="mobile"){
            //logic for mobile
        }
    }

    //so here if we want to add another medium then we have to make changes in NotificationService Class which
    //violate the law. The better option is we extend classes to it.
}




interface NotiService{
    public void sendOTP(String medium);
}

class mobile implements NotiService{
   @Override
    public void sendOTP(String medium){
        //logic for sending otp;
    }
}

class email implements NotiService{
    @Override
    public void sendOTP(String medium) {
        //logic for email
    }
}

class instagram implements NotiService{

    @Override
    public void sendOTP(String medium) {
        //logic for insta
    }
}

public class OpenClosed {
    // The open close principle state that according to a new requirments the module should be open for extension
    // but closed for modification
}
