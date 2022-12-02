public class Employee extends Person {
    private EType type;

    /**
     * This method is used to initialise an employee by invoking a parent class constructors in Person
     * @param name Name of employye
     * @param dob Date of birth of employee
     * @param sex Gender of employee
     * @param addr Address of emplyee
     * @param email Email of employee
     * @param telNum Telephone number of employee
     * @param type Type of employee
     */

    public Employee(String name, String dob, Sex sex, String addr, String email, String telNum,EType type){
        super(name,dob,sex,addr,email,telNum);
        this.type=type;
    }

    /**
     * 
     * @return Returns the type of employee
     */
    public EType getType(){
        return type;
    }

    /**
     * 
     * @return Returns the name of an employee
     */
    public String getName(){
        return name;
    }

    /**
     * @return Returns the date of birth of an amployee
     */
    public String getDOB(){
        return dob;
    }

    /**
     * @return Returnes the gender of an employee
     */
    public Sex getSex(){
        return sex;
    }
    
    /**
     * @return Returns the address of an employee
     */
    public String getAddr(){
        return address;
    }

    /**
     * @param newAddr The address of an employee
     */
    public void setAddr(String newAddr){
        this.address=newAddr;
    }

    /** 
    * @return Returns the email of an employee
    */
    public String getEmail(){
        return email;
    }

    /**
     * @param new_Email The email of an employee
     */
    public void setEmail(String new_Email){
        this.email=new_Email;
    }

    /**
     * @return Returns the telephone number of an employee
     */
    public String getTelNum(){
        return telNum;
    }

    /**
     * @param Tel_num The telephone number of an employee
     */
    public void setTelNum(String Tel_num){
        this.telNum=Tel_num;
    }
}
