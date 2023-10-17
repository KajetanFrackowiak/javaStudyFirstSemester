package Lab10.Task5And6;

public class Student implements Comparable<Student>{
    private final String name;
    private final String surname;
    private final String index;


    Student(String name, String surname, String index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    public String getIndex() {
        return index;
    }
    @Override
    public int compareTo(Student other) {
        return this.getIndex().compareTo(other.getIndex());
    }
    public String toString() {
        return name + " " + surname + " (" + index + ")";
    }

}
