import animate.controller.Controller;
import animate.model.MoveObject;
import animate.view.View;

public class hari {
public static void main(String[] args) {
	
MoveObject m=new MoveObject();
View v=new View();
	
Controller cont =new Controller(m,v);
	
cont.call();
	
}

}
