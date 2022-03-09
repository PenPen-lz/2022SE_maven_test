public class Unit1 {
    int grade;
    public Unit1(int grade){
        this.grade = grade;
    }
    public String isPassed(){
        if(grade > 100 || grade < 0){
            return "no way";
        }
        if(grade >= 60){
            return "passed";
        }
        return "not passed";
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int gradeAdd(){
        return grade+100;
    }
}
