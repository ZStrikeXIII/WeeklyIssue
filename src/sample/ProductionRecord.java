package sample;

import java.util.Date;

public class ProductionRecord {

  int productionNumber;
  int productID;
  String serialNumber;
  Date dateProduced;

  public ProductionRecord(int productionNumber, int productID, String serialNumber,
      Date dateProduced) {
    this.productionNumber = productionNumber;
    this.productID = productID;
    this.serialNumber = serialNumber;
    this.dateProduced = dateProduced;

  }

  public ProductionRecord(Product productProduced, int i) {
    //this.serialNumber = "AppAU00000";
    this.serialNumber = productProduced.manufacturer.substring(0,3) + productProduced.type.code +  String.format("%05d" , i);
    this.dateProduced = new Date();
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

  public ProductionRecord(int productIdent) {
    this.productionNumber = 0;
    this.productID = productIdent;
    this.serialNumber = "0";
    this.dateProduced = new Date();
  }

  public String toString() {
    return "Prod. Num: " + productionNumber + " Product ID: " + productID + " Serial Num: "
        + serialNumber + " Date: " + dateProduced;
  }
}
