/**********************************************************************************
*******************     BMIOOP.java                                   *************
*******************     Angel Guillermo Martinez Cruz                 *************
*******************     this class calculates the body mass index     *************
**********************************************************************************/
public class BMIOOP{
  //properties - attributes
  private String name;
  private int age;
  private double weigth;
  private double heigth;
  private final double KILOGRAMS_PER_POUND = 0.45359237;
  private final double METERS_PER_INCH = 0.0254;
  private double bmi;
  //methos Actions
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  /**************************/
  public void setAge(int Age){
    this.age = age;
  }
  public int getAge(){
    return this.age = age;
  }
  /****************************/
  public void setWeigth(double weingth){

  }
  public double getWeigth(){
    return this.weigth = weigth;
  }
  /****************************/
  public void setHeigth(double heigth){
  }
  public void setHeigth(){
    return this.heigth = heigth;
  }
  /********************************/
  public double getBmi() {
    double bmi=this.weigth*KILOGRAMS_PERPOUND/((this.heigth*METERS_PER_INCH)*(this.heigth*METERS_PER_INCH));
    return Math.round(bmi*100)/100;
  }
}
