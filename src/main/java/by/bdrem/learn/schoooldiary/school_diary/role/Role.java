package by.bdrem.learn.schoooldiary.school_diary.role;

public enum Role {
  TEACHER("TEACHER"),
  SCHOOLBOY("SCHOOLBOY"),
  PARENT("PARENT");

  private final String role;

  Role(String role) {
    this.role = role;
  }

  public String get() {
    return role;
  }
}
