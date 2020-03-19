public class GasPriceTracker {
    double gasPrice;
    String type;
// Creating setters and getters using "this." to grab class specific instanteouses 
    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGasPrice() {
        return this.gasPrice;
    }

    public String getType() {
        return this.type;
    }

    public static void main(String[] args) {

    }
}