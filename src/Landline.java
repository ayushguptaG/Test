public class Landline implements Phone {

    private boolean powerOn;
    private boolean isRinging;
    private String myPhoneNo;
    public static String dialNo;

    public Landline(String myPhoneNo){

        this.myPhoneNo= myPhoneNo;
        powerOn= true;
        isRinging= false;
    }
    @Override
    public void powerOn() {
        powerOn= true;
    }

    @Override
    public void dialNo(String phoneNo) {
        dialNo= phoneNo;
        System.out.println("Dialing number "+ dialNo);
    }

    @Override
    public boolean answerPhone() {
        if(isRinging== true){

            System.out.println("Pickup the phone...");
            isRinging= false;
            return true;
        }
        return false;
    }

    @Override
    public boolean phoneReceive() {

        if(myPhoneNo.equals(dialNo)){
            System.out.println("Call Received from "+ dialNo);
            isRinging= true;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        if(isRinging== true)
            return true;

        return false;
    }
}
