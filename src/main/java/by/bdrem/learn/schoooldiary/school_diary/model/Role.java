package by.bdrem.learn.schoooldiary.school_diary.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
  TEACHER(Set.of(Permission.USER_WRITE, Permission.MODERATE)),
  SCHOOLBOY(Set.of(Permission.USER_WRITE)),
  PARENT(Set.of(Permission.USER_WRITE, Permission.MODERATE)),
  USER(Set.of(Permission.USER_WRITE)),
  MODERATOR(Set.of(Permission.USER_WRITE, Permission.MODERATE));

  private final Set<Permission> permissions;

  Role(Set<Permission> permissions) {
    this.permissions = permissions;
  }

  public Set<Permission> getPermissions() {
    return permissions;
  }

  public Set<SimpleGrantedAuthority> getAuthorities() {
    return permissions.stream().map(p -> new SimpleGrantedAuthority(p.getPermission()))
        .collect(Collectors.toSet());
  }
}
