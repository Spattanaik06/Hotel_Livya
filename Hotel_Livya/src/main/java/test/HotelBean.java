package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class HotelBean implements Serializable
{
	private String cid,cname,caddress,cmail,cphone,cstate,ccountryString;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCstate() {
		return cstate;
	}

	public void setCstate(String cstate) {
		this.cstate = cstate;
	}

	public String getCcountryString() {
		return ccountryString;
	}

	public void setCcountryString(String ccountryString) {
		this.ccountryString = ccountryString;
	}

	public HotelBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HotelBean [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", cmail=" + cmail
				+ ", cphone=" + cphone + ", cstate=" + cstate + ", ccountryString=" + ccountryString + "]";
	}
	
}
