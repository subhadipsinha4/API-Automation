package model;

public class Pice_RequestBody {
        private String countryCode;
        private String number;
        private String otp;
        private String referralCode;
        private String campaignSource;

        // Getter and Setter for countryCode
        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        // Getter and Setter for number
        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        // Getter and Setter for otp
        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        // Getter and Setter for referralCode
        public String getReferralCode() {
            return referralCode;
        }

        public void setReferralCode(String referralCode) {
            this.referralCode = referralCode;
        }

        // Getter and Setter for campaignSource
        public String getCampaignSource() {
            return campaignSource;
        }

        public void setCampaignSource(String campaignSource) {
            this.campaignSource = campaignSource;
        }
}
