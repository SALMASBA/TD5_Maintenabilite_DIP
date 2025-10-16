package Tp5;

public class App {
    public static void main(String[] args) {
        Pdf doc=new Pdf();
        Mp3 music=new Mp3();
       LectureMultimedia lec=new LectureMultimedia();
       lec.play(music);
       lec.play(new Pdf());
    }
}
