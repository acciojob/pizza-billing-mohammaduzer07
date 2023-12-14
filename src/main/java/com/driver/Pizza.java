package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";
    private int basePrice;
    private int extraCheese = 80;
    private int extraTopping = 70;
    private int paperBag = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isPaperBagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePrice = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
//        isExtraCheeseAdded = true;
////        System.out.println("Extra cheese added");
//        if(this.isVeg == true) {
//            this.price += 80;
//        }else{
//            this.price += 80;
//        }
        if (!isExtraCheeseAdded) {
            isExtraCheeseAdded = true;
            this.price += extraCheese;
            bill += "Extra Cheese Added: " + extraCheese + "\n";
        } else {
            bill += "Extra Cheese is already added.\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
//        isExtraToppingAdded = true;
////        System.out.println("Extra toppinga added");
//        if(this.isVeg == true) {
//            this.price += 70;
//        }else{
//            this.price += 120;
//        }
        if (!isExtraToppingAdded) {
            isExtraToppingAdded = true;
            this.price += (isVeg ? extraTopping : 120);
            bill += "Extra Toppings Added: " + (isVeg ? extraTopping : 120) + "\n";
        } else {
            bill += "Extra Toppings are already added.\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
//        isPaperBagAdded = true;
////        System.out.println("PaperBag opted");
//        this.price += paperBag;
        if (!isPaperBagAdded) {
            isPaperBagAdded = true;
            this.price += paperBag;
            bill += "Take away " + paperBag + "\n";
        } else {
            bill += "Paperbag is already added.\n";
        }
    }

    public String getBill(){
        // your code goes here
//        System.out.println("Base pizza price " + basePrice);
//        if(isExtraCheeseAdded){
//            bill += "Extra cheese Added "+ extraCheese + "\n";
//        }
//        if(isExtraToppingAdded){
//            bill += "Extra Topping Added " + extraTopping + "\n";
//        }
//        if(isPaperBagAdded){
//            bill += "Take away " + paperBag + "\n";
//        }
//        bill += "Bill " + this.price + "\n";
//        return this.bill;
        if (bill == null) {
            return "Bill is not generated.";
        }
        bill += "Bill " + this.price + "\n";
        return bill;

    }
}
