package ra.model;

public class FamilyCar extends Car{
    private String bed;
    public void camping(){
        System.out.println("go to camp...");
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }
}
