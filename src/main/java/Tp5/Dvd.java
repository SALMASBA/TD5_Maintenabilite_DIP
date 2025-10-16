package Tp5;

public class Dvd implements IMedia {
    private void visualiser(){
        System.out.println(" Regardant Dvd");
    }

    @Override
    public void read() {
        this.visualiser();
    }
}
