package Lesson17;
public class StuSample {
    public static void main(String[] args) {
        Student stu1 = new Student("西川", 1);
        Person psn = stu1;
        psn.display();
        // psn.chgStuNo(1001);

        /* 補足: instanceofキーワード
           オブジェクトのクラスを特定する
           対象オブジェクト instanceof クラス名 */
           if(psn instanceof Student) {
            Student stu2 = (Student)psn;
            stu2.chgStuNo(1001);
            stu2.display();
           }
    }
}
