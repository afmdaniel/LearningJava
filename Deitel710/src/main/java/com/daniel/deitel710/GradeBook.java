package com.daniel.deitel710;

public class GradeBook {
    private String courseName; // nome do curso que essa GradeBook representa
    private int[][] grades; // array bidimensiona de notas de aluno

    // CONSTRUTOR
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
    
    // GETTERS AND SETTERS
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
    // METODOS DE INSTANCIA
    public void processGrades(){
        // gera saída de array de notas
        outputGrades();
        
        // chama metodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
        
        // gera a saída de gráfico de distribuição de nota de todas as notas em todos os teste
        outputBarChart();
    }
    
    // localiza nota mínima
    public int getMinimum(){
        // supõe que o primeiro elemento é o menor
        int lowGrade = grades[0][0];
        
        // faz um loop pelas linhas do array de notal
        for (int[] studentGrades : grades){
            // faz um loop pelas colunas da linhas atual
            for (int grade : studentGrades){
                // se a nota for menor que lowGrade, atribui a nota a lowGrade
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }
        
        return lowGrade;
    }
    
    public int getMaximum(){
        // supõe que o primeiro elemento é o menor
        int highGrade = grades[0][0];
        
        // faz um loop pelas linhas do array de notal
        for (int[] studentGrades : grades){
            // faz um loop pelas colunas da linhas atual
            for (int grade : studentGrades){
                // se a nota for menor que lowGrade, atribui a nota a lowGrade
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        
        return highGrade;
    }
    
    // determina média para o teste
    public double getAverage(int[] setOfGrades){
        int total = 0;
        
        // soma notas de um aluno
        for (int grade : setOfGrades){
            total += grade;
        }
        
        // retorna média de notas
        return (double) total / setOfGrades.length;
    }
    
    // gera a saída do gráfico de barras exibindo distribuição total de notas
    public void outputBarChart(){
        System.out.println("Overall grade distribution: ");
        
        // armazena frequência de notas em casa intervalo de 10 notas
        int[] frequency = new int[11];
        
        // para cada nota, incrementa a frequência apropriada
        for (int[] studentGrades : grades){
            for (int grade : studentGrades)
                ++frequency[grade / 10];
        }
        
        // para cada frequência de nota, imprime a barra no gráfico
        for (int count = 0; count < frequency.length; count++){
            // gera saída do rótulo de barra
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
        
            // imprime barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++){
                System.out.print("X");
            }
            
            System.out.println();
        }
    }
    
    // gera a saída do conteúdo do array de notas
    public void outputGrades(){
        System.out.printf("The grades are: \n\n");
        System.out.print("            "); // alinha títulos de coluna
        
        // cria um título de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }
        
        System.out.println("Average"); // título da coluna de média do aluno
        
        // cria linhas/colunas de texto que representam notas de array
        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            
            for (int test : grades[student]){
                System.out.printf("%8d", test);
            }
            
            // chama o método getAverage para calcular a média do aluno;
            // passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
