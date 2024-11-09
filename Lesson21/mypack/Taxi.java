package Lesson21.mypack;

public class Taxi extends Vehicle implements Stopable{
    public Taxi(int crewNum) {
        this.crewNum = crewNum;
    }
    public void showCrewNum() {
        System.out.println("タクシーの乗客: " + crewNum + "人");
    }
    public void stop() {
        System.out.println("ここで降ります。");
    }
}
