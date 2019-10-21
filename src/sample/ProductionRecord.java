package sample;

import java.util.Date;

public class ProductionRecord {

  int productionNumber;
  int productID;
  String serialNumber;
  Date dateProduced;

  public ProductionRecord(int productionNumber, int productID, String serialNumber,
      Date dateProduced) {

  }

  public int getProductionNum() {
    return productionNumber;
  }

  public void setProductionNum(int prodNum) {
    this.productionNumber = prodNum;
  }

  public int getProductID() {
    return productID;
  }

  public void setProductID(int prodID) {
    this.productID = prodID;
  }

  public String getSerialNum() {
    return serialNumber;
  }

  public void setSerialNum(String serNum) {
    this.serialNumber = serNum;
  }

  public Date getProdDate() {
    return dateProduced;
  }

  public void setProdDate(Date dtProd) {
    this.dateProduced = dtProd;
  }
}
