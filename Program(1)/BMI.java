public class BMI {
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private static final double KILO_PER_POUND = 0.45359237;
    private static final double METER_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

	public BMI(String name, int age, double weight, double feet, double inches){
		this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
	}

    double getBMI(){
        return weight*KILO_PER_POUND / (((12*feet+inches)*METER_PER_INCH) * ((12*feet+inches)*METER_PER_INCH));
    }

    public String getStat(){
        double BMI = getBMI();
        if(BMI < 18.5)
            return "Underweight";
        else if(BMI < 25)
            return "Normal";
        else if(BMI < 30)
            return "Overweight";
        else
            return "Obese";
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    double getWeight(){
        return weight;
    }

    double getFeet(){
        return feet;
    }

    double getInches(){
        return inches;
    }
}
