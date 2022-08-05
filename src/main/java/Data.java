
public class Data {

    private String y;

    private String formattedValue;

    private String dt;

    @Override
    public String toString() {
        return "Total Distinct Addresses = '" + formattedValue + '\'' +
                ", Date = '" + dt + '\'' +
                ", Daily Increase = '" + newaddresscount + '\'';
    }

    private String newaddresscount;
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public Data withY(String y) {
        this.y = y;
        return this;
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public Data withFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
        return this;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Data withDt(String dt) {
        this.dt = dt;
        return this;
    }


    public String getNewaddresscount() {
        return newaddresscount;
    }

    public void setNewaddresscount(String newaddresscount) {
        this.newaddresscount = newaddresscount;
    }

    public Data withNewaddresscount(String newaddresscount) {
        this.newaddresscount = newaddresscount;
        return this;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    public Test withAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//        return this;
//    }

}