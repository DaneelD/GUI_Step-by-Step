public class Parent extends Person {
    private String occupation;
    private String emgContact;

     /**
     * This method is used to initialise an parent by invoking a parent class constructor in Person
     * @param name Name of parent
     * @param dob Date of birth of paretn
     * @param sex Gender of parent
     * @param addr Address of parent
     * @param email Email of parent
     * @param telNum Telephone number of parent
     * @param emgContact Name of Emergency contact
     * @param occupation Occupation of parent
     */
    public Parent(String name, String dob, Sex sex, String addr, String email, String telNum,String emgContact,String occupation){
        super(name,dob,sex,addr,email,telNum);
        this.emgContact=emgContact;
        this.occupation=occupation;
    }

    /**
     * @return Returns the name of a parent
     */
    public String getName(){
        return name;
    }

    /**
     * @return Returns the date of birth of a parent
     */    
    public String getDOB(){
        return dob;
    }

    /**
     * @return Returns the sex of a parent
     */
    public Sex getSex(){
        return sex;
    }

    /**
     * @return Returns the address of a parent
     */
    public String getAddr(){
        return address;
    }

    /**
     * @param newAddr Address of a parent
     */
    public void setAddr(String newAddr){
        this.address=newAddr;
    }

    /**
     * @return Returns the email of a parent
     */
    public String getEmail(){
        return email;
    }

    /**
     * @param new_Email Email of a parent
     */
    public void setEmail(String new_Email){
        this.email=new_Email;
    }

    /**
     * @return The telephone number of a parent
     */
    public String getTelNum(){
        return telNum;
    }

    /**
     * @param new_Telnum Telephone number of a parent
     */
    public void setTelNum(String new_Telnum){
        this.telNum=new_Telnum;
    }

    /**
     * @return The occupation of parent
     */
    public String getOccupation(){
        return occupation;
    }

    /**
     * @param new_Occupation Occupation of parent
     */
    public void setOccupation(String new_Occupation){
        this.occupation=new_Occupation;
    }

    /**
     * @return Emergency contact information
     */
    public String getEmgcon(){
        return emgContact;
    }

    /**
     * @param new_Emgcon Emergency contact
     */
    public void setEmgcon(String new_Emgcon){
        this.emgContact=new_Emgcon;
    }
}
