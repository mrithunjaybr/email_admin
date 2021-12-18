package com.main.admin;

import java.util.Scanner;

public class EmailSettings {
    EmailGenerator emailGen = new EmailGenerator();
    String alternateEmail = "";
    private int cap = 0 ;

    public EmailSettings() {
    }

    public void alternateEmailAddress(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String changePwd(String oldPwd) {
        System.out.println("Enter new Pwd");
        Scanner scan = new Scanner(System.in);
        String newPwd = scan.nextLine();
        System.out.println("Password has been changed");
        return newPwd;
    }


    public void setMailboxCapacity(int cap){
        this.cap = cap;
    }
    public int getMailBoxCapacity(){
        return this.cap;
    }
}
