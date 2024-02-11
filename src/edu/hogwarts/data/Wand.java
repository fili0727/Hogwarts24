package edu.hogwarts.data;

public class Wand extends TeachingMaterial {

  private double lengthInInches;
  private String wood;
  private String core;

  public Wand(
    double lengthInInches,
    String wood,
    String core,
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    super(name, onShoppingList, required, provided, notes);
    this.lengthInInches = lengthInInches;
    this.wood = wood;
    this.core = core;
  }

  public Wand() {}

  public double getLengthInInches() {
    return lengthInInches;
  }

  public String getWood() {
    return wood;
  }

  public String getCore() {
    return core;
  }

  public void setLengthInInches(double lengthInInches) {
    this.lengthInInches = lengthInInches;
  }

  public void setWood(String wood) {
    this.wood = wood;
  }

  public void setCore(String core) {
    this.core = core;
  }

  public String toString() {
    return (
      "Length: " +
      lengthInInches +
      " Wood: " +
      wood +
      " Core: " +
      core +
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
