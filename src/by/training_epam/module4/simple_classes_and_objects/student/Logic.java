package module4.student;

public class Logic {

    public void printHonoursPupil(Student [] students) {
        for (int i=0; i<students.length; i++) {
            if(isHonor(students[i])){
                System.out.println(students[i].getLastNameAndInitials() + " " + students[i].getGroupNumber());
            }
        }
    }


    public boolean isHonor(Student student) {
        int[] academic = student.getAcademicPerformance();
        for (int j = 0; j < academic.length; j++) {
            if (academic[j] < 9) {
                return false;
            }
        }
        return true;
    }

}
