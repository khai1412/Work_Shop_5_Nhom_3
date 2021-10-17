/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttaad
 */
import java.util.Calendar;
import java.util.Scanner;
public class Candidates {
     private String id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int typeCandidate;

    public Candidates() {
    }

    public Candidates(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCandidate = typeCandidate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        if(birthDate>=1000){
            this.birthDate = birthDate;
        }
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length()>=10){
            this.phone = phone;
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName + " | " + this.birthDate + " | "
                + this.address + " | " + this.phone + " | " + this.email + " | "
                + this.typeCandidate;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        this.id=sc.nextLine();
        System.out.print("firstName: ");
        this.firstName=sc.nextLine();
        System.out.print("lastName: ");
        this.lastName=sc.nextLine();
        while(true){
            try{
                System.out.print("birthDate: ");
                int a= Integer.parseInt(sc.nextLine());
                Calendar c= Calendar.getInstance();
                if(a>=1900&&a<=c.get(Calendar.YEAR)){
                    this.birthDate=a;
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.print("address: ");
        this.address=sc.nextLine();
                while(true){
            try{
                System.out.print("phone: ");
                String a= sc.nextLine();
                if(a.length()>=10){
                    this.phone=a;
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        System.out.print("email: ");
        this.email=sc.nextLine();
//        System.out.print("typeCandidate: ");
//        this.typeCandidate=sc.nextInt();
   
    }
}
