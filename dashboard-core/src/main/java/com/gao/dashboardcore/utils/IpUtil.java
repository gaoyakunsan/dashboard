package com.gao.dashboardcore.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpUtil {

  public static String getLocalIp() {

    String ip = "";
    try {
      ip = InetAddress.getLocalHost().getHostAddress();
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
    return ip;
  }

}
