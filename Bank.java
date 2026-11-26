public class Bank {
    private String bankName;
    private String bankNum;
    private String bankAddress;

    public Bank(String bankName, String bankNum, String bankAddress) {
        this.bankName = bankName;
        this.bankNum = bankNum;
        this.bankAddress = bankAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }
}