package edu.hogwarts.data;

public abstract class TeachingMaterial {

  private String name;
  private boolean onShoppingList;
  private boolean required;
  private boolean provided;
  private String notes;

  public TeachingMaterial(
    String name,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    this.name = name;
    this.onShoppingList = onShoppingList;
    this.required = required;
    this.provided = provided;
    this.notes = notes;
  }

  public TeachingMaterial() {}

  public String getName() {
    return name;
  }

  public boolean isOnShoppingList() {
    return onShoppingList;
  }

  public boolean isRequired() {
    return required;
  }

  public boolean isProvided() {
    return provided;
  }

  public String getNotes() {
    return notes;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOnShoppingList(boolean onShoppingList) {
    this.onShoppingList = onShoppingList;
  }

  public void setRequired(boolean required) {
    this.required = required;
  }

  public void setProvided(boolean provided) {
    this.provided = provided;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String toString() {
    return (
      "Teaching material: " +
      name +
      " On shopping list: " +
      onShoppingList +
      " Required: " +
      required +
      " Provided: " +
      provided +
      " Notes: " +
      notes
    );
  }
}
