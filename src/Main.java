import ra.model.Calculator;
import ra.model.Car;
import ra.model.FamilyCar;
import ra.model.SportCar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        sportCar.setCode("PX001");
        sportCar.setColor("Red");
        sportCar.setCount(2);
        sportCar.setRole("V4");
        sportCar.setLight("Blue");
        System.out.println(sportCar);

        sportCar.makeSound();

// nạp chồng phương thức
        Calculator cal = new Calculator();
//       tổng của 2 số là
        System.out.println(cal.sum(7,9));
        // tổng 3 số
        System.out.println(cal.sum(1,2,3));
            // tổng 4 số
        System.out.println(cal.sum(1,2,3,4));


//         DynamicBinding
        Car c1 = new SportCar(); // ép kiểu về ô tô
        Car c2 =  new FamilyCar();
        System.out.println(c1.toString());
        // ép kiểu từ lớp con về lớp cha - ép kiểu ngầm định
        Car car = sportCar;
//        ép ngược từ lớp cha về lớp con - ép kiểu tường minh

        // toán tử instance of
        if(c1 instanceof SportCar){
            SportCar sp = (SportCar) c1;
            System.out.println(sp);
        }
        if(c2 instanceof SportCar){
            SportCar sp = (SportCar) c2;
            System.out.println(sp);
        }


        Car c3 =new Car("S001","Yellow");
        if(c3 instanceof SportCar) {
            sportCar = (SportCar) c3;
            System.out.println(c3);
        }

    }
}