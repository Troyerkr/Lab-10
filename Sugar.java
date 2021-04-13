class Sugar extends Cookie{
  private String shape;
  private boolean decorated;

  Sugar(){
    shape = "";
    decorated = false;
  }

  Sugar(String cookieShape){
    shape = cookieShape;
    decorated = false;
  }

  void setShape(String cookieShape){
    shape = cookieShape;
  }

  String getShape(){
    return shape;
  }

  void cutShapes(String cookieShape, int cookieCount){
    System.out.println(cookieCount + " cookies were cut into " + cookieShape);
    super.setCount(cookieCount);
  }

  void decorate(){
    if(super.getBaked()){
      decorated = true;
      System.out.println("The cookies were decorated");
    }else{
      System.out.println("Make sure to bake the cookies first");
    }
  }




}