public enum MyFirstEnum {
  Walter("best", "27"),
  John("better", "10"),
  Willson("good",  "8"),
  C("intersting", "2016"),
  JavaScript("exciting", "2019"),
  React("awesome", "2019"),
  Python("sweet", "2021");
  
  
  private final String desc;
  private final String year;
  
  MyFirstEnum(String description, String someYear){
    desc = description;
    year = someYear;
  }
  
  public String getDes(){
    return desc;
  }
  public String getYear(){
    return year;
  }
}
