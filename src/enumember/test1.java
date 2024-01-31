package enumember;


// can condition check
// if and switch
public class test1 {
    public static void main(String[] args) {
        Status status = Status.Success;  // enum can't be instantiated
        //System.out.println(status);
        if (status == Status.Fail) {
            System.out.println("Try Again");
        } else if (status == Status.Pending) {
            System.out.println("Please Wait");
        }
        System.out.println("=================");
        switch (status) {
            case Fail :
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Default");
        }
    }
}
enum Status {
    Running,Pending,Fail,Success;
}
