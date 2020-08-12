package module4.student;

public class Student {

        private String lastNameAndInitials;
        private int groupNumber;
        private int[] academicPerformance=new int[5];

        public Student(){
           lastNameAndInitials="";
           groupNumber=0;
           academicPerformance=null;
        }


        public Student(String lastNameAndInitials,int groupNumber, int[]academicPerformance){
            this.lastNameAndInitials=lastNameAndInitials;
            this.groupNumber=groupNumber;
            this.academicPerformance=academicPerformance;
        }


        public String getLastNameAndInitials(){

            return lastNameAndInitials;
        }
        public int getGroupNumber(){

            return  groupNumber;
        }
        public void setLastNameAndInitials(String lastNameAndInitials){

            this.lastNameAndInitials=lastNameAndInitials;
        }

        public void setGroupNumber(int  groupNumber){
            this. groupNumber= groupNumber;
        }

        public int [] getAcademicPerformance(){
            return academicPerformance;
        }

        public void setAcademicPerformance(int [] academicPerformance){
            this.academicPerformance=academicPerformance;
        }


}
