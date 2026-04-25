public class SUV {
    private String model;
    private double basePrice;
    private String heroTheme;
    
    public SUV(String model, double basePrice, String heroTheme) {
        this.model = model;
        this.basePrice = basePrice;
        this.heroTheme = heroTheme;
    }

   
    public String getModel() { return model; }
    public double getBasePrice() { return basePrice; }
    public String getHeroTheme() { return heroTheme; }

    public void displayDetails() {
        System.out.println("Model: " + model + " | Theme: " + heroTheme + " | Base: $" + basePrice);
    }
}