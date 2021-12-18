package com.main.admin;

public class Employee {
    private String fName;
    private String lName;
    private String email=null;
    private String pwd=null;
    private EmailAdminRunner.Dept dept;
    private EmailGenerator emailgen = new EmailGenerator();
    private EmailSettings emailSettings = new EmailSettings();

    public Employee(String fName, String lName, EmailAdminRunner.Dept dept) {
        this.fName = fName;
        this.lName = lName;
        this.dept = dept;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return String.valueOf(dept);
    }

    public void setDept(EmailAdminRunner.Dept dept) {
        this.dept = dept;
    }

    public String generateEmail(){
        this.email = emailgen.emailGenerator(this.getfName(),this.getlName(),this.getDept());
        return this.email;
    }

    public String generatePwd(){
         this.pwd =emailgen.generatePwd();
         return this.pwd;
    }

    public void changePwd(String oldPwd){
        if (oldPwd.equals(this.pwd)){

            this.pwd = emailSettings.changePwd(oldPwd);
        }
        else{
            System.out.println("Enter the correct old password");
        }
    }

    public void setMailBoxCapacityEmp (int capacity){
        emailSettings.setMailboxCapacity(capacity);
    }
    public int getMailBoxCapacityEmp(){
        return emailSettings.getMailBoxCapacity();
    }


}
