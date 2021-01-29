package by.bdrem.learn.schoooldiary.school_diary.role;

public enum UserRole {
  TEACHER("TEACHER"),
  SCHOOLBOY("SCHOOLBOY"),
  PARENT("PARENT");

  private final String role;

  UserRole(String role) {
    this.role = role;
  }

  public String getRole() {
    return role;
  }
}
