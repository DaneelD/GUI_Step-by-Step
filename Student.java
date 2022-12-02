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

     /**
     * 
     * @param name Name of student
     * @param dob Date of birth of student
     * @param sex Gender of student
     * @param addr Address of student
     * @param d_name 
     * @param email Email 
     * @param telNumber Telephone number
     * @param dislikes Dislikes of student
     * @param parent1 Parent of student
     * @param parent2 Parent of student
     * @param emerContact1 Emergency contact
     * @param emerContact2 Emergency contact 
     * @param grades Grades of student
     */
    public Student(String name,String dob, Sex sex,String addr,String d_name,String email,
    String telNumber,ArrayList<String> dislikes, Grade grades,String pname, String pdob, 
    Sex psex, String p_addr, String p_email, String ptelNum,String p_emgContact,
    String p_occupation,String p2name, String p2dob, 
    Sex p2sex, String p2_addr, String p2_email, String p2telNum,String p2_emgContact
    ,String p2_occupation){
        super(name,dob,sex,addr,email,telNumber);
        this.d_name=d_name;
        this.dislikes=dislikes;
        this.gradebook=grades;
        this.parent=new Parent(pname,pdob,psex,p_addr,p_email,ptelNum,p_emgContact,p_occupation);
        this.parent2=new Parent(p2name,p2dob,p2sex,p2_addr,p2_email,p2telNum,p2_emgContact,p2_occupation);
    }

    /**
     * 
     * @return Name of Parent
     */
    public String getpName(){
        return parent.getName();
    }

     /**
     * 
     * @return Date of birth of parent
     */
    public String getpDOB(){
        return parent.getDOB();
    }

    /**
     * 
     * @return Gender of parent
     */
    public Sex getpSex(){
        return parent.getSex();
    }

    /**
     * 
     * @return Address of parent
     */
    public String getpAddr(){
        return parent.getAddr();
    }

    /**
     * 
     * @param newaddress Address of a parent
     */
    public void setpAddr(String newaddress){
        parent.setAddr(newaddress);
    }

    /**
     * 
     * @return Email of a parent
     */
    public String getpEmail(){
        return parent.getEmail();
    }
    
    /**
     * 
     * @param newemail Email of a parent
     */
    public void setpEmail(String newemail){
        parent.setEmail(newemail);
    }

     /**
     * 
     * @return Telephone number of a parent
     */
    public String getpNumber(){
        return parent.getTelNum();
    }

     /**
     * 
     * @param newtelNum Telephone number of a parent
     */
    public void setpNumber(String newtelNum){
        parent.setTelNum(newtelNum);
    }

     /**
     * 
     * @return Emergency contact information
     */
    public String getpEmgContact(){
        return parent.getEmgcon();
    }

     /**
     * 
     * @param newContact Telephone number of a emergency contact
     */
    public void setpEmgContact(String newContact){
        parent.setEmgcon(newContact);
    }
    
    /**
     * 
     * @return The occupation of parent
     */
    public String getpOccupation(){
        return parent.getOccupation();
    }

    /**
     * 
     * @param addr Occupation of parent
     */
    public void setpOccupation(String addr){
        parent.setOccupation(addr);
    }

    /**
     * 
     * @return The name of a parent 
     */
    public String getp2Name(){
        return parent2.getName();
    }

     /**
     * 
     * @return The date of birthday of a parent 
     */
    public String getp2DOB(){
        return parent2.getDOB();
    }
    
    /**
     * 
     * @return The Gender of a parent 
     */
    public Sex getp2Sex(){
        return parent2.getSex();
    }

    /**
     * @return Address of a parent 
     */
    public String getp2Addr(){
        return parent2.getAddr();
    }

    /**
     * @param newaddress Address of parent
     */
    public void setp2Addr(String newaddress){
        parent2.setAddr(newaddress);
    }

    /**
     * 
     * @return The email of a parent 
     */
    public String getp2Email(){
        return parent2.getEmail();
    }

    /**
     * 
     * @param newemail Email of parent 
     */
    public void setp2Email(String newemail){
        parent2.setEmail(newemail);
    }

    /**
     * 
     * @return The telephone number of parent
     */
    public String getp2Number(){
        return parent2.getTelNum();
    }

    /**
     * 
     * @param newtelNum Telephone number of parent
     */
    public void setp2Number(String newtelNum){
        parent2.setTelNum(newtelNum);
    }

    /**
     * 
     * @return Information of emergency contact
     */
    public String getp2EmgContact(){
        return parent2.getEmgcon();
    }

    
    public void setp2EmgContact(String newContact){
        parent2.setEmgcon(newContact);
    }

    public String getp2Occupation(){
        return parent2.getOccupation();
    }

    public void setp2Occupation(String addr){
        parent2.setOccupation(addr);
    }

    public String getDName(){
        return d_name;
    }

    /**
     * 
     * @return The dislikes of a student
     */
    public String getDislikes(){
        st="DISLIKES:\n";
        for(String n: dislikes){
            st+= n+"\n";
        }
        return st;
    }
    
    /**
     * 
     * @return The accademic record of a student
     */
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

    /**
     * 
     * @param dislike A student's dislike
     */
    public void setDislike(String dislike){
        this.dislikes.add(dislike);
    }

    /**
     * @return Student's name
     */
    public String getName(){
        return name;
    }

    /**
     * @return Student's date of birth
     */
    public String getDOB(){
        return dob;
    }

    **
     * @return Student's gender
     */
    public Sex getSex(){
        return sex;
    }
    
    /**
     * @return Student's address
     */ 
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

    /*
    *@return Name of student's doctor
    */
    public String getDoctorName(){
        return d_name;
    }
}
