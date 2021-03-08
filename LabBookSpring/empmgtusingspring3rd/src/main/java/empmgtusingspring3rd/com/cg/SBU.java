package empmgtusingspring3rd.com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	@Value("${sbu.id}")
	private int sbuId;
	@Value("${sbu.name}")
	private String sbuName;
	@Value("${sbu.head}")
	private String sbuHead;
	public SBU() {}
	public SBU(int sbuId, String sbuName, String sbuHead) {
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public int hashCode() {
		return sbuId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SBU other = (SBU) obj;
		if (sbuId != other.sbuId)
			return false;
		return true;
	}

}
