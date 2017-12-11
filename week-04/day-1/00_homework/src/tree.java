public class tree {
  private String type;
  private String leaf_color;
  private String sex;
  private int age;

  public void setType(String inputType) {
    this.type = inputType;
  }

  public String getType (String inputType) {
    return this.type;
  }

  public void setLeaf_color (String color) {
    this.leaf_color = color;
  }

  public String getLeaf_color (String color) {
    return this.leaf_color;
  }

  public void setSex (String inputSex) {
    this.sex = inputSex;
  }

  public String getSex (String inputSex) {
    return this.sex;
  }

  public void setAge (int inputAge) {
    this.age = inputAge;
  }

  public int getAge (int inputAge) {
    return this.age;
  }

}
