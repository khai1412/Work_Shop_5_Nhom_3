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
public class Internship extends Candidates {
    private String Majors;
    private String Semester;
    private String University_name;

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String University_name) {
        this.University_name = University_name;
    }
    
    public Internship(){
        
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Majors: ");
        this.Majors=sc.nextLine();
        System.out.print("Semester: ");
        this.Semester=sc.nextLine();
        System.out.print("University_name: ");
        this.University_name=sc.nextLine();
    }
    public String toString(){
        return super.toString()+" | "+this.getMajors()+" | "+this.getSemester()+" | "+this.getUniversity_name();
    }
}
