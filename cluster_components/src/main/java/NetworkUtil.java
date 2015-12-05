import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class NetworkUtil {
    public static SocketAddress getAddress(String address) {
        String[] strs = address.split(":");
        if (strs.length == 2) {
            return new InetSocketAddress(strs[0], Integer.parseInt(strs[1]));
        } else {
            throw new IllegalStateException();
        }
    }
}