package fr.scriptoria.api.dto;

import fr.scriptoria.api.models.enumeration.TypeEnum;

public class ProjectDTO {

    // simple attributes

    private String title;

    private String subTitle;

    private TypeEnum typeProject;

    private String description;

    private Long userEntityId;

    // simple getters & setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public TypeEnum getTypeProject() {
        return typeProject;
    }

    public void setTypeProject(TypeEnum typeProject) {
        this.typeProject = typeProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserEntityId() {
        return userEntityId;
    }

    public void setUserEntityId(Long userEntityId) {
        this.userEntityId = userEntityId;
    }

}
