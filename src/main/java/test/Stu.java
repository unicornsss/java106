package test;

import java.io.Serializable;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 14:38
 */
//implements Serializable
public class Stu {
    private Integer otaId;
    private String names;

    public Stu(Integer otaId, String names) {
        this.otaId = otaId;
        this.names = names;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "otaId=" + otaId +
                ", names='" + names + '\'' +
                '}';
    }

    public Integer getOtaId() {
        return otaId;
    }

    public void setOtaId(Integer otaId) {
        this.otaId = otaId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
