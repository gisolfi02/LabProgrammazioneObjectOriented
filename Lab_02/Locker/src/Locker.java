public class Locker {

    private boolean isOpen;
    private String code;

    public Locker() {
        isOpen = true;
        code = "";
    }

    public void unlock(String code) {
        if(this.code.compareTo(code)==0)
            isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void lock() {
        isOpen = false;
    }

    public void newComb(String newCode) {
        if(isOpen)
            code = newCode;
    }

}