//package sbs_app;
public abstract class Person{
    protected String name;
    protected String dob;
    protected Sex sex;
    protected String address;
    protected String email;
    protected String telNum;
    
     /**
     * This method is used to initialise a person and is a parent class constructor for: Parent
     * @param name Name of person
     * @param dob Date of birth of parent
     * @param sex Gender of person
     * @param addr Address of person
     * @param email Email of person
     * @param telNum Telephone number of person
     */
    public Person(String name, String dob, Sex sex, String addr, String email, String telNum){
        this.name=name;
        this.dob=dob;
        this.sex=sex;
        this.address=addr;
        this.email=email;
        this.telNum=telNum;
    }

    /**
     * 
     * @return Name of person
     */
    public abstract String getName();
    
    /**
     * 
     * @return Date of birth of person
     */
    public abstract String getDOB();

     /**
     * 
     * @return Gender of person
     */
    public abstract Sex getSex();

    /**
     * 
     * @return The address of person
     */
    public abstract String getAddr();

    /**
     * @param newAddr Address of person
     */
    public abstract void setAddr(String newAddr);

    /**
     * 
     * @return Email of person
     */
    public abstract String getEmail();

    /**
     * 
     * @param new_Email Email of person
     */
    public abstract void setEmail(String new_Email);

    /**
     * 
     * @return Telephone number of person
     */
    public abstract String getTelNum();

    /**
     * 
     * @param Tel_num Telephone number of person
     */
    public abstract void setTelNum(String Tel_num);
}
