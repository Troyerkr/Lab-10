class Cookie {
  private int count;
  private double bakeTemp;
  private int bakeTime;
  private boolean baked;

  Cookie(){
    count = 0;
    bakeTemp = 0;
    bakeTime = 0;
    baked = false;
  }

  Cookie(int cookieCount, double temp, int time){
    baked = false;
    count = cookieCount;
    bakeTemp = temp;
    bakeTime = time;
  } 

  boolean getBaked(){
    return baked;
  }

  void setCount(int newCount){
    count = newCount;
  }

  void bake(double temp, int time){
    System.out.println( count + " cookies were baked at " + temp + " degrees F for " + time + " minutes");
    baked = true;
  }

}