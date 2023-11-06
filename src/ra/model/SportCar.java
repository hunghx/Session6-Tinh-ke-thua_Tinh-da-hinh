package ra.model;

public class SportCar extends Car{
    private String light;
    private void drift(){
        System.out.println("drift ....");
    }

    public SportCar() {

    }

    public SportCar(String code, String color, String role, int count, String light) {
        super(code, color,role,count); // sử dụng hàm super() để gọi đến con structor của lớp cha
        this.light = light;
    }


    public SportCar(String code, String color, String light) {
        super(code, color);
        this.light = light;
    }

    public String getLight(){
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return super.toString()+ " light :"+light;
    }

    @Override
    public void makeSound(){
        System.out.println("tò tí te ...");
    }
}
