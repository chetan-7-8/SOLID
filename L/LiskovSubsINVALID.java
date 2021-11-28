package L;


abstract class  SocialMedia{

    //Supported by facebook, whatsapp,Instagram
    public abstract void Chat();

    //Supported by facebook,Instagram
    public abstract void PublishPost(String post);

    //Supported by facebook, whatsapp,Instagram
    public abstract void SendPhotoAndVideo();

    //Supported by facebook, whatsapp
    public abstract void GroupVideoCall();

        }


  class Facebook extends SocialMedia{

      @Override
      public void Chat() {

      }

      @Override
      public void PublishPost(String post) {

      }

      @Override
      public void SendPhotoAndVideo() {

      }

      @Override
      public void GroupVideoCall() {

      }
  }

  class Whatsapp extends SocialMedia{

      @Override
      public void Chat() {

      }

      @Override
      public void PublishPost(String post) {
      //Not applicable in whatsapp
      // it doesnot follow Liskov Substitute Principle
      }

      @Override
      public void SendPhotoAndVideo() {

      }

      @Override
      public void GroupVideoCall() {

      }
  }

public class LiskovSubsINVALID {
    //it applies to inheritance in such a way that the derived class must be completely substitutable
    //for their base class. In other words if class A is a subtype of class B, then we should be able to
    // replace B with A without interrupting the behaviour of the program.
}
