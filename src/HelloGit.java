public class HelloGit {
    String message;
    HelloGit(){
        message="Hello Git";
    }
    void print(){
        System.out.println(message);
    }
    public static void main(String[] args) {
        HelloGit helloGit = new HelloGit();
        helloGit.print();
    }
}
