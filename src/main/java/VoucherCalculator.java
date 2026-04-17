public class VoucherCalculator {

    public double calculateFinalPrice(double cartTotal, double shippingFee, double voucherValue) {
        
        double finalPrice = cartTotal + shippingFee - voucherValue;
        
        // Đã sửa lỗi: Rào chắn bảo vệ không cho phép giá trị âm
        return Math.max(0, finalPrice);
    }
}
