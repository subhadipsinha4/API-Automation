package model;
import java.util.List;

public class HttpBinRequest {

        private Customer customer;
        private ShippingAddress shippingAddress;
        private List<Item> items;
        private Payment payment;

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public ShippingAddress getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Payment getPayment() {
            return payment;
        }

        public void setPayment(Payment payment) {
            this.payment = payment;
        }

        // Customer
        public static class Customer {
            private int customerId;
            private String name;
            private String email;

            public int getCustomerId() {
                return customerId;
            }

            public void setCustomerId(int customerId) {
                this.customerId = customerId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        // ShippingAddress
        public static class ShippingAddress {
            private String city;
            private String state;
            private String country;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }

        // Item
        public static class Item {
            private int productId;
            private String productName;
            private int quantity;
            private int price;

            public int getProductId() {
                return productId;
            }

            public void setProductId(int productId) {
                this.productId = productId;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }

        // Payment
        public static class Payment {
            private String method;
            private int amount;

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }
        }
}
