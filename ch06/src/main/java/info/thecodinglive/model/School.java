package info.thecodinglive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class School {
    @Id
    @Column(name = "SCHOOL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String telnumber;
    @OneToMany(mappedBy = "school")
    private Set<Student> students;

    public School(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public void registerStudent(Student s) {
        if(students == null) {
            students = new HashSet<Student>();
        }
        students.add(s);
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name=" + name +
                ", address =" + address +
                ", telnumber=" + telnumber +
                ", studentSet=" + students +
                "}";
    }
}
