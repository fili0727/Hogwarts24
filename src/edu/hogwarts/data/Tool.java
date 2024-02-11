package edu.hogwarts.data;

public class Tool extends TeachingMaterial {

  private String toolName;
  private String description;

  public Tool(
    String name,
    String toolName,
    String description,
    boolean onShoppingList,
    boolean required,
    boolean provided,
    String notes
  ) {
    super(name, onShoppingList, required, provided, notes);
    this.description = description;
    this.toolName = toolName;
  }

  public Tool() {}

  public String getToolName() {
    return toolName;
  }

  public String getDescription() {
    return description;
  }

  public void setToolName(String toolName) {
    this.toolName = toolName;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    return (
      "Description: " +
      description +
      " Tool Name: " +
      toolName +
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
