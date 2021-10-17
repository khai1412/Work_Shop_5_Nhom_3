
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttaad
 */
public class Main {
    public static void main(String[] args) {
        List<Experience> a = new ArrayList<Experience>();
        List<Fresher> b= new ArrayList<Fresher>();
        List<Internship> c= new ArrayList<Internship>();
        Scanner sc = new Scanner(System.in);
        //memu
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1.	Experience");
        System.out.println("2.	Fresher");
        System.out.println("3.	Internship");
        System.out.println("4.	Searching");
        System.out.println("5.	Exit");
 
        int check1=1;
        while(check1==1){
            int check=0;
            while(true){
            try{
                System.out.print("Choose case from 1 to 5: ");
                check=Integer.parseInt(sc.nextLine());
                if(check>=1&&check<=5){
                    break;
                } else {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        switch (check){
            case 1:
                Manage_EX ex1 = new Manage_EX();
                ex1.create(a);
                break;
            case 2:
                Manage_Fres fres1=new Manage_Fres();
                fres1.create(b);
                break;
            case 3:
                Manage_Intern intern1= new Manage_Intern();
                intern1.create(c);
                break;
            case 4:
                System.out.println("===========EXPERIENCE CANDIDATE============");
                for(int i=0;i<a.size();i++){
                    System.out.println(a.get(i).getFirstName()+" "+a.get(i).getLastName());
                }
                System.out.println("===========FRESHER CANDIDATE==============");
                for(int i=0;i<b.size();i++){
                    System.out.println(b.get(i).getFirstName()+" "+b.get(i).getLastName());
                }
                System.out.println("===========INTERN CANDIDATE==============");
                for(int i=0;i<c.size();i++){
                    System.out.println(c.get(i).getFirstName()+" "+c.get(i).getLastName());
                }
                System.out.print("Input Candidate name (First name or Last name): ");
                String name=sc.nextLine().trim();
                int type =-1;
                while(true){
                try{
                   System.out.print("Input type of candidate: ");
                   type=Integer.parseInt(sc.nextLine());
                   if(type>=0&&type<=2){
                      break;
                   } else {
                     throw new Exception();
                  }
                  }catch(Exception e){
                    System.out.println(e);
                  }
                
                }
                if(type==0){
                    Manage_EX ex2 = new Manage_EX();
                    ex2.search(a, name);
                } else if(type ==1){
                    Manage_Fres fres2=new Manage_Fres();
                    fres2.search(b, name);
                } else {
                    Manage_Intern intern2= new Manage_Intern();
                    intern2.search(c, name);
                }
                break;
            case 5:
                check1=0;
                break;
        }
      }
        
    }
}
