/*
 * �������� 2005-5-4
 *
 */
package radius.server.service.pojo;

import java.io.Serializable;

/**
 * @author <a href="mailto:zzzhc0508@hotmail.com">zzzhc </a>
 *  
 */
public class Proxy implements Serializable {
    public static final String AUTH_TYPE = "auth";

    public static final String ACCOUNT_TYPE = "account";

    public static final String ALL_TYPE = "all";

    private String fromIp;

    private String toIp;

    private String type;

    private int fromPort;

    private int toPort;

    /**
     * @return ���� fromIp��
     */
    public String getFromIp() {
        return fromIp;
    }

    /**
     * @param fromIp
     *            Ҫ���õ� fromIp��
     */
    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    /**
     * @return ���� fromPort��
     */
    public int getFromPort() {
        return fromPort;
    }

    /**
     * @param fromPort
     *            Ҫ���õ� fromPort��
     */
    public void setFromPort(int fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * @return ���� targetPort��
     */
    public int getToPort() {
        return toPort;
    }

    /**
     * @param targetPort
     *            Ҫ���õ� targetPort��
     */
    public void setToPort(int toPort) {
        this.toPort = toPort;
    }

    /**
     * @return ���� toIp��
     */
    public String getToIp() {
        return toIp;
    }

    /**
     * @param toIp
     *            Ҫ���õ� toIp��
     */
    public void setToIp(String toIp) {
        this.toIp = toIp;
    }

    /**
     * @return ���� type��
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            Ҫ���õ� type��
     */
    public void setType(String type) {
        this.type = type;
    }
}