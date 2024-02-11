package edu.hogwarts.data;

public class Ingredient extends TeachingMaterial {

  private String ingredientName;
  private double amount;
  private String unit;

  public Ingredient(
    String ingredientName,
    double amount,
    String unit,
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    super(name, onShoppingList, required, provided, notes);
    this.ingredientName = ingredientName;
    this.amount = amount;
    this.unit = unit;
  }

  public Ingredient() {}

  public String getIngredientName() {
    return ingredientName;
  }

  public double getAmount() {
    return amount;
  }

  public String getUnit() {
    return unit;
  }

  public void setIngredientName(String ingredientName) {
    this.ingredientName = ingredientName;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public String toString() {
    return (
      "Name: " +
      ingredientName +
      " Amount: " +
      amount +
      " Unit: " +
      unit +
      " Name: " +
      getName() +
      " On shopping list: " +
      isOnShoppingList() +
      " Required: " +
      isRequired() +
      " Provided: " +
      isProvided() +
      " Notes: " +
      getNotes()
    );
  }
}
