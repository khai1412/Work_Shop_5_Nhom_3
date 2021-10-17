/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttaad
 */
import java.util.Scanner;
public class Experience extends Candidates {
     private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill,
            String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        if(yearExperience>=0&&yearExperience<=100){
            this.yearExperience = yearExperience;
        }
        
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        super.input();
        while(true){
            try{
                System.out.print("yearExperience: ");
                int a= Integer.parseInt(sc.nextLine());
                if(a>=0&&a<=100){
                    this.yearExperience=a;
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.print("professionalSkill: ");
        this.professionalSkill=sc.nextLine();
        
    }
    public String toString(){
        return super.toString()+" | "+this.getYearExperience()+" | "+this.getProfessionalSkill();  
    }

    
    
}
