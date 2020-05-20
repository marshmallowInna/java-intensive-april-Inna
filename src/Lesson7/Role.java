package Lesson7;

public enum Role {
    USER("low"), MANAGER("mid"),ADMIN("high"); // we describe how our class look likes and create instance
    private String level;

    Role(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Role{" +
                "level='" + level + '\'' +
                "} " + super.toString();
    }
}

