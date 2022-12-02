import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class Student extends Person {

    private ArrayList<String> dislikes= new ArrayList<String>();
    private Set<String> subjects= new HashSet<String>();
    private Collection<Integer> grades= new HashSet<Integer>();
    private String d_name;
    private String st;
    private Grade gradebook;
    private String[] subject_set;
    private Integer[] grd_set;
    private Parent parent;
    private Parent parent2;
    private ArrayList<String> emerContact1;
    private ArrayList<String> emerContact2;

    public Student(String name,String dob, Sex sex,String addr,String d_name,String email,
    String telNumber,ArrayList<String> dislikes, Parent parent1, Parent parent2,
    ArrayList<String> emerContact1, ArrayList<String> emerContact2,Grade grades){
        super(name,dob,sex,addr,email,telNumber);
        this.d_name=d_name;
        this.dislikes=dislikes;
        this.gradebook=grades;
        this.parent= parent1;
        this.parent2= parent2;
        this.emerContact1 = emerContact1;
        this.emerContact2=emerContact2;
    }

    
    public Student(String name, String dOB, Sex sex, String address, String dName, String dEmail, String dTel,
            ArrayList<String> dislike, Grade grds, String pname, String pdob, Sex psex, String paddr, String pemail,
            String ptelNum, String pemg, String poccupation, String p2name, String p2dob, Sex p2sex, String p2addr,
            String p2email, String p2telNum, String p2emg, String p2occupation)
            {super(name,dOB,sex,address,dEmail,dTel);
    }



    public String getpName(){
        return parent.getName();
    }

    public String getpDOB(){
        return parent.getDOB();
    }

    public Sex getpSex(){
        return parent.getSex();
    }

    public String getpAddr(){
        return parent.getAddr();
    }

    public void setpAddr(String newaddress){
        parent.setAddr(newaddress);
    }

    public String getpEmail(){
        return parent.getEmail();
    }

    public void setpEmail(String newemail){
        parent.setEmail(newemail);
    }

    public String getpNumber(){
        return parent.getTelNum();
    }

    public void setpNumber(String newtelNum){
        parent.setTelNum(newtelNum);
    }

    public ArrayList<String> getEmgContact1(){
        return emerContact1;
    }

    public ArrayList<String> getEmgContact2(){
        return emerContact2;
    }

    public void setEmgContact(String name, String contact, String addr, String relation, String name2, String contact2, String addr2, String relation2){
        emerContact1.add(name);
        emerContact1.add(contact);
        emerContact1.add(addr);
        emerContact1.add(relation);
        emerContact2.add(name2);
        emerContact2.add(contact2);
        emerContact2.add(addr2);
        emerContact2.add(relation2);
    }

    public void setParentInfo(String name, String contact, String occp, String email, String name2, String contact2, String occp2, String email2){
        parent = new Parent(name, "", Sex.FEMALE, "", email, contact, occp);
        parent2 = new Parent(name, "",Sex.MALE, "",email2,contact2,occp2);   
    }

    public String getpOccupation(){
        return parent.getOccupation();
    }

    public void setpOccupation(String addr){
        parent.setOccupation(addr);
    }

    public String getp2Name(){
        return parent2.getName();
    }

    public String getp2DOB(){
        return parent2.getDOB();
    }

    public Sex getp2Sex(){
        return parent2.getSex();
    }

    public String getp2Addr(){
        return parent2.getAddr();
    }

    public void setp2Addr(String newaddress){
        parent2.setAddr(newaddress);
    }

    public String getp2Email(){
        return parent2.getEmail();
    }

    public void setp2Email(String newemail){
        parent2.setEmail(newemail);
    }

    public String getp2Number(){
        return parent2.getTelNum();
    }

    public void setp2Number(String newtelNum){
        parent2.setTelNum(newtelNum);
    }

    /*public String getp2EmgContact(){
        return parent2.getEmgcon();
    }

    public void setp2EmgContact(String newContact){
        parent2.setEmgcon(newContact);
    }*/

    public String getp2Occupation(){
        return parent2.getOccupation();
    }

    public void setp2Occupation(String addr){
        parent2.setOccupation(addr);
    }

    public String getDName(){
        return d_name;
    }

    public String getDislikes(){
        st="DISLIKES:\n";
        for(String n: dislikes){
            st+= n+"\n";
        }
        return st;
    }
    public String getAcdRec(){
        String st;
        subjects=gradebook.getGrades().keySet();
        grades=gradebook.getGrades().values();
        subject_set = subjects.toArray(new String[subjects.size()]);
        grd_set = grades.toArray(new Integer[grades.size()]);
        st="ACADEMIC RECORD:"+"\n";
        st+=subject_set[0]+": "+grd_set[0]+"\n";
        st+=subject_set[1]+": "+grd_set[1]+"\n";
        st+=subject_set[2]+": "+grd_set[2]+"\n";
        return st;
    }

    public void setDislike(String dislike){
        this.dislikes.add(dislike);
    }

    public String getName(){
        return name;
    }

    public String getDOB(){
        return dob;
    }

    public Sex getSex(){
        return sex;
    }

    public String getAddr(){
        return address;
    }

    public void setAddr(String newAddr){
        this.address=newAddr;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String new_Email){
        this.email=new_Email;
    }

    public String getTelNum(){
        return telNum;
    }

    public void setTelNum(String Tel_num){
        this.telNum=Tel_num;
    }

    public String getDoctorName(){
        return d_name;
    }

    public String toString()
    {
        return(getName()+" "+getDOB()+" "+getSex()+" "+getAddr()+" "+getDName()+" "+getEmail()+" "+getTelNum()
        +" "+getDislikes())+" "+getp2Name()+" "+getpName()+" "+getDName()+" "+getEmgContact1();
    }
 
}