package EnumClass;

public class Pizza {
  private PizzaStatus pizzaStatus;

  public boolean isDeliverable() {
    if (this.getStatus() == PizzaStatus.READY) {
      return true;
    }
    return false;
  }

  public PizzaStatus getStatus() {
    return this.pizzaStatus;
  }

  public void setStatus(PizzaStatus status){
    this.pizzaStatus = status;
  }
}
