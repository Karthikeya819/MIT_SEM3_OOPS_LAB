class Controller{
    String Controller_Name;
    boolean State = false;
    int Current_Sate = 0;
    String State_Dessciption[];
    Controller(String Controller_Name,String State_Dessciption[]){
        this.Controller_Name = Controller_Name;
        this.State_Dessciption = State_Dessciption;
    }
    String Current_Sate_Description(){return State_Dessciption[Current_Sate];};
    void Toogle_State(){State = !State;}
}
class LightController extends Controller{
    static int Light_Count = 0;
    LightController(){
        super("Light-"+(++Light_Count),new String[]{"Low","Medium","High"});
    }
}
class FanController extends Controller{
    static int Fan_Count = 0;
    FanController(){
        super("Fan-"+(++Fan_Count),new String[]{"Low","Medium","High"});
    }
}
class Room{
    final static int Max_Capacity = 10;
    String Room_Name;
    Controller Controllers[];
    int Controllers_Count = 0;
    Room(String Room_Name){
        this.Room_Name = Room_Name;
        Controllers = new Controller[Max_Capacity];
    }
    void Add_Controller(Controller item){
        Controllers[Controllers_Count++] = item;
    }
}
public class Test{
    public static void main(String args[]){
        Room hall = new Room("Hall");
        hall.Add_Controller(new LightController());
        System.out.println(hall.Controllers[0].Controller_Name);
        hall.Add_Controller(new FanController());
        System.out.println(hall.Controllers[1].Controller_Name);
        hall.Add_Controller(new LightController());
        System.out.println(hall.Controllers[2].Controller_Name);
        hall.Add_Controller(new FanController());
        System.out.println(hall.Controllers[3].Controller_Name);
    }
}