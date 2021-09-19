/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiant;

public class Etudiant {
    
    private String nom,prénom;
    private int age;
    private static int inscription;

    public Etudiant(String nom,String prénom,int age){
        this.nom=nom;
        this.prénom=prénom;
        this.age=age;
        inscription++;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  int getInscription() {
        return inscription;
    }

    public void setInscription(int inscription) {
        Etudiant.inscription = inscription;
    }
    
}
