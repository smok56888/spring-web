package smok.springmvc.model.vo;

public class RequestBaseVo {

	private String imei;

	private String ip;

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestBaseVo [");
		if (imei != null)
			builder.append("imei=").append(imei).append(", ");
		if (ip != null)
			builder.append("ip=").append(ip);
		builder.append("]");
		return builder.toString();
	}

}
