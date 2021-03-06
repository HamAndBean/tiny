package top.itfinally.security.web.vo;

import top.itfinally.core.web.BasicVoBean;
import top.itfinally.security.repository.entity.PermissionEntity;

public class PermissionVoBean extends BasicVoBean<PermissionVoBean, PermissionEntity> {
  private String name;
  private String description;

  public PermissionVoBean() {
  }

  public PermissionVoBean( PermissionEntity entity ) {
    super( entity );

    name = entity.getName();
    description = entity.getDescription();
  }

  public String getName() {
    return name;
  }

  public PermissionVoBean setName( String name ) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PermissionVoBean setDescription( String description ) {
    this.description = description;
    return this;
  }
}
