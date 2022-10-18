package be.intecbrussel.enumsoefening;

public enum Brand {
    TOYOTA,
    RANGEROVER,
    BUGATTI,
    BMW;

   private Brand defaultBrand;
    private String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
        //System.out.println("Constructor is called " + this.toString());
    }

    Brand() {

    }


    public void defaultBrand() {
        System.out.println("The default brand is " + TOYOTA);
    }

}