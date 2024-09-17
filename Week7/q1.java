import com.course.structure.*;

class q1{
    public static void main(String args[]){
        House h1 = new House(2000,2,3,3);
        h1.setSquareFeets(2500);
        System.out.println(h1.getSquareFeets());
        h1.setnoOfBedRomms(4);
        System.out.println(h1.getnoOfBedRomms());

        School s1 = new School(5000,4,30,"High school");
        s1.setStories(5);
        System.out.println(s1.getnoOfClassRooms());
        s1.setgradeLevel("University");
        System.out.println(s1.getgradeLevel());
    }
}