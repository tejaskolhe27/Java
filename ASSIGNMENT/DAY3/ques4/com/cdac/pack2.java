package ASSIGNMENT.DAY3.ques4.com.cdac;

class Batch{

    private String course_name;
    private int batch_strength;
    

    public Batch(String course_name, int batch_strength) {
        this.course_name = course_name;
        this.batch_strength = batch_strength;
    }
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public int getBatch_strength() {
        return batch_strength;
    }
    public void setBatch_strength(int batch_strength) {
        this.batch_strength = batch_strength;
    }
    @Override
    public String toString() {
        return "Batch [course_name=" + course_name + ", batch_strength=" + batch_strength + "]";
    }
    

    
}