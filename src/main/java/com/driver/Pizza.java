package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private boolean isBillAdd = false;
    private int extraCheese = 80;
    private int extraTopping = 70;
    private int extraToppingNV = 120;
    private int paperBag = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isPaperBagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
//        basePrice =  price;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded == false) {
            isExtraCheeseAdded = true;
            this.price += extraCheese;
            this.bill += "Extra Cheese Added: " + extraCheese + "\n";
        }
//        }else{
//            this.price += extraCheeseNV;
//        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded == false) {
            isExtraToppingAdded = true;
            int addTopping = isVeg ? extraTopping : extraToppingNV;
            this.price += addTopping;
            this.bill += "Extra Toppings Added: " + addTopping + "\n";
//            this.price += extraTopping;

        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false) {
            isPaperBagAdded = true;
            this.price += paperBag;
            this.bill += "Paperbag Added: " + paperBag + "\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillAdd==false)
        {
            bill+="Total Price: "+price+"\n";
            isBillAdd=true;
        }
        return bill;
//        bill = "Base Price Of The Pizza: " + basePrice + "\n";
//        if(isExtraCheeseAdded){
//            bill += "Extra Cheese Added: " + (isVeg ? extraCheese : extraCheeseNV) + "\n";
//        }
//        if(isExtraToppingAdded){
//            bill += "Extra Toppings Added: " + (isVeg ? extraTopping : extraToppingNV) + "\n";
//        }
//        if(isPaperBagAdded){
//            bill += "Paperbag Added: " + paperBag + "\n";
//        }
//        bill += "Total Price: " + this.price + "\n";
//        return this.bill;

    }
}
