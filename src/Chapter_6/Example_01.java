package Chapter_6;

public class Example_01 {
    public static void main(String[] args) {
        float[] studentScores = new float[3];
        studentScores[0] = 23.2f;
        studentScores[1] = 45.5f;
        studentScores[2] = studentScores[0] + studentScores[1];
        int chosenStudent = 2;
        System.out.println(studentScores[chosenStudent]); // 68.7
    }
}
