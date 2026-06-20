import java.util.Scanner;

public class questionService {
    question[] qs = new question[5];
    String selection[] = new String[5];
    public questionService() {
        qs[0] = new question(1, "size of int", "2", "6", "4", "8", "4");
        qs[1] = new question(2, "size of double", "2", "6", "4", "8", "8");
        qs[2] = new question(3, "size of char", "2", "6", "4", "8", "2");
        qs[3] = new question(4, "size of long", "2", "6", "4", "8", "8");
        qs[4] = new question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for(question q: qs){
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }
        for (String s:selection) {
            System.out.println(s);
        }
    }
    public void printScore(){
       int score = 0;
        for (int i = 0; i <5; i++) {
            question que = qs[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}