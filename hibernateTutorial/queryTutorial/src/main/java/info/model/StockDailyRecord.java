package info.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stock_details")
public class StockDailyRecord implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@GeneratedValue(generator="dummy")
	@GenericGenerator(name="dummy",strategy="com.CustomGenerator")*/
	private Integer recordId;
	
	@ManyToOne
	@JoinColumn(name="stock_id")
	private Stock stock;
	
	@Column(name="open_price")
	private Float priceOpen;
	
	@Column(name="volume")
	private Long volume;
	
	@Temporal(TemporalType.DATE)
	private Date date;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Float getPriceOpen() {
		return priceOpen;
	}

	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}

	public Long getVolume() {
		return volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
