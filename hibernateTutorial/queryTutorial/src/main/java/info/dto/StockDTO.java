package info.dto;

public class StockDTO {
	
	private String stockName;
	private Float openPrice;
	private Long volume;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public Float getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(Float openPrice) {
		this.openPrice = openPrice;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return this.stockName+" == "+this.openPrice+" == "+this.volume;
	}

}
