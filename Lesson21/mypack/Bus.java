package Lesson21.mypack;

public class Bus extends Vehicle implements Stopable{
    public Bus(int crewNum) {
        this.crewNum = crewNum;
    }
    public void showCrewNum() {
        System.out.println("バスの乗客: " + crewNum + "人");
    }
    public void stop() {
        System.out.println("次降ります。");
    }
}
