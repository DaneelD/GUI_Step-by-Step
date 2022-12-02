public class GeneralEmployee extends Employee {

    /**
     * This method is used to initialise an employee by invoking a parent class constructor in Employee
     * @param name Name of employee
     * @param dob Date of birth of employee
     * @param sex Gender of employee
     * @param addr Address of employee
     * @param email Email of employee
     * @param telNum Telephone of employee
     * @param type Type of employee
     */
    public GeneralEmployee(String name, String dob, Sex sex, String addr, String email, String telNum,EType type){
        super(name,dob,sex,addr,email,telNum,type);

    }

    
}
