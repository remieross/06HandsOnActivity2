class Exam {
    String message;
    
    double price;

    boolean status;

    public Exam() {
        this.message = "Good luck.";
    }

    public Exam(String period, String level) {
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }
}