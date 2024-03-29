package org.example.tca.vo;

import org.example.tca.api.Threshold;

import java.util.List;

public class ThresholdVO {

    private String objectType;
    private String tcaLabel;
    private int noOfRules;
    private List<RuleVO> rules;

    public ThresholdVO() {
    }

    public ThresholdVO(String objectType, String tcaLabel) {
        this.objectType = objectType;
        this.tcaLabel = tcaLabel;
    }

    public ThresholdVO(Threshold threshold) {
        this.objectType = threshold.getObjectType();
        this.tcaLabel = threshold.getTcaLabel();
        this.noOfRules = threshold.getRules() == null ? 0 : threshold.getRules().size();
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getTcaLabel() {
        return tcaLabel;
    }

    public void setTcaLabel(String tcaLabel) {
        this.tcaLabel = tcaLabel;
    }

    public int getNoOfRules() {
        return noOfRules;
    }

    public void setNoOfRules(int noOfRules) {
        this.noOfRules = noOfRules;
    }

    public List<RuleVO> getRules() {
        return rules;
    }

    public void setRules(List<RuleVO> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "ThresholdVO{" +
                "objectType='" + objectType + '\'' +
                ", tcaLabel='" + tcaLabel + '\'' +
                ", noOfRules=" + noOfRules +
                '}';
    }
}
