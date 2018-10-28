public class Application{
    private static int quantity = 10;
    private static int unitPrice = 100;

    private static int taxRate(){
        return 1; // 仮で固定値を返す
    }

    private static int shippingCost(int basePrice){
        // 送料算出ロジックが別のクラスでも使われると仮定して、独立したクラスに実装する
        ShippingCost cost = new ShippingCost(basePrice);
        return cost.amount();
    }

    public static void main(String[] args){
        final int basePrice = quantity * unitPrice;
        final int shippingCost = shippingCost(basePrice);
        final int itemPrice = (basePrice + shippingCost) * taxRate();
        System.out.println("itemPrice = " + itemPrice);
    } 
}
