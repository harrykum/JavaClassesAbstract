class Fan extends Switch {
void SwitchOn() {
	System.out.println("Fan start rotatig");
}
void SwitchOff() {
	System.out.println("Fan Stop rotatig");
}
public static void main(String[] args) {
	Fan f1=new Fan();
	f1.SwitchOn();
	f1.SwitchOff();
}
}