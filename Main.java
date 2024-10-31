public class Main {
    public static void main(String[] args) {
       
        Essay essayExam = new Essay();

        Exam exam = new Exam();
        System.out.println("Message: " + exam.message);

        exam.price = 7000;
        System.out.println("Price: " + exam.getPrice());

        exam.status = true;
        System.out.println("Is Finished: " + exam.isFinished());
    }
}
