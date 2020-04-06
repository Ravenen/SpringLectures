package ua.lviv.iot.spring.first.rest.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedNativeQuery(name = "Student.findBestStudent", 
query = "select * from student where id = 1")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String firstName;

  private String lastName;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "group_id")
  @JsonIgnoreProperties("students")
  private Group group;

  @ManyToMany(mappedBy = "students")
  @JsonIgnoreProperties("students")
  private Set<Subject> subjects;

  public Student() {

  }

  public Student(Integer id, String firstName, String lastName) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Student(String firstName, String lastName) {
    this(null, firstName, lastName);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Set<Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(Set<Subject> subjects) {
    this.subjects = subjects;
  }
}
