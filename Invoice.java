class Invoice{
        String number;
        String description;
        int quantity;
        double price;
        Invoice(String num, String dpt,int qty,double pricepr){
            number=num;
            description=dpt;
            quantity=qty;
            price=pricepr;
       }
            void setNumber(String num){
                        number=num;
            }
            void setDescription(String dpt){
                         description=dpt;
            }
            void setQuantity(int qty){
                        quantity=qty;
            }
            void setPrice(double pricepr){
                        price=pricepr;
            }
            String getNumber(){
                        return number;
            }
            String getDescription(){
                        return description;
            }
            int getQuantity(){
                        return quantity;
            }
            double getPrice(){
                        return price;
            }
      
            double getInvoiceAmount(){
                       double invoiceAmount; 
                        if(quantity<0){
                                    invoiceAmount=0;
                        }
                        else if(price<0.0){
                                    invoiceAmount=0.0;
                        }
                        else{
                                    invoiceAmount=quantity*price;
                        }
                       return invoiceAmount;
            }
        public static void main(String []args){
                   Invoice myinvoice=new Invoice("19BQ1A05K1","FIRST INVOICE",2,7.0);
                   System.out.println("Number:"+myinvoice.getNumber());
                   System.out.println("Description:"+myinvoice.getDescription()); 
                   System.out.println("quantity:"+myinvoice.getQuantity());
                   System.out.println("price:"+myinvoice.getPrice());
                   System.out.println("Invoiceamount:"+myinvoice.getInvoiceAmount());   

                
        }
  

}







