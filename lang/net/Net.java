package lang.net;

import java.net.InetAddress;

import org.junit.Test;

/**
 * 1.网络编程的两个主要问题 1)如何定位网络上的一台或多态主机,定位主机上的特定应用(IPhe端口) 2)找到主机后如何高效可靠的传输数据(TCP/IP)
 * 
 * 本地回环地址: (hostAddress):127.0.0.1
 * 
 * 主机名: (hostName):localhost
 * 
 * 局域网地址: 192.168.~
 * 
 * 
 */
public class Net {

    @Test
    public void testIp() {
        try {
            InetAddress ip = InetAddress.getByName("100.68.181.13");
            System.out.println(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Net().testIp();
    }
}
