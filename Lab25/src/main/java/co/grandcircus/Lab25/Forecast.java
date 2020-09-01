package co.grandcircus.Lab25;

import javax.tools.DocumentationTool.Location;

public class Forecast {
private Location location;
private Data data;
private String productionCenter;


public String getProductionCenter() {
	return productionCenter;
}
public void setProductionCenter(String productionCenter) {
	this.productionCenter = productionCenter;
}
public Forecast() {
	super();
}
public Location getLoc() {
	return location;
}
public void setLoc(Location loc) {
	this.location = loc;
}
public Data getData() {
	return data;
}
public void setData(Data data) {
	this.data = data;
}


}