package com.itheima.domain;

public class Product {
	private static final long serialVersionUID = 1L;
	/*`pid` varchar(32) NOT NULL,
	  `pname` varchar(50) DEFAULT NULL,
	  `market_price` double DEFAULT NULL,
	  `shop_price` double DEFAULT NULL,
	  `pimage` varchar(200) DEFAULT NULL,
	  `pdate` date DEFAULT NULL,
	  `is_hot` int(11) DEFAULT NULL,
	  `pdesc` varchar(255) DEFAULT NULL,
	  `pflag` int(11) DEFAULT NULL,
	  `cid` varchar(32) DEFAULT NULL,*/
    private String pid;
    private String pname;
    private double market_price;
    private double shop_price;
    private String pimage;
    private String pdate;
    private int is_hot;
    private String pdesc;
    private int pflag;
    private String cid;
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the pid
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the market_price
	 */
	public double getMarket_price() {
		return market_price;
	}
	/**
	 * @param market_price the market_price to set
	 */
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	/**
	 * @return the shop_price
	 */
	public double getShop_price() {
		return shop_price;
	}
	/**
	 * @param shop_price the shop_price to set
	 */
	public void setShop_price(double shop_price) {
		this.shop_price = shop_price;
	}
	/**
	 * @return the pimage
	 */
	public String getPimage() {
		return pimage;
	}
	/**
	 * @param pimage the pimage to set
	 */
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	/**
	 * @return the pdate
	 */
	public String getPdate() {
		return pdate;
	}
	/**
	 * @param pdate the pdate to set
	 */
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	/**
	 * @return the is_hot
	 */
	public int getIs_hot() {
		return is_hot;
	}
	/**
	 * @param is_hot the is_hot to set
	 */
	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}
	/**
	 * @return the pdesc
	 */
	public String getPdesc() {
		return pdesc;
	}
	/**
	 * @param pdesc the pdesc to set
	 */
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	/**
	 * @return the pflag
	 */
	public int getPflag() {
		return pflag;
	}
	/**
	 * @param pflag the pflag to set
	 */
	public void setPflag(int pflag) {
		this.pflag = pflag;
	}
	/**
	 * @return the cid
	 */
	public String getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", market_price=" + market_price + ", shop_price="
				+ shop_price + ", pimage=" + pimage + ", pdate=" + pdate + ", is_hot=" + is_hot + ", pdesc=" + pdesc
				+ ", pflag=" + pflag + ", cid=" + cid + "]";
	}
    
}
