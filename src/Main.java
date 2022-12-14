public class Main {
    public static void main(String[] args) {

        Landline user1= new Landline("8879");
        Landline user2= new Landline("9521");
        user2.dialNo= "8879";
        user2.dialNo(user2.dialNo);
        user1.phoneReceive();

        user1.answerPhone();
    }
}