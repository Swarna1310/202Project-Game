public class CookieDecorator extends Cookie{

  public CookieDecorator(Food decoratedCookie){
    super(decoratedCookie);
  }

public void eat(){
  decoratedCookie.eat();

}

public void eatCookie(){
  //functionality to be added here
}
}
