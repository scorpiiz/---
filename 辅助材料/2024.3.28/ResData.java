package com.model;

/**
 * (ResData)json实体类
 */
public class ResData implements java.io.Serializable{
	
	private static final long serialVersionUID = 878282275653888L;

	private Integer code=0; 
	private Integer uuid;  
	private String msg="操作成功"; 
	private String tip;  
    private Object data;  
	private Object data2;  
	private Object data3; 
	private Object data4;  
	private Object data5;  
	private Object data6;
	private Integer total;  
	private Object datacid;  
	private Object datatid;  
	private Object datasid;
	private Object datauid;
    private Object datapid;
    private Object datakid;
	private Object datatag;

	public Integer getcode() {
	    return code;
	}

	public void setCode(Integer code) {
	    this.code = code;
	}

	public Integer getUuid() {
	    return uuid;
	}

	public void setUuid(Integer uuid) {
	    this.uuid = uuid;
	}


	public String getMsg() {
	    return msg;
	}

	public void setMsg(String msg) {
	    this.msg = msg;
	}
	
	public String getTip() {
	    return tip;
	}

	public void setTip(String tip) {
	    this.tip = tip;
	}

	public Object getData() {
	    return data;
	}

	public void setData(Object data) {
	    this.data = data;
	}
	
	public Object getData2() {
	    return data2;
	}

	public void setData2(Object data2) {
	    this.data2 = data2;
	}

	public Object getData3() {
	    return data3;
	}

	public void setData3(Object data3) {
	    this.data3 = data3;
	}

	public Object getData4() {
	    return data4;
	}

	public void setData4(Object data4) {
	    this.data4 = data4;
	}

	public Object getData5() {
	    return data5;
	}

	public void setData5(Object data5) {
	    this.data5 = data5;
	}

	public Object getData6() {
	    return data6;
	}

	public void setData6(Object data6) {
	    this.data6 = data6;
	}

   public Integer getTotal() {
	    return total;
	}

	public void setTotal(Integer total) {
	    this.total = total;
	}

	public Object getDatacid() {
	    return datacid;
	}

	public void setDatacid(Object datacid) {
	    this.datacid = datacid;
	}
	public Object getDatapid() {
	    return datapid;
	}

	public void setDatapid(Object datapid) {
	    this.datapid = datapid;
	}
	public Object getDatasid() {
	    return datasid;
	}

	public void setDatasid(Object datasid) {
	    this.datasid = datasid;
	}
	public Object getDatatid() {
	    return datatid;
	}

	public void setDatatid(Object datatid) {
	    this.datatid = datatid;
	}

	public Object getDatauid() {
	    return datauid;
	}

	public void setDatauid(Object datauid) {
	    this.datauid = datauid;
	}

    public Object getDatatag() {
	    return datatag;
	}

	public void setDatatag(Object datatag) {
	    this.datatag = datatag;
	}
	
	public Object getDatakid() {
	    return datakid;
	}

	public void setDatakid(Object datakid) {
	    this.datakid = datakid;
	}


}

