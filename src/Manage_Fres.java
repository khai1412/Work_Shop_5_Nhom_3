
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Manage_Fres {
       public int check(List<Fresher>a,String id){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getId().compareTo(id)==0){
                return 0;
            }
        }
        return 1;
    }
       public void create(List<Fresher>a){
        //String birth=b.getBirthDate();
        Fresher b= new Fresher();
        b.input();
        b.setTypeCandidate(1);
        if(check(a,b.getId())==1){
            a.add(b);
            System.out.println("create success !");
        } else {
            System.out.println("this candidate has exist !");
        }
        
    }
        public void search(List<Fresher>a,String name){
            int count=0;
            System.out.println("The candidates found: ");
        for(int i=0;i<a.size();i++){
            if(a.get(i).getFirstName().compareToIgnoreCase(name)==0||a.get(i).getLastName().compareToIgnoreCase(name)==0){
                System.out.println(a.get(i).toString());
            } else {
                count++;
            }
        }
        if(count==a.size()){
            System.out.println("not found this candidate");
        }
    }
}
