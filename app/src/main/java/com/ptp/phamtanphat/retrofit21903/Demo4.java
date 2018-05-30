package com.ptp.phamtanphat.retrofit21903;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Demo4 {


@SerializedName("hocphi")
@Expose
private String hocphi;


public String getHocphi() {
return hocphi;
}

public void setHocphi(String hocphi) {
this.hocphi = hocphi;
}

}