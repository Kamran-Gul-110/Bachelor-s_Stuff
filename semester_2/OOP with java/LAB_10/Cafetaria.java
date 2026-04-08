class Meal {
    private String mealName;
    private double listPrice;

    public Meal(String mealName, double listPrice) {
        this.mealName = mealName;
        this.listPrice = listPrice;
    }

    public void display() {
        System.out.println("Meal: " + mealName);
        System.out.println("List Price: " + listPrice);
    }

    public double price() {
        return listPrice;
    }
}

class StudentMeal extends Meal {

    public StudentMeal(String mealName, double listPrice) {
        super(mealName, listPrice);
    }

    @Override
    public double price() {
        return super.price() * 0.50; // 50% discount
    }
}

class FacultyMeal extends Meal {

    public FacultyMeal(String mealName, double listPrice) {
        super(mealName, listPrice);
    }

    @Override
    public double price() {
        return super.price() * 0.75; // 25% discount
    }
}

class Main {
    public static void main(String[] args) {
        Meal m = new Meal("Biryani", 300);
        StudentMeal sm = new StudentMeal("Biryani", 300);
        FacultyMeal fm = new FacultyMeal("Biryani", 300);

        System.out.println("=== Meal ===");
        m.display();
        System.out.println("Price: " + m.price());

        System.out.println("\n=== Student Meal ===");
        sm.display();
        System.out.println("Price: " + sm.price());

        System.out.println("\n=== Faculty Meal ===");
        fm.display();
        System.out.println("Price: " + fm.price());
    }
}