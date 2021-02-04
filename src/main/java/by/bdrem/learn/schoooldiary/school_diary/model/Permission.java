package by.bdrem.learn.schoooldiary.school_diary.model;

public enum Permission {
  USER_WRITE("user:write"),
  MODERATE("user:moderate");

  private final String permission;

  Permission(String permission) {
    this.permission = permission;
  }

  public String getPermission() {
    return permission;
  }
}
