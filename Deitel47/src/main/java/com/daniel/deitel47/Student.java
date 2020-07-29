package com.daniel.deitel47;

public class Student{
    // VARIAVEIS DE INSTANCIA
    private String name;
    private double average;
    
    // CONSTRUTOR INICIALIZA VARIAVEIS DE INSTANCIA
    public Student(String name, double average){
        this.name = name;
        if (average > 0.0 && average <= 100)
            this.average = average;
    }
    
    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        if (average > 0.0 && average <= 100)
            this.average = average;
    }
    
    // DETERMINA E RETORNA A LETRA DA NOTA STUDENT
    public String getLetterGrade(){
        String letterGrade = "";
        if (average >= 90)
            letterGrade = "A";
        else if (average >= 80)
            letterGrade = "B";
        else if (average >= 70)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else 
            letterGrade = "F";
        
        return letterGrade;            
    }
}