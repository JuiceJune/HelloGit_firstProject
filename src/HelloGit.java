/**
 * @version 1.1
 */
public class HelloGit {
    String message;
    HelloGit() {
        message = "Hello GitHub";
    }
    void print() {
        System.out.println(message);
    }
    public static void main(String[] args) {
        HelloGit helloGit = new HelloGit();
        helloGit.print();
    }
}
