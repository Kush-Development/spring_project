package in.sp.beans.springProject2;

public class student {
    private String name;
    private int rollno;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private String email;




public void display(){
    System.out.println("Name "  + name);
    System.out.println("Roll no " + rollno);
    System.out.println("Email"  + email);
}

}
