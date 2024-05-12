package Model;

public class School {
  private String classroom;
  private String teachers;
  private String Principal;

    public School() {
    }

    public School(String classroom,String teachers,String principal) {
        this.classroom = classroom;
        this.teachers = teachers;
        this.Principal = principal;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getClassroom(String classroom) {
        return classroom;
    }

    public String getPrincipal(String classroom) {
        return Principal;
    }

    public void setPrincipal(String principal) {
        Principal = principal;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "School{" +
                "classroom='" + classroom + '\'' +
                ", teachers='" + teachers + '\'' +
                ", Principal='" + Principal + '\'' +
                '}';
    }
}
