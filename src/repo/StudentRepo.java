package repo;
import com.company.Student;

public class StudentRepo extends InMemoryRepo<Student> {

    public StudentRepo(){

        super();
    }

    /**
     * editez lista de cursuri si nr de credite dupa id-ul unui student din repo
     * @param obj = studentul cu noile cursuri & nr de credite
     * @return studentul actualizat
     */
    @Override
    public Student update(Student obj) {
        Student sUpdate = this.repoList.stream().filter(student -> student.getStudentId() == obj.getStudentId()).findFirst().orElseThrow(null);
        sUpdate.setEnrolledCourses(obj.getEnrolledCourses());
        sUpdate.setTotalCredits(obj.getTotalCredits());
        return sUpdate;
    }
}